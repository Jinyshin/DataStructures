import linear.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        // SinglyLinkedList 인스턴스 생성
        SinglyLinkedList list = new SinglyLinkedList();

        // === 테스트 1: add() 메서드 동작 확인 ===
        System.out.println(">>> add() 테스트: 요소 'A', 'B', 'C' 추가");
        list.add("A");
        list.add("B");
        list.add("C");

        // add 후 contains()로 추가된 요소들이 있는지 확인
        System.out.println("리스트에 'A' 포함 여부: " + list.contains("A"));  // 기대: true
        System.out.println("리스트에 'B' 포함 여부: " + list.contains("B"));  // 기대: true
        System.out.println("리스트에 'C' 포함 여부: " + list.contains("C"));  // 기대: true
        System.out.println("리스트에 'D' 포함 여부 (없어야 함): " + list.contains("D"));  // 기대: false

        // === 테스트 2: remove() 메서드 동작 확인 ===
        System.out.println("\n>>> remove() 테스트: 요소 'B' 삭제");
        list.remove("B");

        // remove 후 contains()로 'B'가 제거되었는지 확인
        System.out.println("리스트에 'B' 포함 여부 (제거 후): " + list.contains("B"));  // 기대: false

        // 추가적인 테스트: 없는 요소 삭제 시도 등
        System.out.println("\n>>> 추가 테스트: 존재하지 않는 요소 'X' 삭제 시도");
        list.remove("X");  // 구현에 따라 에러 없이 무시하거나 별도의 처리를 해야 함

        // 최종 상태 확인 (구현에 따라 리스트의 내용을 출력하는 메서드를 추가하면 좋음)
        System.out.println("\n>>> 최종 테스트 완료");
    }
}
