RANDOOP="https://github.com/randoop/randoop.git"  # Repository URL.
RSHA="28b8b10163b2d9dcd786b5276a3c4ff2f977302e"   # Commit ID.
RANDOOP_DIR="randoop"                             # Randoop source directory.
RANDOOP_JAR="randoop-all-3.0.3.jar"               # Randoop-all jar file.
TIME="30"                                         # Generation time.
OUTPUT_DIR="rgts"                                 # Output directory -> Randomly Generated Tests (rgts).
TESTS_PER_FILE="50"                               # Maximum number of tests to write to each JUnit file.

# Do not clone randoop if it already exists.
if [ ! -d ${RANDOOP_DIR} ]; then
        git clone ${RANDOOP}
fi

# Remove tests generated from the previous run.
if [ -d ${OUTPUT_DIR} ]; then
        rm -rf "${OUTPUT_DIR}"
fi

# Temporarily change directory, checkout the correct SHA, build the randoop-all jar file and copy it in the root directory.
(
	cd ${RANDOOP_DIR}
	git checkout ${RSHA}
	./gradlew clean singleJar
	cp "build/libs/${RANDOOP_JAR}" ..
)

# Generate tests.
java -classpath "${RANDOOP_JAR}" randoop.main.Main gentests --classlist=classes.txt --timelimit="${TIME}" --junit-output-dir="${OUTPUT_DIR}" --testsperfile="${TESTS_PER_FILE}"