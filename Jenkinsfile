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
	  
	   stage('assigning permissions !') {
		   steps {
			   echo 'permissions process..' 
			   sh '''
			   cd ${WORKSPACE}/scripts/
			   chmod -R 755 ./
			   '''
		   }
	   }      
	  stage('Python') {
       when { expression {return (params.Language == 'Python' || params.Language == 'All') }
	   }
	   steps {
		    sh ''' echo "running python3 code" 
              cd ${WORKSPACE}/scripts
              ./python_script.py 
	      '''
	   }
		 
         }
      
      stage('C') {
	      when { expression {return (params.Language == 'C' || params.Language == 'All') }
	   }
         steps {
             sh ''' echo "running C code\n printing the ABC:\n"
	     cd ${WORKSPACE}/scripts
              gcc C_script.c -o runC.exe
	      ./runC.exe
	      '''
         }
      }
      stage('Bash') {
	      when { expression {return (params.Language == 'Bash' || params.Language == 'All') }
	   }
         steps {
            sh ''' echo "running bash code" 
              cd ${WORKSPACE}/scripts
              ./bash_script.sh 
	      '''
         }
      }
      stage('Java') {
	      when { expression {return (params.Language == 'Java' || params.Language == 'All') }
	   }
	      steps {
		      sh ''' echo "running java code" 
              cd ${WORKSPACE}/scripts
              javac Fibonacci.java
	      java Fibonacci	      
	     '''
            }
        }
    


      
      stage('Ruby') {
	      when { expression {return (params.Language == 'Ruby' || params.Language == 'All') }
	   }
         steps {
            sh ''' echo "running Ruby code" 
              cd ${WORKSPACE}/scripts
               ruby ruby_script.rb
	      '''
         }
      }
	      stage('Saving Results') {
         steps {
            echo 'Saving Results process..'
            sh '''
	      report_file="${HOME}/Documents/Deployment/report"
              mkdir -p ${HOME}/Documents/Deployment/              
              if [ -f "${report_file}" ]; then
                echo "file ${report_file} exists"
              else
	              touch ${report_file}
              fi              
              echo "Build Number $BUILD_NUMBER" >> ${report_file}
              
	      echo "#############################" >> ${report_file}
            '''
         }
      }
      
          
   
  }
  }
   

