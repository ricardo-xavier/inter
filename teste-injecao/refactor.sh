clear
echo "PASSO1"
date
mvn install
JAR=`ls -ltr target/*.jar | tail -1 | awk '{print $NF}'`
cp $JAR original.jar

clear
echo "PASSO2"
date
java -jar refactor.jar
mvn install
JAR=`ls -ltr target/*.jar | tail -1 | awk '{print $NF}'`
cp $JAR refatorado.jar

clear
echo "PASSO3"
date
for BKP in `find . -name "*.java.bkp"`
do
    JAVA=`echo $BKP | sed -e s/.java.bkp/.java/g`
    mv $BKP $JAVA
done
mvn install
