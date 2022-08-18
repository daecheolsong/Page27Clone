# Page27 Clone Coding

## 🤲 프로젝트 소개
```
page 27 clone coding (벡엔드 중심)
```

> 구현 기능


<br>

## 👬 팀 소개

<table>
  <tr>
    <td>
        <a href="https://github.com/daecheolsong">
            <img src="https://mvp.microsoft.com/ko-kr/PublicProfile/Photo/21132" width="100px" />
        </a>
    </td>
  </tr>
  <tr>
    <td><b>dcs</b></td>
  </tr>
</table>

<br>

## 🛠 기술 스택

### BackEnd

<table>
  <tr>
    <td>
        <img src="https://images.velog.io/images/codemcd/post/131a0a54-437c-4acf-ba01-c8798c0b7628/Java_Logo.png" width="100px" />
    </td>
    <td>
        <img src="https://images.velog.io/images/courage331/post/1331631e-dbe9-4697-ad99-4521f4b04490/image.png" width="100px" />
    </td>
    <td>
        <img src="https://perfectacle.github.io/2017/08/02/Spring-boot-study-001day/thumb.png" width="100px" />
    </td>
    <td>
        <img src="https://dbdb.io/media/logos/h2-logo.svg" width="100px" />
    </td>
    <td>
        <img src="https://user-images.githubusercontent.com/55119239/74632964-ea430000-51a3-11ea-8e7d-a8ecb6402a86.png" width="100px" />
    </td>
    <td>
        <img src="https://blog.kakaocdn.net/dn/eVRvQn/btqEbu9rz8n/k7ea2jKIlA4koHgBVrlrT1/img.png" width="100px" />
    </td>
  </tr>
  <tr>
    <td><b>Java 11</b></td>
    <td><b>Gradle</b></td>
    <td><b>Spring Boot</b></td>
    <td><b>H2 database</b></td>
    <td><b>Spring Data JPA</b></td>
    <td><b>JUnit5 / Mockito</b></td>
  </tr>
</table>


<br>


## ✅ 어플리케이션 설정

### application.properties
``` properties
# live server
spring.devtools.livereload.enabled=true

spring.thymeleaf.check-template-location=true

# default -> resources/static
spring.mvc.static-path-pattern=/**

# database configuration
spring.datasource.url= jdbc:h2:tcp://localhost/~/project
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver

spring.jpa.hibernate.ddl-auto=create
```

-----------------------

## 📑 진행상황

* **22-08-18**
```
1. db연동 및 설정
2. 메인 캐러셀 itemIdx 서버에서 넘겨주기(/main/index.html)
```

---------------


## ❌ 이슈

 



