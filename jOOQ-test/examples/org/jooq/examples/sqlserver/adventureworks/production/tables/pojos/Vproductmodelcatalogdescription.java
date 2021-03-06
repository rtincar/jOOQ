/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vProductModelCatalogDescription", schema = "Production")
public class Vproductmodelcatalogdescription implements java.io.Serializable {

	private static final long serialVersionUID = 399937628;

	private java.lang.Integer  productmodelid;
	private java.lang.String   name;
	private java.lang.String   summary;
	private java.lang.String   manufacturer;
	private java.lang.String   copyright;
	private java.lang.String   producturl;
	private java.lang.String   warrantyperiod;
	private java.lang.String   warrantydescription;
	private java.lang.String   noofyears;
	private java.lang.String   maintenancedescription;
	private java.lang.String   wheel;
	private java.lang.String   saddle;
	private java.lang.String   pedal;
	private java.lang.String   bikeframe;
	private java.lang.String   crankset;
	private java.lang.String   pictureangle;
	private java.lang.String   picturesize;
	private java.lang.String   productphotoid;
	private java.lang.String   material;
	private java.lang.String   color;
	private java.lang.String   productline;
	private java.lang.String   style;
	private java.lang.String   riderexperience;
	private java.lang.String   rowguid;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Column(name = "ProductModelID")
	public java.lang.Integer getProductmodelid() {
		return this.productmodelid;
	}

	public void setProductmodelid(java.lang.Integer productmodelid) {
		this.productmodelid = productmodelid;
	}

	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "Summary")
	public java.lang.String getSummary() {
		return this.summary;
	}

	public void setSummary(java.lang.String summary) {
		this.summary = summary;
	}

	@javax.persistence.Column(name = "Manufacturer")
	public java.lang.String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(java.lang.String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@javax.persistence.Column(name = "Copyright")
	public java.lang.String getCopyright() {
		return this.copyright;
	}

	public void setCopyright(java.lang.String copyright) {
		this.copyright = copyright;
	}

	@javax.persistence.Column(name = "ProductURL")
	public java.lang.String getProducturl() {
		return this.producturl;
	}

	public void setProducturl(java.lang.String producturl) {
		this.producturl = producturl;
	}

	@javax.persistence.Column(name = "WarrantyPeriod")
	public java.lang.String getWarrantyperiod() {
		return this.warrantyperiod;
	}

	public void setWarrantyperiod(java.lang.String warrantyperiod) {
		this.warrantyperiod = warrantyperiod;
	}

	@javax.persistence.Column(name = "WarrantyDescription")
	public java.lang.String getWarrantydescription() {
		return this.warrantydescription;
	}

	public void setWarrantydescription(java.lang.String warrantydescription) {
		this.warrantydescription = warrantydescription;
	}

	@javax.persistence.Column(name = "NoOfYears")
	public java.lang.String getNoofyears() {
		return this.noofyears;
	}

	public void setNoofyears(java.lang.String noofyears) {
		this.noofyears = noofyears;
	}

	@javax.persistence.Column(name = "MaintenanceDescription")
	public java.lang.String getMaintenancedescription() {
		return this.maintenancedescription;
	}

	public void setMaintenancedescription(java.lang.String maintenancedescription) {
		this.maintenancedescription = maintenancedescription;
	}

	@javax.persistence.Column(name = "Wheel")
	public java.lang.String getWheel() {
		return this.wheel;
	}

	public void setWheel(java.lang.String wheel) {
		this.wheel = wheel;
	}

	@javax.persistence.Column(name = "Saddle")
	public java.lang.String getSaddle() {
		return this.saddle;
	}

	public void setSaddle(java.lang.String saddle) {
		this.saddle = saddle;
	}

	@javax.persistence.Column(name = "Pedal")
	public java.lang.String getPedal() {
		return this.pedal;
	}

	public void setPedal(java.lang.String pedal) {
		this.pedal = pedal;
	}

	@javax.persistence.Column(name = "BikeFrame")
	public java.lang.String getBikeframe() {
		return this.bikeframe;
	}

	public void setBikeframe(java.lang.String bikeframe) {
		this.bikeframe = bikeframe;
	}

	@javax.persistence.Column(name = "Crankset")
	public java.lang.String getCrankset() {
		return this.crankset;
	}

	public void setCrankset(java.lang.String crankset) {
		this.crankset = crankset;
	}

	@javax.persistence.Column(name = "PictureAngle")
	public java.lang.String getPictureangle() {
		return this.pictureangle;
	}

	public void setPictureangle(java.lang.String pictureangle) {
		this.pictureangle = pictureangle;
	}

	@javax.persistence.Column(name = "PictureSize")
	public java.lang.String getPicturesize() {
		return this.picturesize;
	}

	public void setPicturesize(java.lang.String picturesize) {
		this.picturesize = picturesize;
	}

	@javax.persistence.Column(name = "ProductPhotoID")
	public java.lang.String getProductphotoid() {
		return this.productphotoid;
	}

	public void setProductphotoid(java.lang.String productphotoid) {
		this.productphotoid = productphotoid;
	}

	@javax.persistence.Column(name = "Material")
	public java.lang.String getMaterial() {
		return this.material;
	}

	public void setMaterial(java.lang.String material) {
		this.material = material;
	}

	@javax.persistence.Column(name = "Color")
	public java.lang.String getColor() {
		return this.color;
	}

	public void setColor(java.lang.String color) {
		this.color = color;
	}

	@javax.persistence.Column(name = "ProductLine")
	public java.lang.String getProductline() {
		return this.productline;
	}

	public void setProductline(java.lang.String productline) {
		this.productline = productline;
	}

	@javax.persistence.Column(name = "Style")
	public java.lang.String getStyle() {
		return this.style;
	}

	public void setStyle(java.lang.String style) {
		this.style = style;
	}

	@javax.persistence.Column(name = "RiderExperience")
	public java.lang.String getRiderexperience() {
		return this.riderexperience;
	}

	public void setRiderexperience(java.lang.String riderexperience) {
		this.riderexperience = riderexperience;
	}

	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return this.rowguid;
	}

	public void setRowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}
