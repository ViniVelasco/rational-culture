<p align="center">
  <img src="https://www.oliberal.com/image/contentid/policy:1.103017:1554043688/cd-tim-maia-racional-volume-1-remasterizado-D-NQ-NP-745624-MLB25869429471-082017-F.jpg?f=2x1&$p$f=904e4f9&w=1500&$w=f075b93" alt=Spring framework icon"/>
</p>

<h2><strong>This is a REST API. Read carefully to this instructions. YOU NEED TO HAVE LOMBOK SETUP TO RUN THIS PROJECT!</strong></h2>

<p><a href="https://projectlombok.org/setup/eclipse">Click here to read how to setup Lombok on Eclipse</a></p>
<p><a href="https://projectlombok.org/setup/intellij">Click here to read how to setup Lombok on IntelliJ</a></p>
<p><a href="https://projectlombok.org/setup/https://projectlombok.org/setup/overview">Click here to read how to setup Lombok on other IDE's</a></p>

<p>Change properties from: src/main/resources/application.properties 
  spring.datasource.username=yourdbusername
  spring.datasource.password=yourdbpassword
</p> 

## Web Service URL

<p><a href="localhost:8080/" target="_blank">localhost:8080</a></p>

## The Project
This is a restful webservice to solve problem proposed by your company.

## Routes

## Candidatos
## /candidatos (GET)
```
In this route you can acquire a all 'candidatos' subscribed in our system. You can paginate this using query param ?page=10?size=10
```

## Pontuações
## /pontuacoes (GET)
```
In this route you can acquire all candidatos score ordered by DESC.
```
