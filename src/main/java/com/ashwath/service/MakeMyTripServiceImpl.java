package com.ashwath.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.ashwath.binding.Passenger;
import com.ashwath.binding.Ticket;

import reactor.core.publisher.Mono;
@Service
public class MakeMyTripServiceImpl {

	public Mono<Ticket> bookTicket(Passenger p) {

		String apiUrl = "http://13.51.150.113:8080/ticket";
		
		WebClient webClient = WebClient.create();
		
	  	Mono<Ticket> bodyToMono = webClient.post()
								  		   .uri(apiUrl)
								  		   .body(BodyInserters.fromValue(p))
								  		   .retrieve()
								  		   .bodyToMono(Ticket.class);
		return bodyToMono;
	}

	public Mono<Ticket[]> getAllTickets() {

		String apiUrl = "http://13.51.150.113:8080/tickets";
		
		WebClient webClient = WebClient.create();
		
		Mono<Ticket[]> bodyToMono = webClient.get()
											 .uri(apiUrl)
											 .retrieve()
											 .bodyToMono(Ticket[].class);
		return bodyToMono;
	}

}
