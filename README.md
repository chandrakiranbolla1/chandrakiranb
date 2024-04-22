## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).



docker uses
1. start a docker container using a single docker command (gets that package from internet and start using that command)
2. command is same for all os
3. command same for all services 
(for ex: docker run postgres) 
docker run redis
docker standerdizes process of running any service on any local dev envi
easy to run many versions of the same app without having any conflict (ex redis4.1,3.9,3.8)
https://www.youtube.com/watch?v=pg19Z8LL06w
tradational way --> jar file and server installation instructions
                    db service and how to config and setup on the server
  dev's send this to op's team and they would install and config apps and its dependecies

  dis advantages: install directly on the server's os
                    depedency version conflict
                    miscommunication                  
package all of the sourcecode, config, dependencies into a docker file and create a docker artifact and use it  

now with docker install docker runtime on server
run docker command to fetch and run docker artifacts 
