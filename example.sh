RANDOOP="https://github.com/randoop/randoop.git"
RSHA="28b8b10163b2d9dcd786b5276a3c4ff2f977302e"
RANDOOP_DIR="randoop"
RANDOOP_JAR="randoop-all-3.0.3.jar"
TIME="30"
OUTPUT_DIR="rgts"

rm -f RegressionTest*.java

if [ ! -d ${RANDOOP_DIR} ]; then
        git clone ${RANDOOP}
fi

if [ -d ${OUTPUT_DIR} ]; then
        rm -rf "${OUTPUT_DIR}"
fi

(
	cd ${RANDOOP_DIR}
	git checkout ${RSHA}
	./gradlew clean singleJar
	cp "build/libs/${RANDOOP_JAR}" ..
)

java -classpath "${RANDOOP_JAR}" randoop.main.Main gentests --classlist=classes.txt --timelimit="${TIME}" --junit-output-dir="${OUTPUT_DIR}"