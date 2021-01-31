pipeline {
   agent any
   stage('Checkout external proj') {
        steps {
            git branch: 'master',
                credentialsId: 'git_credentail',
                url: 'https://github.com/hokkkk/mg-gate.git'
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

     stage ('Testing Stage') {

         steps {
             with(maven : 'maven_3_5_0') {
                 sh 'mvn test'
             }
         }
     }


     stage ('Deployment Stage') {
         steps {
                 withMaven(maven : 'maven_3_5_0') {
                     sh 'mvn deploy'
                 }
             }
         }
     }
}