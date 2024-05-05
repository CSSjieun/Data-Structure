# Java
Compiler: javac ____.java

## 데이터 타입 Data Type
### 1. 데이터의 크기

8 bit (비트) = 1 byte <br>
1024 bit = 1 kilobyte <br>
1024 kilobyte = 1 megabyte <br>
1024 megabyte = 1 gigabyte <br>
1024 gigabyte = 1 terabyte <br>
1024 terabyte = 1 petabyte <br>
1024 petabyte = 1 exabyte <br>
1024 exabyte = 1 zettabyte <br>

컴퓨터는 0과 1로 이루어졌다는 말을 들어본 적이 있을 것이다. <br>
0과 1이 bit다.

### 2. 형변환 Type Conversion
<img width="783" alt="Screenshot 2024-04-27 at 20 42 04" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/d4f7d45b-9f69-45cd-8264-86beebdd3258">

### 3. 연산자 Operator
대입 연산자 (x=1), 산술 Arithmetic 연산자 (+,-,...), 비교 연산자, 논리 연산자

이항 연산자 infix operator (좌항 + 우항)

단항 연산자: 예) +3: 양수 3, -3: 음수 3, 3++ (단항) = 3+1 (우항).

### 4. Boolean
참과 거짓을 의미하는 데이터 타입으로 bool이라고도 부른다. 

=: 좌항의 값을 우항의 변수에 대입할 때 사용하는 것 <br>
==: 같다.

.equals는 문자열을 비교할 때 사용하는 메소드이다.

a.equals(b);

String b = new String("Hello World");

### 5. 조건문 
1. if절
<img width="452" alt="Screenshot 2024-04-28 at 17 26 29" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/cbf1fd0e-db63-4c23-9e0f-cf84e7faae13">

2. elseif와 else
<img width="389" alt="Screenshot 2024-04-28 at 17 32 18" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/b515866e-c35e-4712-9edb-246254c3d505">

<img width="483" alt="Screenshot 2024-04-28 at 17 34 21" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/2f57c649-95a8-49b1-b123-e766102046b8">

3. Switch문 <br>
switch 문을 사용할 때 한가지 주의 할 것은 switch의 조건으로는 몇가지 제한된 데이터 타입만을 사용할 수 있다. byte, short, char, int, enum, String, Character, Byte, Short, Integer

### 6. 논리 연산자 Conditional Operator
AND / OR

Boolean and (&&) Boolean (전체가 참일때 참, 좌항 우항 둘 중 하나라도 거짓이면 거짓) <br>
Boolean or  Boolean (||) 둘 중 하나라도 참이면 참, 둘 다 거짓이면 거짓)


!true == not <br>
!false == true

### 7. 반복문 Loop, Iteration
1. while문 <br>
```java
while(조건){
  반복 실행 영역
} // 조건이 참일 동안 반복 실행 영역을 실행한다.
```

2. for문 <br>
```java
for(초기화; 종료조건; 반복실행){
    반복적으로 실행될 구문
}
```

### 8. 배열 Array
배열은 연관된 정보를 그룹핑 하는데 사용한다. 연관된 데이터를 모아서 관리하기 위해서 사용하는 데이터 타입이다. <br>
변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러 개의 데이터를 저장하기 위한 것이라고 할 수 있다. 

String[] classGroup에서 classGroup은 배열이 담길 변수의 이름이다. <br>
String[]은 classGroup에 담을 배열에 담길 데이터의 타입이 문자열의 배열이라는 의미다. <br>
배열을 선언할 때는 데이터 타입 뒤어 []를 붙여야 한다. <br>
[]이 없다면 classGroup은 배열이 아니라 문자열 데이터 타입을 갖는 변수가 된다. <br>

1. for-each 구문 <br>
for 구문을 좀 더 간편하게 사용하기 위해 만들어짐.

### 9. Method
main: 만들고 싶은 프로그램이 있다면 반드시 public static void main(String[] args)가 이끄는 중괄호 안에 실행되기를 기대하는 로직을 위치시켜야 한다.

자주 사용하는 로직을 메소드로 만들어두면 호출하는 것을 통해서 간편하게 로직을 재활용할 수 있다. 

메소드의 입력값은 매개변수(parameter)를 통해서 이루어진다. 

메소드 안에 고정적인 매개변수를 넣어놓고 가변적인 입력값을 통해서 결과값을 도출한다.

메소드의 출력값: return

### 10. 입력과 출력 I/O
예를 들어 사용자의 키보드, 마우스, 터치를 입력으로 받아들일 수 있고, 그에 따른 처리 결과를 모니터나 스피커등으로 출력 할 수 있다. <br>
입력 값이 없는 application은 input이 없는 method처럼 똑같은 결과를 반복하는 것에 불과하다. <br>
--> CLI (Command Line Interface)

GUI (Graphic User Interface) <br>

--> 절차 지향적 프로그래밍

앞으로는 객체 지향적 프로그래밍

### 11. 객체 지향 프로그래밍 Objectp-Oriented Programming 
객체 지향 프로그랭밍 Object-Oriented Programming (OOP)은 좀 더 나은 프로그램을 만들기 위한 프로그래밍 패러다임으로 로직을 **상태 state**와 **행위 behave**로 이루어진 객체로 만드는 것이다. <br>
이 객체들을 마치 레고 블럭처럼 조립해서 하나의 프로그램을 만드는 것이 객체지향 프로그래밍이라고 할 수 있다. <br>
다시 말해서 객체지향 프로그래밍은 객체를 만드는 것이다. <br>
따라서 객체지향 프로그래밍의 시작은 객체란 무엇인가를 이해하는 것이라고 할 수 있다. 

1. 문법적 접근 <br>
2. 설계적 접근: 현실에서 우리가 관심있는 특성 관점을 소프트웨어화 시켜서 해결하는 것이 프로그램. <br>
  Abstract 추상화: 해결해야할 문제 혹은 반영해야할 현실을 소프트웨어적으로 단순화 시켜서 만드는 행위 <br>
3. 부품화: 메소드를 생각해보면 메소드의 기본 취지는 연관되어 있는 로직들을 결합해서 메소드라는 완제품을 만드는 것이다. <br>
  그리고 이 메소드들을 부품으로 해서 하나의 완제품인 독립된 프로그램을 만드는 것이다. <br>
  메소드를 사용하면 코드의 양을 극적으로 줄일 수 있고, 메소드 별로 기능이 분류되어 있기 때문에 필요한 코드를 찾기도 쉽고 문제의 진단도 빨라진다.<br>
4. 은닉화, 캡슐화 <br>
  제대로 된 부품이라면 그것이 어떻게 만들어졌는지 모르는 사람도 그 부품을 사용하는 방법만 알면 쓸 수 있어야 한다. <br>
  이를 테면 모니터가 어떻게 동작하는지 몰라도 컴퓨터와 모니터를 연결하는 방법만 알면 화면을 표시할 수 있는것과 같은 이치이다. <br>
  즉 내부의 동작 방법을 단단한 케이스 (객체) 안으로 숨기고 사용자에게는 그 부품의 사용방법 (메소드) 만을 노출하고 있는 것이다. <br>
  이러한 컨셉을 정보의 은닉화 Inforamtion Hiding, 또는 캡슐화 Encapsulation 이라고 부른다. <br>
  자연스럽게 사용자에게는 그 부품을 사용하는 방법이 중요한 것이 된다.<br>
5. 인터페이스
  예를 들면 HDMI 케이블의 연결점은 특유의 생김새가 있다. <br>
  이러한 연결점을 인터페이스 Interface라고 한다. <br>
   만약 HDMI 케이블을 랜선을 연결하는 구멍에 연결하려고 한다면 동작하지 않을 뿐 아니라 연결 자체가 안된다. <br>
   인터페이스란 이질적인 것들이 결합하는 것을 막아주는 역할도 하는 것이다. <br>
   즉 인터페이스는 부품들 간의 약속이다.

### 12. 클래스 Class 와 인스턴스 Instance 그리고 객체 Object
Class : Object를 만들기 위한 설계도/ method의 정의 <br>
Instance: 제품/ method의 호출 (비유) 

### 13. 클래스 멤버와 인스턴스 멤버
클래스 변수의 용도 <br>
1. Instance에 따라서 변하지 않는 값이 피요한 경우 - static int base = 0;
   이런 경우 final을 이용해서 상수로 선언하는 것이 바람직 하지만 아직 final을 배우지 않았기 때문에 언급하지 않았다.<br>
2. 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
3. 값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우

### 14. 클래스 멤버, 인스턴스 멤버: 클래스 메소드
Class의 메소드는 class에 직접 접근해서 바로 메소드를 사용할 수 있다.

```java
예) Calculator c1 = new Calculator();
   c1.setOperands(10, 20);
   c1.sum();
   c1.avg();
```

   --> c1, c2... 이 각각 존재해야 하며, 그 instances 들에 각각 다른 결과값을 가져야 할 때 instance를 만든다.

하지만, 그럴 필요가 없을 때는 class의 method를 직접 사용할 수도 있다.

```java
예) public static void sum(int left, int right){
        System.out.println(left+right);
}

  public static main(String[] args){
      Calculator.sum(10, 20);

      Calculator.sum(20, 40);
  }
```

### 15. 클래스 멤버, 인스턴스 멤버: 타입별 비교
1. 인스턴스 메소드는 클래스 멤버에 접근 할 수 있다. (static이라는 키워드를 가지고 있지 않음)
2. 클래스 메소드는 인스턴스 멤버에 접근 할 수 없다. (static이라는 키워드를 가지고 있음)
   인스턴스 변수는 인스턴스가 만들어지면서 생성되는데, 클래스 메소드는 인스턴스가 생성되기 전에 만들어지기 때문에 클래스 메소드가 인스턴스 멤버에 접근하는 것은 존재하지 않는 인스턴스 변수에 접근하는 것과 같다.

용어<br>
- 인스턴스 변수 = Non-Static Field
- 클래스 변수 = Static Field

Field라는 것은 클래스 전역에서 접근 할 수 있는 변수를 의미하는데 이에 대한 자세한 내용은 유효범위 수업에서 알아본다.

### 16. 유효범위: 유효범위란?
유효범위 Scopte <br>
변수와 메소드 같은 것들을 사용할 수 있는 것은 이름이 있기 때문이다. <br>
아래 코드에서 left는 변수의 이름이고, sum은 메소드의 이름이다. 

```java
int left;
public void sum(){}
```
프로그램이 커지면 여러가 지유로 이름이 충돌하게 된다. 이를 해결하기 위해서 고안된 것이 유효범위이다.

특정한 메소드 안에서만 사용가능한 변수로 지정하는 것을 유효범위 (scope)라고 부른다.


80


   





























