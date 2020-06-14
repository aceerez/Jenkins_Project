  
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
     
    
     stage ('Test 3: Master') {
        when { branch 'master' }
          steps { 
        echo 'I only execute on the master branch.' 
    }
}
      stage('Python') {
        steps { 
          echo 'C code'
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
}
