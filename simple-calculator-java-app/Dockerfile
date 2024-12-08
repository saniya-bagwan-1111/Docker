FROM openjdk:17-jdk-alpine

WORKDIR /app-img-calc 
#Calculator.java
COPY src/Calculator.java /app-img-calc/Calculator.java

RUN javac Calculator.java

CMD ["java","Calculator"]
