import java.util.NoSuchElementException;
import linear.HashSet;
import linear.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        testSinglyLinkedList();
        testHashSet();
    }

    // SinglyLinkedList 테스트 메서드
    private static void testSinglyLinkedList() {
        System.out.println("### SinglyLinkedList 테스트 ###");
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println(">>> add() 테스트: 요소 'A', 'B', 'C' 추가");
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("리스트에 'A' 포함 여부: " + list.contains("A"));  // 기대: true
        System.out.println("리스트에 'B' 포함 여부: " + list.contains("B"));  // 기대: true
        System.out.println("리스트에 'C' 포함 여부: " + list.contains("C"));  // 기대: true
        System.out.println("리스트에 'D' 포함 여부 (없어야 함): " + list.contains("D"));  // 기대: false

        System.out.println("\n>>> remove() 테스트: 요소 'B' 삭제");
        list.remove("B");
        System.out.println("리스트에 'B' 포함 여부 (제거 후): " + list.contains("B"));  // 기대: false

        System.out.println("\n>>> 추가 테스트: 존재하지 않는 요소 'X' 삭제 시도");
        try {
            list.remove("X");
        } catch (NoSuchElementException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }

        System.out.println("\n>>> 최종 SinglyLinkedList 상태:");
        list.printList(); // 디버깅용 전체 리스트 출력
        System.out.println("========================================\n");
    }

    // HashSet 테스트 메서드
    private static void testHashSet() {
        System.out.println("### HashSet 테스트 ###");
        HashSet set = new HashSet();

        System.out.println(">>> add() 테스트: 요소 'A', 'B', 'C' 추가");
        set.add("A");
        set.add("B");
        set.add("C");
        // 중복 추가 시도: 'A'를 다시 추가해도 집합에는 하나만 있어야 함
        set.add("A");

        System.out.println("set에 'A' 포함 여부: " + set.contains("A"));  // 기대: true
        System.out.println("set에 'B' 포함 여부: " + set.contains("B"));  // 기대: true
        System.out.println("set에 'C' 포함 여부: " + set.contains("C"));  // 기대: true
        System.out.println("set에 'D' 포함 여부 (없어야 함): " + set.contains("D"));  // 기대: false

        System.out.println("\n>>> remove() 테스트: 요소 'B' 삭제");
        set.remove("B");
        System.out.println("set에 'B' 포함 여부 (제거 후): " + set.contains("B"));  // 기대: false

        System.out.println("\n>>> 추가 테스트: 존재하지 않는 요소 'X' 삭제 시도");
        try {
            set.remove("X");
        } catch (NoSuchElementException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }

        System.out.println("\n>>> 최종 MyHashSet 테스트 완료");
        System.out.println("========================================\n");
    }
}
