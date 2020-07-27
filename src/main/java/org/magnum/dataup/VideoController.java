
package org.magnum.dataup;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.magnum.dataup.model.Video;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VideoController {
	List<Video> VideoLibrary = new ArrayList<>();

	@RequestMapping(value="/video", method= RequestMethod.GET)
	public @ResponseBody List<Video> getVideos(HttpServletResponse response) {

		List<Video> result = new ArrayList<>();
		Video video = Video.create().withContentType("video/mpeg").withDuration(123)
				.withSubject("Mobile Cloud")
				.withTitle("Programming Cloud Services for ...").build();
		result.add(video);
		//response.setContentType("application/json");
		return result;

	}
	
}
