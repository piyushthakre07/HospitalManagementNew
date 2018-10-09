package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Coin;

@RestController
public class CoinController {

	@PostMapping("/api/addCoin")
	//@CrossOrigin(allowedHeaders="*")
	public ResponseEntity<String> addCoin(@RequestBody Coin coin) {
		System.out.println(coin.getCoinName() +" >>> "+ coin.getCoinPrice());
		return new ResponseEntity<String>("\"Success1\"", HttpStatus.OK);
	}
}
