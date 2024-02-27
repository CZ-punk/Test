package collection;

import java.util.ArrayList;

public class collection1 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("돼지");
        arr.add("개");
        arr.add("소");
        arr.add("말");
        arr.add("고양이");

        for (int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println("==================");

        for (String s : arr) {
            System.out.println(s);
        }
    }










    // collection: 자바에서 자료구조를 구현한 클래스

    /*

    < 자바 컬렉션 특징 >

    - 자료구조로는 list, stack, queue, set 등이 있다.
    - 요소의 개수에 따라 크기 자동 조절
    - 요소의 삽입, 삭제에 따른 요소의 위치 자동 이동
    - 고정 크기의 배열을 다루는 어려움 해소
    - 다양한 객체들의 삽입, 삭제, 검색 등의 관리 용이
    - <> 제네릭을 이용해 저장될 데이터의 자료형을 정할 수 있다.



    < 자바 컬렉션 리스트 >

    - ArrayList
    : 상당히 빠르고 크기를 마음대로 조절할 수 있는 배열

    - Vector
    : ArrayList의 구형 버전으로 모든 메소드가 동기화 되어있음
    (요즘은 대부분 ArrayList를 사용한다고 한다)

    - LinkedList
    : 목록 끝에 원소를 추가하거나 끝에 있는 원소를 쉽게 제거할 수 있는 메소드 제공
    스택, 큐, 양방향 큐 등을 만들기 위한 용도로 쓰임



    < 자바 컬렉션 셋 >

    - HashSet
    : 객체들이 순서 없이 저장되며 중복 저장하지 않음

    - TreeSet
    : 정렬방법을 설정할 수 있음



   < 자바 컬렉션 맵 >

   - HashMap
   : 키와 값의 쌍으로 구성되어 요소를 다루는 컬렉션, null 값이 올 수 있음

   - TreeMap
   : 정렬된 순서대로 키와 값을 저장하여 검색이 빠름



    < 자바 컬렉션 인터페이스에 선언된 추상 메서드 >

    - Boolean add(E e)
    : 객체를 collection 에 추가 한다.

    - void clear()
    : 현재 collection 에 있는 모든 객체를 제거 한다.

    - Boolean contains(Object o)
    : 현재 collection 에 인자로 전달된 객체가 있는 지 판별 한다.

    - Boolean is Empty()
    : 현재 collection 에 객체가 없는 지 판별 한다.

    - Iterator <E> iterator()
    : 현재 collection 의 객체를 iterator 로 반환 한다.

    - Boolean remove(Object o)
    : 현재 collection 에서 인자로 전달된 객체를 제거 한다.

    - int size()
    : 현재 collection 이 가지고 있는 객체 개수를 반환 한다.

    - Object[] to Array
    : 현재 collection 이 가지고 있는 객체를 배열로 만들어 반환 한다.


     */
}
