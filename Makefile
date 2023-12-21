gradlew := $(if $(CI),./gradlew --console plain,./gradlew)

.PHONY: all
all:
	@more $(MAKEFILE_LIST)

.PHONY: clean
clean:
	$(gradlew) clean

.PHONY: lint
lint:
	$(gradlew) spotlessCheck

.PHONY: fmt
fmt:
	$(gradlew) spotlessApply

.PHONY: test
test:
	$(gradlew) test
