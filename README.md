# Mental Authentication

# Dependency
- Postgresql

### Run postgresql with docker 
<code>docker run --name cont_postgresql -itd -p 5432:5432 --restart always --env 'DB_NAME=authentication-dev,authentication-qa' --env 'DB_USER=dbuser' --env 'DB_PASS=12345' sameersbn/postgresql</code>


>Note: Locale makinenizi hem developer hem de qa makinesi olarak düşünebilirsiniz.
Qa makineniz varsa authentication-qa databasei oluşturmanıza gerek yok.

#### Environment
3 tane environmentimiz vardır. 
- [Default](src/main/resources/config/application-default.yml)
- [Quality Assurance](src/main/resources/config/application-qa.yml)
- [Production](src/main/resources/config/application-prod.yml)

# Build
Gradle build işlemi için

<code>gradlew build</code>

# Run

#### Gradle üzerinden run etmek için

<code>gradlew bootRun</code>

###### Environment
İstediğiniz environment için komutun sonuna -Dspring.profiles.active={profile-name} ekleyin.

Örneğin

<code>gradlew bootRun -Dspring.profiles.active=qa</code>


#### Java üzerinden run etmek için

<code>java -jar build/libs/authentication.jar</code>

###### Environment
İstediğiniz environment için komutun sonuna --spring.profiles.active={profile-name} ekleyin.

Örneğin

<code>java -jar build/libs/authentication.jar --spring.profiles.active=qa</code>


#Docker

##Build docker
Projeyi gradle ile build ettikten sonra docker 
imageini oluşturmak için docker build etmelisiniz.

<code>docker build -t mental/authentication .</code>

##Projeyi docker üzerinden run etmek

<code>docker run --name cont_authentication -p 8080:8080 --link cont_postgresql mental/authentication</code>


#Docker compose
