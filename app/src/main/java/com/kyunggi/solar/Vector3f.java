package com.kyunggi.solar;

public class Vector3f
{
	float x;
	float y;
	float z;

	public Vector3f(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector3f add(Vector3f op)
	{
		return new Vector3f(x+op.x,y+op.y,z+op.z);
	}
	public Vector3f(Vector3f ori,float len)
	{
		
	}
	public Vector3f(Vector3f ori,float len,Vector3f axis, float rot)
	{
		
	}
	public void rotateAroundZ(float theta)
	{
		return;
	}
}
