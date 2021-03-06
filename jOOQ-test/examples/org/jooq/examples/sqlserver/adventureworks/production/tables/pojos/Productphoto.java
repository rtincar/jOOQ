/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductPhoto", schema = "Production")
public class Productphoto implements java.io.Serializable {

	private static final long serialVersionUID = -638542983;

	private java.lang.Integer  productphotoid;
	private byte[]             thumbnailphoto;
	private java.lang.String   thumbnailphotofilename;
	private byte[]             largephoto;
	private java.lang.String   largephotofilename;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductPhotoID", unique = true)
	public java.lang.Integer getProductphotoid() {
		return this.productphotoid;
	}

	public void setProductphotoid(java.lang.Integer productphotoid) {
		this.productphotoid = productphotoid;
	}

	@javax.persistence.Column(name = "ThumbNailPhoto")
	public byte[] getThumbnailphoto() {
		return this.thumbnailphoto;
	}

	public void setThumbnailphoto(byte[] thumbnailphoto) {
		this.thumbnailphoto = thumbnailphoto;
	}

	@javax.persistence.Column(name = "ThumbnailPhotoFileName")
	public java.lang.String getThumbnailphotofilename() {
		return this.thumbnailphotofilename;
	}

	public void setThumbnailphotofilename(java.lang.String thumbnailphotofilename) {
		this.thumbnailphotofilename = thumbnailphotofilename;
	}

	@javax.persistence.Column(name = "LargePhoto")
	public byte[] getLargephoto() {
		return this.largephoto;
	}

	public void setLargephoto(byte[] largephoto) {
		this.largephoto = largephoto;
	}

	@javax.persistence.Column(name = "LargePhotoFileName")
	public java.lang.String getLargephotofilename() {
		return this.largephotofilename;
	}

	public void setLargephotofilename(java.lang.String largephotofilename) {
		this.largephotofilename = largephotofilename;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}
