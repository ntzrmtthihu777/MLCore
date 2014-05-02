package ml.core.vec.transform;

import ml.core.vec.Vector3d;

import org.lwjgl.opengl.GL11;

public class Scale extends Transformation {

	public Vector3d factor;
	
	public Scale(Vector3d fac) {
		this.factor = fac.copy();
	}
	
	public Scale(double fac) {
		this(new Vector3d(fac, fac, fac));
	}

	@Override
	public void applyTo(Vector3d V) {
		V.mult(factor);
	}

	@Override
	public void applyToNormal(Vector3d N) {}

	@Override
	public void applyTo(Matrix4d mat) {
		mat.scale(factor);
	}

	@Override
	public void glTransform() {
		GL11.glScaled(factor.x, factor.y, factor.z);
	}

}