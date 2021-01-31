pipeline {
   agent any
   stage('Checkout external proj') {
        steps {
            git branch: 'master',
                credentialsId: 'git_credentail',
                url: 'https://github.com/hokkkk/my-pipeline.git'
        }

    }
   stages {
         stage ('Compile Stage') {

             steps {
                 withMaven(maven : 'maven_3_5_0') {
                     sh 'mvn clean compile'
                 }
         }
     }

     stage ('Running Stage') {
         steps {
                 withMaven(maven : 'maven_3_5_0') {
                     sh 'mvn spring-boot:run'
                 }
             }
         }
     }
}