package timesheet;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    private List<TimeSheetItem> timeSheetItems = new ArrayList<>();
    private final Path file = Path.of("calculatedReport.txt");

    public Company(InputStream employeesFile, InputStream projectsFile) {
        parameterIsNotNull(employeesFile);
        parameterIsNotNull(projectsFile);
        employeeReader(employeesFile);
        projectReader(projectsFile);
    }

    public void printToFile(String name, int year, int month, Path file) {
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))) {
            StringBuilder sb = new StringBuilder();
            int sumWorkHours = 0;
            sb.append(name + "\t");
            sb.append(YearMonth.of(year, month));
            for (ReportLine report : calculateProjectByNameYearMonth(name, year, month)) {
                if (report.getTime() > 0) {
                    sb.append("\n" + report.getProject().getName());
                    sb.append("\t" + report.getTime());
                    sumWorkHours += report.getTime();
                }
            }
            sb.insert(sb.indexOf("\n"), "\t" + sumWorkHours);
            pw.print(sb.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<ReportLine> calculateProjectByNameYearMonth(String name, int year, int month) {
        List<ReportLine> report = new ArrayList<>(initReportLineList());
        boolean isInvalidName = true;
        for (TimeSheetItem timeSheetItem : timeSheetItems) {
          if (timeSheetItem.getEmployee().getName().equals(name) && timeSheetItem.getBeginDate().getYear() == year && timeSheetItem.getBeginDate().getMonthValue() == month) {
              isInvalidName = false;
              int index = projects.indexOf(new Project(timeSheetItem.getProject().getName()));
              report.get(index).addTime(timeSheetItem.hoursBetweenDates());
          }
        }
        if (isInvalidName) {
            throw new IllegalArgumentException("Invalid name");
        }
        return report;
    }

    private List<ReportLine> initReportLineList() {
        List<ReportLine> initReports = new ArrayList<>(projects.size());
        for (int i = 0; i < projects.size(); i++) {
            initReports.add(new ReportLine(projects.get(i), 0));
        }
        return initReports;
    }

    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
        timeSheetItems.add(new TimeSheetItem(employee, project, beginDate, endDate));
    }

    private void employeeReader(InputStream is) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while((line = br.readLine()) != null) {
                String firstname = line.split(" ")[0];
                String lastname = line.split(" ")[1];
                employees.add(new Employee(firstname, lastname));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, ", ioe);
        }
    }

    private void projectReader(InputStream is) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while((line = br.readLine()) != null) {
                projects.add(new Project(line));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, ", ioe);
        }
    }

    private void parameterIsNotNull(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("Parameter is null");
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public List<Project> getProjects() {
        return new ArrayList<>(projects);
    }
}
