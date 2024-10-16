# Approach

- Run a Gradle build locally to download all dependencies
- Create a Docker image with the Gradle cache
- Run the build on the Docker image

# Instructions

## Step 1: Setup a custom GRADLE_USER_HOME

```bash
rm -rf gradle-user-home
mkdir -p gradle-user-home/develocity
cp $HOME/.gradle/develocity/keys.properties gradle-user-home/develocity
```

# Step 2: Run the full Gradle build to download all dependencies

```bash
export GRADLE_USER_HOME=$(pwd)/gradle-user-home
./gradlew build
```

# Step 3: Create the image

```bash
docker build -t docker-cache-image .
```

# Step 4: Run the build on the image

```bash
docker run --rm -v "$HOME/.gradle/develocity":/gradle-user-home/develocity -v "$(pwd)":/build docker-cache-image ./gradlew build
```