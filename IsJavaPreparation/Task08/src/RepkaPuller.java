public class RepkaPuller implements Comparable<RepkaPuller>{
    String name;
    int order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int compareTo(RepkaPuller member) {
        return this.getOrder() - member.getOrder();
    }
}
