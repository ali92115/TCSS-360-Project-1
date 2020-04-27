FROM openjdk:14
COPY ./src app
WORKDIR /app
RUN javac Program.java
ENTRYPOINT [ "java", "Program" ]
