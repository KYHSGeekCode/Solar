package com.kyunggi.solar;
import javax.microedition.khronos.opengles.*;

public class Planet
{
	String name;
	float radius;
	float orbit;
	Planet origin;
	int period;
	
	Vector3f OP;
	Vector3f pos;

	float omega;
	public Planet(String name, float radius, float orbit/*, int period*/, Planet origin)
	{
		this.name = name;
		this.radius = radius;
		this.orbit = orbit;
		this.origin = origin;
		//this.period=period;
		if(origin==null)
		{
			OP=new Vector3f(new Vector3f(0,0,0),orbit);
			pos=new Vector3f(0,0,0);
		}else{
			OP=new Vector3f(origin.pos,orbit);
			pos=origin.pos.add(OP);	
		}
		period=Math.pow(orbit,1.5f);
		omega=10000f/period;
	}
	public void Update(float dt)
	{
		//1. rot op
		//2. calc pos
		OP.rotateAroundZ(dt*omega);
		pos=origin.pos.add(OP);
		return;
	}
	public void Draw(GL10 gl)
	{	
		MainActivity.SolarRenderer.DrawSphere(gl,pos,radius);
		return;
	}
	
};
