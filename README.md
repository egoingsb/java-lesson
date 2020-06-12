# 자바 핵

## 자바 및 개발환경설치
검색어 : download java sdk, download eclipse

## 자바실행
Hello World를 화면에 출력해봅니다.
  
[HelloWorld.java](src/HelloWorld.java)

## 자바의 동작원리
원인과 결과를 이해합니다.  
<img src="keynote/keynote.003.jpeg" width="100%">  
실행과 컴파일의 과정을 이해합니다.  
<img src="keynote/keynote.005.jpeg" width="100%">  

## 자바로 할 수 있는 일들

### 데스크탑 앱

[프로젝트 : HelloWorldGUIApp.java](src/HelloWorldGUIApp.java)  

[동영상](https://opentutorials.org/course/3930/26654)


### 사물인터넷 

[동영상](https://opentutorials.org/course/3930/26655)


### 안드로이드 

[동영상](https://opentutorials.org/course/3930/26656)

## 프로젝트 소개
거래를 기록하고 계산해주는 앱을 만들고 싶습니다.  
핵심 계산식을 만들어봅니다.  
이것에 여러가지 기능을 붙여가면서 고도로 복잡한 앱이 만들어지는 과정을 살펴볼 것입니다.  

[프로젝트 : Account.java](src/Account.java)

## 데이터 타입 (숫자 & 문자열)
데이터 타입에 따라서 데이터를 처리하는 방법이 달라지기 때문에 프로그래밍 언어는 데이터 타입을 구분합니다. 그렇기 때문에 우리의 공부 방향은 데이터타입들의 종류를 알고, 종류별로 어떤 처리 방법이 있는지를 알아가는 과정이라고 할 수 있습니다.  

[문법 : DataTypeStringNumber.java](src/DataTypeStringNumber.java)

<img src="keynote/keynote.007.jpeg" width="100%">  

## 변수
변수는 데이터에 이름을 붙이는 행위입니다. 이를 통해서 데이터를 코드 내에서 더욱 잘 이용해 수 있게 되고, 유지보수하기 편리한 코드를 만들 수 있습니다. 자바에서는 엄격하게 변수의 데이터타입을 강제함으로서 사용할 때는 조금 불편하지만 데이터를 꺼낼 때는 담겨 있는 데이터타입을 확신할 수 있기 때문에 규모있는 프로젝트에 적합한 언어입니다.  

[문법 : Variable.java](src/Variable.java) 

[프로젝트 : AccountAddVariable.java](src/AccountAddVariable.java) | <a href="https://egoing.github.io/remote-diff/?right=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FAccount.java&left=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FAccountAddVariable.java" target="_blank">비교</a>  
<img src="keynote/keynote.008.jpeg" width="100%">

## 프로그램, 프로그래밍, 프로그래머
프로그램이 시간의 순서에 따라서 일어나야 하는 일을 설계하는 작업임을 이해하고, 이것이 얼마나 혁명적인 발상의 전환이었는지 생각해봅니다.

<img src="keynote/keynote.009.jpeg" width="100%">  

## 입력과 출력
프로그래밍은 입력 => 처리 => 출력으로 이루어져 있는 도구입니다. 입력에 따라서 다르게 동작하는 프로그램을 만들어봅시다. 

[문법 : InputOutput.java](src/InputOutput.java)  

[프로젝트 : AccountAddInputOutput.java](src/AccountAddInputOutput.java) | [비교](https://egoing.github.io/remote-diff/?right=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FAccountAddVariable.java&left=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FAccountAddInputOutput.java)

[문법 : 파일로 데이터를 출력하는 방법을 소개합니다 : OutputFile.java](src/OutputFile.java)

[프로젝트 : 파일로 출력하는 기능을 추가합니다. : AccountAddOutputFile.java](src/AccountAddOutputFile.java) | [비교](https://egoing.github.io/remote-diff/?right=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FAccountAddInputOutput.java&left=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FAccountAddOutputFile.java)

<img src="keynote/keynote.010.jpeg" width="100%">

## 직접 컴파일 & 실행
컴파일과 실행을 직접해봅시다.  

### 목표
1. java와 javac가 물리적으로 위치하는 디렉토리를 확인합니다.
2. 어디에서 실행해도 java가 실행되는 이유를 확인합니다. => path 환경변수의 이해
3. 컴파일을 하고 실행하는 방법을 이해합니다. 
4. 파라미터를 명령어로 전달하는 방법을 이해합니다. 

#### compile
소스코드가 ~/dev/eclipse-workspace/Java-Lesson-Example/src/에 위치하고 현재 디렉토리로 클래스 파일을 생성하고 싶을 때

```bash
javac ~/dev/eclipse-workspace/Java-Lesson-Example/src/AccountAddOutputFile.java -d .
```

#### run

AccountAddOutputFile.class가 위치하고 있는 곳에서 AccountAddOutputFile.class를 실행할 때 

```bash
java AccountAddOutputFile 10000
```

AccountAddOutputFile.class가 ../temp/AccountAddOutputFile.class에 존재할 때 AccountAddOutputFile.class를 실행하기

```bash
java -cp ../temp/ AccountAddOutputFile 100000
```

## 이클립스 디버거

디버거를 통해서 문제에 더 가깝게 다가가는 방법을 익힙니다.

## 문서 찾아보기

Application의 개념에 대해서 알아봅니다. API의 개념을 이해하고 공식 api 문서를 보는 법을 익힙니다.  

Math의 기능을 찾는 검색어 : java api Math  

<img src="keynote/keynote.011.jpeg" width="100%">

## 혁명의 끝 혁신의 시작
지금까지 배운 것이 혁명적인 것이고, 혁명적인 것은 그것만으로도 할 수 있는 것이 정말 많으면서, 앞으로 나오게 될 혁신적인 것들은 결국 혁명적인 것을 보완하기 위한 것이라는 점을 생각해봅니다. 

# 제어문
시간의 순서에 따라서 실행되는 프로그래밍의 세계를 다시 한번 도약하게 한 거대한 혁신인 제어문에 대해서 살펴보겠습니다. 

## Boolean
Boolean 데이터 타입은 true, false 로 이루어진 미니 데이터 타입입니다. 판단, 결정과 같은 일을 할 때 사용됩니다. 

[문법 : Boolean.java](src/Boolean.java)


## 비교 연산자
블리언이 만들어지는 연산자인 비교연산자에 대해서 알아봅니다. 
원시 데이터 타입은 ==를 이용해서 비교하고 원시 데이터 타입이 아닌 객체의 경우는 equals를 사용합니다. 
==는 데이터가 소재하고 있는 주소가 같은지 비교하는 것이고, equals는 객체에 있는 데이터가 실제로 같은지를 비교하는 것입니다.  

[문법 : Comparison](src/Comparison.java)

<img src="keynote/keynote.012.jpeg" width="100%">

<img src="keynote/keynote.013.jpeg" width="100%">


## 조건문
조건에 따라서 다른 순서로 프로그램이 실행되도록 제어하는 것이 조건문입니다. 조건문을 통해서 여러가지 모습을 기능을 가진 하나의 프로그램을 만들 수 있습니다.  

[문법 : Conditional.java](Conditional.java)  

<img src="keynote/keynote.014.jpeg" width="100%">

[프로젝트 : 로그인 앱을 만들어봅시다. LoginApp.java](src/LoginApp.java)

## 논리 연산자 
논리 연산자는 조건을 결합해서 하나의 조건으로 만드는 연산자로 자연어에서는 '그리고', '또는'에 해당합니다.  

<img src="keynote/keynote.015.jpeg" width="100%">

[문법 : LogicalOperator.java](src/LogicalOperator.java)

[프로젝트 : 로그인 앱에 논리 연산자를 추가해서 코드를 간결하게 만들어보기 : LoginAppAddLogical.java](src/LoginAppAddLogical.java) | [비교](https://egoing.github.io/remote-diff/?right=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FLoginApp.java&left=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FLoginAppAddLogical.java)

논리 연산자를 적용해서 회계 시스템을 개선해봅시다. 1만원 보다 수입이 적은 경우는 부가세를 내지 않아도 되야 한다면 어떻게 개선할 수 있을까요? 쉬운 방법은 두개의 프로그램을 만들면 됩니다. 하지만 조건문을 이용하면 하나의 프로그램을 이용해서 해결할 수 있습니다. 

[AccountAddConditional.java](src/AccountAddConditional.java) | [비교](https://egoing.github.io/remote-diff/?left=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FAccountAddConditional.java&right=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FAccountAddOutputFile.java)

## 배열
서로 연관된 복수의 데이터가 있을 때 이 데이터들을 효과적으로 관리하기 위한 정리정돈의 도구가 배열과 콜렉션 프래임워크 입니다. 

[문법 : ArrayApp.java](src/ArrayApp.java)

배열은 배열 자체로 쓰이기 보다는 반복문과 함께 사용되는 경우가 많습니다. 

## 반복문
반복적인 작업을 처리하는 기능입니다. 블리언과 비교연산자가 기반이 되고, 배열, 콜렉션 프래임워크와 단짝으로 사용됩니다. 

[문법 : LoopApp.java](src/LoopApp.java)

[프로젝트 : 반복문의 도입으로 동업자를 관리 : AccountAddLoop.java](src/AccountAddLoop.java) | [비교](https://egoing.github.io/remote-diff/?left=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FAccountAddConditional.java&right=https%3A%2F%2Fraw.githubusercontent.com%2Fegoingsb%2Fjava-lesson-example%2Fmaster%2Fsrc%2FAccountAddLoop.java)