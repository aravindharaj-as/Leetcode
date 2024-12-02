# Variables

# Source Path
SOURCE_DIR = ../../..
# Class Path
CLASS_DIR = $(SOURCE_DIR)/DSA/classes
# Main Class
MAIN_CLASS = DSA.ArraysAndStrings.LongestCommonPrefix.LongestCommonPrefix
# Main Source
MAIN_SOURCE = $(SOURCE_DIR)/$(subst .,/,$(MAIN_CLASS)).java

# Command to compile
compile:
	@echo "Compiling $(MAIN_CLASS) and its dependencies..."
	javac -d $(CLASS_DIR) -sourcepath $(SOURCE_DIR) -cp $(CLASS_DIR) $(MAIN_SOURCE)

# Command to run
run: compile
	@echo "Running $(MAIN_CLASS)..."
	java -cp $(CLASS_DIR) $(MAIN_CLASS)

# Command to clean
clean:
	@echo "Cleaning up compiled files for $(MAIN_CLASS)..."
	find $(CLASS_DIR) -name "*.class" -delete