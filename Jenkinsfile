pipeline{
    agent any
    options {
        disableConcurrentBuilds()
        timeout(time: 1, unit: "HOURS")
    }
    environment {
        MVN_SETTING_PROVIDER = "3ec57b41-efe6-4628-a6c7-8be5f1c26d77"
    }
    stages {
        stage("Checkout") {
            steps {
                echo "Checkout"
            }
        }
        stage("Compile") {
            steps {
                configFileProvider([configFile(fileId: MVN_SETTING_PROVIDER, variable: "MAVEN_SETTINGS")]) {
                    echo "Compile module"
                    sh "mvn -s $MAVEN_SETTINGS clean compile"
                }
            }
        }
    }
    post{
        success {
            echo "======== pipeline executed successfully ========"
        }
        failure {
            echo "======== pipeline execution failed========"
        }
    }
}