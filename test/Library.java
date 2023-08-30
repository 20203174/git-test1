package test;

public class Library {
    private int size = 0;
    private String[] list;
    private int count;

    public Library(int size) {
        this.size = size;
        if (size <= 0)
            throw new IllegalArgumentException("도서관 크기는 1보다 작은 값을 넣을 수 없습니다");
        list = new String[size];
        count = 0;

        for (int i = 0; i < size; i++) {
            list[i] = "";
        }
    }

    public void add(String name) {
        if (count == size)
            throw new IllegalArgumentException("책장이 꽉 찼습니다. 책장을 비워주세요");
        for (int i = 0; i < count; i++) {
            if (list[i] == name) {
                throw new IllegalArgumentException("[" + name + "] 은 이미 있는 책입니다.");
            }
        }
        list[count] = name;
        count++;
        System.out.println("[" + name + "] 책을 추가했습니다.");
    }

    public void delete(String name) {
        if (count == 0)
            throw new IllegalArgumentException("책장이 비어 있어서 삭제가 불가능합니다.");
        for (int i = 0; i < count; i++) {
            if (list[i].equals(name)) {
                for (int j = 0; j < size; j++) {//j < list.length;
                    list[i] = list[i + 1];
                }
                list[list.length - 1] = "";
                count--;
                System.out.println("[" + name + "] 책을 제거했습니다.");
                return;
            }
        }
        throw new IllegalArgumentException("없는 [" + name + "] 책을 지울 수 없습니다.");
    }

    public void find(String name) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(name)) {
                System.out.println("책 검색 결과 : " + name);
                return;
            }
        }
        System.out.println("검색 결과가 없습니다.");
    }

    public void findAll() {
        System.out.println();
        System.out.println("모든 책 출력 : ");
        System.out.println("========================");
        for (int i = 0; i < count; i++) {
            System.out.println(i + " : " + list[i]);
        }
        System.out.println("========================");
        if (count == size)
            System.out.println("책장이 꽉 찼습니다. 책장을 비워주세요");

    }
}
