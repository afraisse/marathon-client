package mesosphere.marathon.client.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import mesosphere.marathon.client.model.v2.Volume;

public class ModelUtils {
	public static final Gson GSON = new GsonBuilder().setPrettyPrinting()
			.disableHtmlEscaping().registerTypeAdapter(Volume.class, new Volume.VolumeAdapter()).create();

	public static String toString(Object o) {
		return GSON.toJson(o);
	}

}
