package lambdaprimitives;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SportGadgetStore {

    private List<Product> products = new ArrayList<>();

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public int getNumberOfProducts() {
        return products.stream()
                .reduce(0, (acc, actual) -> acc + actual.getPcs(), Integer::sum);
    }

    public double getAveragePrice() {
        if (products.isEmpty()) {
            return 0;
        }
        return products.stream()
                .mapToDouble(x -> x.getPrice())
                .average()
                .getAsDouble();
    }

    public String getExpensiveProductStatistics(double minPrice) {
        int productTypes = 0;
        String template = "Összesen %s féle termék, amelyekből minimum %s db, maximum %s db, összesen %s db van.";
        List<Integer> stat = products.stream()
                .filter(product -> product.getPrice() > minPrice)
                .map(product -> product.getPcs())
                .collect(Collectors.toList());

        IntSummaryStatistics iss = stat.stream().mapToInt(x -> x).summaryStatistics();

        if (stat.isEmpty()) {
            return "Nincs ilyen termék.";
        }
        return String.format(template, iss.getCount(), iss.getMin(), iss.getMax(), iss.getSum());
    }
}
