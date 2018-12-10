package com.akj.kotlinsample

import org.junit.Assert
import org.junit.Test

class KotlinTest {
    @Test
    fun test1() {
        Assert.assertEquals(4, 2 + 2)
    }

    @Test
    fun testGetterSetter() {

        // 코틀린의 Person 객체를 생성하고 이름을 "John" 으로 설정
        val person = Person("john")

        // 코틀린은 age 를 직접 사용해도 자동으로 setter 가 불린다.
        person.age = 20

        // 설정한 값이 정상적인지 테스트
        // 마찬가지로 직접 프로퍼티 접근해도 자동으로 getter 가 불린다.
        Assert.assertEquals(20, person.age)
        Assert.assertEquals("john", person.name)
    }

    @Test
    fun testSetNickname() {
        val person = Person("john")
        // 대문자가 포함된 문자열을 닉네임으로 설정해도 소문자로 저장한다.
        person.nickname = "Banana"
        // 대문자가 포함된 문자열이 소문자로 되었는지 확인
        Assert.assertEquals("banana", person.nickname)
    }

    @Test
    fun testUser() {
        val user = User()
        // 닉네임을 대소문자가 섞인 문자열로 설정
        user.nickname = "death Note"
        // 닉네임은 모두 대문자로 변경되어야 한다. 예상대로 변경되었는지 확인
        Assert.assertEquals("DEATH NOTE", user.nickname)

        println(user.httpText)
    }

    @Test
    fun testUserLazy() {
        val user = User()
        // 초기화 순서를 확인하기 위해 프린트를 추가
        println("not init")
        // 불리는 시점에는 초기화가 되어 NULL 이 아니게 된다.
        Assert.assertNotNull(user.httpText)
    }

    @Test
    fun testUserNameObservable() {
        val user = User()
        user.name = "john"
        user.name = "james"
    }

    @Test
    fun testAnimalByMap() {
        // Animal 객체를 생성할때 맵 객체를 넘긴다.
        val animal = Animal(mutableMapOf(
            "name" to "cat",
            "age" to 20)
        )

        // name 속성이 map 객체에 정상적으로 위임되었는지 확인
        Assert.assertEquals("cat", animal.name)
        // age 속성이 map 객체에 정상적으로 위임되었는지 확인
        Assert.assertEquals(20, animal.age)

        // 프로퍼티의 값을 변경한다.
        animal.age = 21
        animal.name = "dog"

        // map 의 값들이 바꼈는지 확인
        Assert.assertEquals("dog", animal.map["name"])
        Assert.assertEquals(21, animal.map["age"])
    }

    @Test
    fun testFruit() {
        // 객체의 속성 값을 같도록 Fruit 객체 2개 생성
        val fruit1 = Fruit("바나나", "바나나 길어")
        val fruit2 = Fruit("바나나", "바나나 길어")

        // 각각 프린트한다. toString() 메소드가 호출된다.
        println(fruit1)
        println(fruit2)

        // 두 객체가 같은지 비교한다. equals() 호출됨.
        Assert.assertEquals(fruit1, fruit2)

        // 두 객체의 해시코드가 같은지 비교한다.
        Assert.assertEquals(fruit1.hashCode(), fruit2.hashCode())
    }
}