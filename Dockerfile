FROM openjdk:14
COPY ./src app
WORKDIR /app
RUN javac MainProgram.java
ENTRYPOINT [ "java", "MainProgram" ]
