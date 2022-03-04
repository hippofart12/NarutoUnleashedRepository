//Made with Blockbench
//Paste this code into your mod.

public static class Modelfireball extends ModelBase {
	private final ModelRenderer Fireball;

	public Modelfireball() {
		textureWidth = 512;
		textureHeight = 512;

		Fireball = new ModelRenderer(this);
		Fireball.setRotationPoint(0.0F, 8.0F, 0.0F);
		Fireball.cubeList.add(new ModelBox(Fireball, 0, 0, -32.0F, -32.0F, -32.0F, 64, 64, 64, 0.0F, false));
		Fireball.cubeList.add(new ModelBox(Fireball, 240, 240, -28.0F, -28.0F, -36.0F, 56, 56, 4, 0.0F, false));
		Fireball.cubeList.add(new ModelBox(Fireball, 192, 0, -28.0F, -28.0F, 32.0F, 56, 56, 4, 0.0F, false));
		Fireball.cubeList.add(new ModelBox(Fireball, 120, 228, 32.0F, -28.0F, -28.0F, 4, 56, 56, 0.0F, false));
		Fireball.cubeList.add(new ModelBox(Fireball, 0, 188, -36.0F, -28.0F, -28.0F, 4, 56, 56, 0.0F, false));
		Fireball.cubeList.add(new ModelBox(Fireball, 168, 168, -28.0F, 32.0F, -28.0F, 56, 4, 56, 0.0F, false));
		Fireball.cubeList.add(new ModelBox(Fireball, 0, 128, -28.0F, -36.0F, -28.0F, 56, 4, 56, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Fireball.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Fireball.rotateAngleX = f2;
	}
}
