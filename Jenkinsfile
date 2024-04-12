pipeline {
    agent any
    stages {
        stage('instituicao interface') {
            steps {
                build job: 'instituicao', wait: true
            }
        }
      
        stage('build instituicao') { 
            steps {
                sh 'mvn clean package'
            }
        }      
        stage('build image instituicao') {
            steps {
                script {
                    account = docker.build("fernandowi55/instituicao:${env.BUILD_ID}", "-f Dockerfile .")
                }
            }
        }
        stage('push image instituicao') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub-credential') {
                        account.push("latest")
                        account.push("${env.BUILD_ID}")
                       
                    }
                }
            }
        }

        
    }
}