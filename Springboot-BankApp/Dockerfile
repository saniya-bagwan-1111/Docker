#---------MutiStage Stage 1----

#pull base image of java maven 
FROM maven:3.8.3-openjdk-17 as builder

#working dir where jar file and code file will be store
WORKDIR /bankapp

#copy all code from host to container
COPY . /bankapp

#buld app to genertae jar file
RUN mvn clean install -DskipTests=true
#only form maven above image used otehr below j=image used
#----------------Stage 2--------------
#using stage 2 we can use stage 1 using name builder means multi stage
# craeting smal size image- stage used for creating maven jar file and stage used for doing other java task and cpoying above jar into stage 2
FROM openjdk:17-alpine

WORKDIR /app
#copying bulder jar file to current folder app target. In cmd * used beacuse in properties of src if some one renamed jar file then also we can pisk that jar
COPY --from=builder /bankapp/target/*.jar /app/target/bankapp.jar

#expose post so that port can be mapped with host  port
EXPOSE 8080

#execuate jar file using jar file and -jar flag to specify we are executing jar file
ENTRYPOINT ["java","-jar","/app/target/bankapp.jar"]
#now jar present in /app/target file 
