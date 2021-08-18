package com.example.hajiboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 1.3.3の内容

// @SpringBootApplicationによって様々な設定が自動的に有効になる
@SpringBootApplication
// このクラスがWebアプリのコントローラクラスだと示す
@RestController
public class HajibootApplication {

	// Getメソッドで受け付けるメソッドだと示す
	// ここでは「/」というパスならhomeメソッドが呼ばれるということ
	@GetMapping("/")
	public String home() {
		// @RestControllerのメソッドで文字列を返したら、文字列がそのままHTTPレスポンスとなる
		return "ZZZZZZZZZZZZZZZZ";
	}

	public static void main(String[] args) {
		// Spring Bootアプリケーションを実行するための処理をmainメソッド内に記述する
		SpringApplication.run(HajibootApplication.class, args);
	}
}
