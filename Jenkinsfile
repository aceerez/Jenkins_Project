  
pipeline {
  agent { node { label 'slave01' } }

   stages {
      stage('Clone Sources') {
        steps {
          checkout scm
        } 
      }
     stage('Selected language') {
         steps {
            echo "You choose to code in ${Language}"
         }
      }
      stage('Build') {
         steps {
         }
      }
      stage('Python') {
        steps { 
           script {
            if (${Language} == 'all'){
                echo 'python code'
        }
             else {echo "bye"
               brack 
              }
         }
      }
      stage('C') {
         steps {
            echo 'C code'
         }
      }
      stage('Bash') {
         steps {
            echo 'Bash code'
         }
      }
      stage('Java') {
         steps {
            echo 'Java code'
         }
      }
      stage('C#') {
         steps {
            echo 'C# code'
         }
      }
      
   }
}
