package com.poc.webscoket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessagingController {

	@MessageMapping("/Hai")
	@SendTo("/second/secondMessaging")
	public SecondMessage secondMessaging(FirstMessage msg) throws InterruptedException
	{
		System.out.println("getting in to call");
		Thread.sleep(1000);
		return new SecondMessage("palani, " + HtmlUtils.htmlEscape(msg.getName()) + "!");
	}
}
