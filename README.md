# Page27 Clone Coding

## 🤲 프로젝트 소개
```
page 27 clone coding (벡엔드 중심)
```

> 구현 기능


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
        <img src="https://miro.medium.com/max/658/1*Ok6oJjpnrroklRhRiL6l3w.png" width="100px" />
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
    <td><b>Spring DataJPA/<br>QueryDSL</b></td>
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

### build.gradle
```groovy
plugins {
    id 'org.springframework.boot' version '2.7.2'
    id 'io.spring.dependency-management' version '1.0.12.RELEASE'
    id 'java'
    // querydsl plugin
    id 'com.ewerk.gradle.plugins.querydsl' version '1.0.10'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

configurations {
    compileOnly {
        extendsFrom annotationProcessor
    }
}

repositories {
    mavenCentral()
}

dependencies {

    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
    implementation 'org.springframework.boot:spring-boot-starter-web'

    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    runtimeOnly 'com.h2database:h2'
    implementation 'com.github.gavlyukovskiy:p6spy-spring-boot-starter:1.5.6'
    // querydsl
    /*
    인텔리제이 2020.X 사용시: 그레이들 annotationProcessor 사용
     */
    implementation 'com.querydsl:querydsl-jpa'
    implementation 'com.querydsl:querydsl-core'

    annotationProcessor("com.querydsl:querydsl-apt:${dependencyManagement.importedProperties['querydsl.version']}:jpa") // querydsl JPAAnnotationProcessor 사용 지정
    annotationProcessor "jakarta.persistence:jakarta.persistence-api"// java.lang.NoClassDefFoundError(javax.annotation.Entity) 발생 대응
    annotationProcessor "jakarta.annotation:jakarta.annotation-api" // java.lang.NoClassDefFoundError (javax.annotation.Generated) 발생 대응

    // 스프링 시큐리티 통합 모듈 사용 in thymeleaf
//    implementation 'org.thymeleaf.extras::thymeleaf-extras-springsecurity5'
    compileOnly 'org.projectlombok:lombok'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
//    testImplementation 'org.springframework.security:spring-security-test'
}

tasks.named('test') {
    useJUnitPlatform()
}

// clean 태스크와 cleanGeneatedDir 태스크 중 취향에 따라서 선택하세요.
/** clean 태스크 실행시 QClass 삭제 */
clean {
    delete file('src/main/generated') // 인텔리제이 Annotation processor 생성물 생성위치
}

/**
 * 인텔리제이 Annotation processor 에 생성되는 'src/main/generated' 디렉터리 삭제
 */
task cleanGeneatedDir(type: Delete) { // 인텔리제이 annotation processor 가 생성한 Q클래스가 clean 태스크로 삭제되는 게 불편하다면 둘 중에 하나를 선택
    delete file('src/main/generated')
}

```

-----------------------

## 📑 진행상황

* **22-08-18**

```
1. db연동 및 설정
2. 메인 캐러셀 itemIdx 서버에서 넘겨주기(/main/index.html)
3. MainCarousel 클래스 (test data) 추가
```

* **22-08-19**
```
1. gradle querydsl annotation processor 사용하여 설정
2. MainCarousel -> IndexInit으로 변경(+ weeklyBestItem test data 추가)
3. orderList 서버에서 넘겨주기(/main/index.html)
 - WeeklyBestDto로 넘겨줌 
```


* **22-08-20**
```
1. IndexInit 완성(/main/index test data)
    - weeklyBestDto
        - weeklyBestOuterItem
        - weeklyBestShoesItem
        - weeklyBestSleeveItem
        - weeklyBestShirtsItem
        - weeklyBestBottomItem
        - weeklyBestKnitItem
2. /main/index 완성
    - weeklyBestDto 를 통해 조회
```


---------------


## ❌ 이슈

 



