package com.preAlpha;

import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;

public class Vertex {

	public Vector3f pos;
	public Vector3f normal;
	public Vector2f textureMap;
	

	public String toString() {
		String s = "";
		s += "\tv " + pos;
		s += "\n\tvn " + normal;
		s += "\n\tvt " + textureMap;
		return s;
	}
}
