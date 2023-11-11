# 로또
### 1단계 - 문자열 계산기
- [x] 사용자가 입력한 문자열을 공백으로 분리한다.
- [x] 사용자가 입력한 문자열의 요소가 공백이면 예외를 던진다.
- [x] 사용자가 입력한 문자열의 숫자 자리가 실수가 아닌 경우 예외를 던진다.
- [x] 사용자가 입력한 문자열의 연산 기호 자리가 (+, -, *, /)가 아닌 경우 예외를 던진다.
- [x] 사용자가 입력한 문자열을 사칙연산 한다.
- [x] 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정한다.
- [x] 나머지 연산의 경우 소수점 셋째자리에서 반올림한다.
- [x] 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다.
- [ ] 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정한다.(없는 경우는 시간남으면 진행시켜)
- [ ] 분리된 문자열의 자리수가 16자리(23.99999999999999 or 234.9999999999999)를 초과하는 경우 예외를 던진다.(정확도의 문제) -> 가장 마지막에
