package com.github.tkurz.sparqlmm.vocabularies;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * Namespace SCHEMA.
 * Prefix: {@code <http://schema.org/>}
 */
public class SCHEMA {

	/** {@code http://schema.org/} **/
	public static final String NAMESPACE = "http://schema.org/";

	/** {@code schema} **/
	public static final String PREFIX = "schema";

	/**
	 * About
	 * <p>
	 * {@code http://schema.org/about}.
	 * <p>
	 * The subject matter of the content.
	 *
	 * @see <a href="http://schema.org/about">about</a>
	 */
	public static final URI about;

	/**
	 * About Page
	 * <p>
	 * {@code http://schema.org/AboutPage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AboutPage">AboutPage</a>
	 */
	public static final URI AboutPage;

	/**
	 * Accept Action
	 * <p>
	 * {@code http://schema.org/AcceptAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AcceptAction">AcceptAction</a>
	 */
	public static final URI AcceptAction;

	/**
	 * Accepted Offer
	 * <p>
	 * {@code http://schema.org/acceptedOffer}.
	 * <p>
	 * The offer(s) -- e.g., product, quantity and price combinations --
	 * included in the order.
	 *
	 * @see <a href="http://schema.org/acceptedOffer">acceptedOffer</a>
	 */
	public static final URI acceptedOffer;

	/**
	 * Accepted Payment Method
	 * <p>
	 * {@code http://schema.org/acceptedPaymentMethod}.
	 * <p>
	 * The payment method(s) accepted by seller for this offer.
	 *
	 * @see <a href="http://schema.org/acceptedPaymentMethod">acceptedPaymentMethod</a>
	 */
	public static final URI acceptedPaymentMethod;

	/**
	 * Accepts Reservations
	 * <p>
	 * {@code http://schema.org/acceptsReservations}.
	 * <p>
	 * Either Yes/No, or a URL at which reservations can be made.
	 *
	 * @see <a href="http://schema.org/acceptsReservations">acceptsReservations</a>
	 */
	public static final URI acceptsReservations;

	/**
	 * Access Code
	 * <p>
	 * {@code http://schema.org/accessCode}.
	 * <p>
	 * Password, PIN, or access code needed for delivery (e.g. from a
	 * locker).
	 *
	 * @see <a href="http://schema.org/accessCode">accessCode</a>
	 */
	public static final URI accessCode;

	/**
	 * Accessibility API
	 * <p>
	 * {@code http://schema.org/accessibilityAPI}.
	 * <p>
	 * Indicates that the resource is compatible with the referenced
	 * accessibility API (WebSchemas wiki lists possible values). 
	 *
	 * @see <a href="http://schema.org/accessibilityAPI">accessibilityAPI</a>
	 */
	public static final URI accessibilityAPI;

	/**
	 * Accessibility Control
	 * <p>
	 * {@code http://schema.org/accessibilityControl}.
	 * <p>
	 * Identifies input methods that are sufficient to fully control the
	 * described resource (WebSchemas wiki lists possible values).
	 *
	 * @see <a href="http://schema.org/accessibilityControl">accessibilityControl</a>
	 */
	public static final URI accessibilityControl;

	/**
	 * Accessibility Feature
	 * <p>
	 * {@code http://schema.org/accessibilityFeature}.
	 * <p>
	 * Content features of the resource, such as accessible media,
	 * alternatives and supported enhancements for accessibility (WebSchemas
	 * wiki lists possible values).
	 *
	 * @see <a href="http://schema.org/accessibilityFeature">accessibilityFeature</a>
	 */
	public static final URI accessibilityFeature;

	/**
	 * Accessibility Hazard
	 * <p>
	 * {@code http://schema.org/accessibilityHazard}.
	 * <p>
	 * A characteristic of the described resource that is physiologically
	 * dangerous to some users. Related to WCAG 2.0 guideline 2.3.
	 * (WebSchemas wiki lists possible values)
	 *
	 * @see <a href="http://schema.org/accessibilityHazard">accessibilityHazard</a>
	 */
	public static final URI accessibilityHazard;

	/**
	 * Accountable Person
	 * <p>
	 * {@code http://schema.org/accountablePerson}.
	 * <p>
	 * Specifies the Person that is legally accountable for the CreativeWork.
	 *
	 * @see <a href="http://schema.org/accountablePerson">accountablePerson</a>
	 */
	public static final URI accountablePerson;

	/**
	 * Accounting Service
	 * <p>
	 * {@code http://schema.org/AccountingService}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AccountingService">AccountingService</a>
	 */
	public static final URI AccountingService;

	/**
	 * Achieve Action
	 * <p>
	 * {@code http://schema.org/AchieveAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AchieveAction">AchieveAction</a>
	 */
	public static final URI AchieveAction;

	/**
	 * Acquired From
	 * <p>
	 * {@code http://schema.org/acquiredFrom}.
	 * <p>
	 * The organization or person from which the product was acquired.
	 *
	 * @see <a href="http://schema.org/acquiredFrom">acquiredFrom</a>
	 */
	public static final URI acquiredFrom;

	/**
	 * Action
	 * <p>
	 * {@code http://schema.org/action}.
	 * <p>
	 * The movement the muscle generates.
	 *
	 * @see <a href="http://schema.org/action">action</a>
	 */
	public static final URI action;

	/**
	 * Action
	 * <p>
	 * {@code http://schema.org/Action}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Action">Action</a>
	 */
	public static final URI Action;

	/**
	 * Active Ingredient
	 * <p>
	 * {@code http://schema.org/activeIngredient}.
	 * <p>
	 * An active ingredient, typically chemical compounds and/or biologic
	 * substances.
	 *
	 * @see <a href="http://schema.org/activeIngredient">activeIngredient</a>
	 */
	public static final URI activeIngredient;

	/**
	 * Activity Duration
	 * <p>
	 * {@code http://schema.org/activityDuration}.
	 * <p>
	 * Length of time to engage in the activity.
	 *
	 * @see <a href="http://schema.org/activityDuration">activityDuration</a>
	 */
	public static final URI activityDuration;

	/**
	 * Activity Frequency
	 * <p>
	 * {@code http://schema.org/activityFrequency}.
	 * <p>
	 * How often one should engage in the activity.
	 *
	 * @see <a href="http://schema.org/activityFrequency">activityFrequency</a>
	 */
	public static final URI activityFrequency;

	/**
	 * Actor
	 * <p>
	 * {@code http://schema.org/actor}.
	 * <p>
	 * A cast member of the movie, tv/radio series, season, episode, or
	 * video.
	 *
	 * @see <a href="http://schema.org/actor">actor</a>
	 */
	public static final URI actor;

	/**
	 * Actors
	 * <p>
	 * {@code http://schema.org/actors}.
	 * <p>
	 * A cast member of the movie, tv/radio series, season, episode, or
	 * video. (legacy spelling; see singular form, actor)
	 *
	 * @see <a href="http://schema.org/actors">actors</a>
	 */
	public static final URI actors;

	/**
	 * Add Action
	 * <p>
	 * {@code http://schema.org/AddAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AddAction">AddAction</a>
	 */
	public static final URI AddAction;

	/**
	 * Additional Name
	 * <p>
	 * {@code http://schema.org/additionalName}.
	 * <p>
	 * An additional name for a Person, can be used for a middle name.
	 *
	 * @see <a href="http://schema.org/additionalName">additionalName</a>
	 */
	public static final URI additionalName;

	/**
	 * Additional Type
	 * <p>
	 * {@code http://schema.org/additionalType}.
	 * <p>
	 * An additional type for the item, typically used for adding more
	 * specific types from external vocabularies in microdata syntax. This is
	 * a relationship between something and a class that the thing is in. In
	 * RDFa syntax, it is better to use the native RDFa syntax - the 'typeof'
	 * attribute - for multiple types. Schema.org tools may have only weaker
	 * understanding of extra types, in particular those defined externally.
	 *
	 * @see <a href="http://schema.org/additionalType">additionalType</a>
	 */
	public static final URI additionalType;

	/**
	 * Additional Variable
	 * <p>
	 * {@code http://schema.org/additionalVariable}.
	 * <p>
	 * Any additional component of the exercise prescription that may need to
	 * be articulated to the patient. This may include the order of
	 * exercises, the number of repetitions of movement, quantitative
	 * distance, progressions over time, etc.
	 *
	 * @see <a href="http://schema.org/additionalVariable">additionalVariable</a>
	 */
	public static final URI additionalVariable;

	/**
	 * Add On
	 * <p>
	 * {@code http://schema.org/addOn}.
	 * <p>
	 * An additional offer that can only be obtained in combination with the
	 * first base offer (e.g. supplements and extensions that are available
	 * for a surcharge).
	 *
	 * @see <a href="http://schema.org/addOn">addOn</a>
	 */
	public static final URI addOn;

	/**
	 * Address
	 * <p>
	 * {@code http://schema.org/address}.
	 * <p>
	 * Physical address of the item.
	 *
	 * @see <a href="http://schema.org/address">address</a>
	 */
	public static final URI address;

	/**
	 * Address Country
	 * <p>
	 * {@code http://schema.org/addressCountry}.
	 * <p>
	 * The country. For example, USA. You can also provide the two-letter ISO
	 * 3166-1 alpha-2 country code.
	 *
	 * @see <a href="http://schema.org/addressCountry">addressCountry</a>
	 */
	public static final URI addressCountry;

	/**
	 * Address Locality
	 * <p>
	 * {@code http://schema.org/addressLocality}.
	 * <p>
	 * The locality. For example, Mountain View.
	 *
	 * @see <a href="http://schema.org/addressLocality">addressLocality</a>
	 */
	public static final URI addressLocality;

	/**
	 * Address Region
	 * <p>
	 * {@code http://schema.org/addressRegion}.
	 * <p>
	 * The region. For example, CA.
	 *
	 * @see <a href="http://schema.org/addressRegion">addressRegion</a>
	 */
	public static final URI addressRegion;

	/**
	 * Administration Route
	 * <p>
	 * {@code http://schema.org/administrationRoute}.
	 * <p>
	 * A route by which this drug may be administered, e.g. 'oral'.
	 *
	 * @see <a href="http://schema.org/administrationRoute">administrationRoute</a>
	 */
	public static final URI administrationRoute;

	/**
	 * Administrative Area
	 * <p>
	 * {@code http://schema.org/AdministrativeArea}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AdministrativeArea">AdministrativeArea</a>
	 */
	public static final URI AdministrativeArea;

	/**
	 * Adult Entertainment
	 * <p>
	 * {@code http://schema.org/AdultEntertainment}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AdultEntertainment">AdultEntertainment</a>
	 */
	public static final URI AdultEntertainment;

	/**
	 * Advance Booking Requirement
	 * <p>
	 * {@code http://schema.org/advanceBookingRequirement}.
	 * <p>
	 * The amount of time that is required between accepting the offer and
	 * the actual usage of the resource or service.
	 *
	 * @see <a href="http://schema.org/advanceBookingRequirement">advanceBookingRequirement</a>
	 */
	public static final URI advanceBookingRequirement;

	/**
	 * Adverse Outcome
	 * <p>
	 * {@code http://schema.org/adverseOutcome}.
	 * <p>
	 * A possible complication and/or side effect of this therapy. If it is
	 * known that an adverse outcome is serious (resulting in death,
	 * disability, or permanent damage; requiring hospitalization; or is
	 * otherwise life-threatening or requires immediate medical attention),
	 * tag it as a seriouseAdverseOutcome instead.
	 *
	 * @see <a href="http://schema.org/adverseOutcome">adverseOutcome</a>
	 */
	public static final URI adverseOutcome;

	/**
	 * Affected by
	 * <p>
	 * {@code http://schema.org/affectedBy}.
	 * <p>
	 * Drugs that affect the test's results.
	 *
	 * @see <a href="http://schema.org/affectedBy">affectedBy</a>
	 */
	public static final URI affectedBy;

	/**
	 * Affiliation
	 * <p>
	 * {@code http://schema.org/affiliation}.
	 * <p>
	 * An organization that this person is affiliated with. For example, a
	 * school/university, a club, or a team.
	 *
	 * @see <a href="http://schema.org/affiliation">affiliation</a>
	 */
	public static final URI affiliation;

	/**
	 * Agent
	 * <p>
	 * {@code http://schema.org/agent}.
	 * <p>
	 * The direct performer or driver of the action (animate or inanimate).
	 * e.g. *John* wrote a book.
	 *
	 * @see <a href="http://schema.org/agent">agent</a>
	 */
	public static final URI agent;

	/**
	 * Aggregate Offer
	 * <p>
	 * {@code http://schema.org/AggregateOffer}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AggregateOffer">AggregateOffer</a>
	 */
	public static final URI AggregateOffer;

	/**
	 * Aggregate Rating
	 * <p>
	 * {@code http://schema.org/aggregateRating}.
	 * <p>
	 * The overall rating, based on a collection of reviews or ratings, of
	 * the item.
	 *
	 * @see <a href="http://schema.org/aggregateRating">aggregateRating</a>
	 */
	public static final URI aggregateRating;

	/**
	 * Aggregate Rating
	 * <p>
	 * {@code http://schema.org/AggregateRating}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AggregateRating">AggregateRating</a>
	 */
	public static final URI AggregateRating;

	/**
	 * Agree Action
	 * <p>
	 * {@code http://schema.org/AgreeAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AgreeAction">AgreeAction</a>
	 */
	public static final URI AgreeAction;

	/**
	 * Airport
	 * <p>
	 * {@code http://schema.org/Airport}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Airport">Airport</a>
	 */
	public static final URI Airport;

	/**
	 * Album
	 * <p>
	 * {@code http://schema.org/album}.
	 * <p>
	 * A music album.
	 *
	 * @see <a href="http://schema.org/album">album</a>
	 */
	public static final URI album;

	/**
	 * Albums
	 * <p>
	 * {@code http://schema.org/albums}.
	 * <p>
	 * A collection of music albums (legacy spelling; see singular form,
	 * album).
	 *
	 * @see <a href="http://schema.org/albums">albums</a>
	 */
	public static final URI albums;

	/**
	 * Alcohol Warning
	 * <p>
	 * {@code http://schema.org/alcoholWarning}.
	 * <p>
	 * Any precaution, guidance, contraindication, etc. related to
	 * consumption of alcohol while taking this drug.
	 *
	 * @see <a href="http://schema.org/alcoholWarning">alcoholWarning</a>
	 */
	public static final URI alcoholWarning;

	/**
	 * Algorithm
	 * <p>
	 * {@code http://schema.org/algorithm}.
	 * <p>
	 * The algorithm or rules to follow to compute the score.
	 *
	 * @see <a href="http://schema.org/algorithm">algorithm</a>
	 */
	public static final URI algorithm;

	/**
	 * Alignment Object
	 * <p>
	 * {@code http://schema.org/AlignmentObject}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AlignmentObject">AlignmentObject</a>
	 */
	public static final URI AlignmentObject;

	/**
	 * Alignment Type
	 * <p>
	 * {@code http://schema.org/alignmentType}.
	 * <p>
	 * A category of alignment between the learning resource and the
	 * framework node. Recommended values include: 'assesses', 'teaches',
	 * 'requires', 'textComplexity', 'readingLevel', 'educationalSubject',
	 * and 'educationLevel'.
	 *
	 * @see <a href="http://schema.org/alignmentType">alignmentType</a>
	 */
	public static final URI alignmentType;

	/**
	 * Allocate Action
	 * <p>
	 * {@code http://schema.org/AllocateAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AllocateAction">AllocateAction</a>
	 */
	public static final URI AllocateAction;

	/**
	 * Alternate Name
	 * <p>
	 * {@code http://schema.org/alternateName}.
	 * <p>
	 * An alias for the item.
	 *
	 * @see <a href="http://schema.org/alternateName">alternateName</a>
	 */
	public static final URI alternateName;

	/**
	 * Alternative Headline
	 * <p>
	 * {@code http://schema.org/alternativeHeadline}.
	 * <p>
	 * A secondary title of the CreativeWork.
	 *
	 * @see <a href="http://schema.org/alternativeHeadline">alternativeHeadline</a>
	 */
	public static final URI alternativeHeadline;

	/**
	 * Alumni
	 * <p>
	 * {@code http://schema.org/alumni}.
	 * <p>
	 * Alumni of educational organization.
	 *
	 * @see <a href="http://schema.org/alumni">alumni</a>
	 */
	public static final URI alumni;

	/**
	 * Alumni of
	 * <p>
	 * {@code http://schema.org/alumniOf}.
	 * <p>
	 * An educational organizations that the person is an alumni of.
	 *
	 * @see <a href="http://schema.org/alumniOf">alumniOf</a>
	 */
	public static final URI alumniOf;

	/**
	 * Amount of This Good
	 * <p>
	 * {@code http://schema.org/amountOfThisGood}.
	 * <p>
	 * The quantity of the goods included in the offer.
	 *
	 * @see <a href="http://schema.org/amountOfThisGood">amountOfThisGood</a>
	 */
	public static final URI amountOfThisGood;

	/**
	 * Amusement Park
	 * <p>
	 * {@code http://schema.org/AmusementPark}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AmusementPark">AmusementPark</a>
	 */
	public static final URI AmusementPark;

	/**
	 * Anatomical Structure
	 * <p>
	 * {@code http://schema.org/AnatomicalStructure}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AnatomicalStructure">AnatomicalStructure</a>
	 */
	public static final URI AnatomicalStructure;

	/**
	 * Anatomical System
	 * <p>
	 * {@code http://schema.org/AnatomicalSystem}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AnatomicalSystem">AnatomicalSystem</a>
	 */
	public static final URI AnatomicalSystem;

	/**
	 * Animal Shelter
	 * <p>
	 * {@code http://schema.org/AnimalShelter}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AnimalShelter">AnimalShelter</a>
	 */
	public static final URI AnimalShelter;

	/**
	 * Antagonist
	 * <p>
	 * {@code http://schema.org/antagonist}.
	 * <p>
	 * The muscle whose action counteracts the specified muscle.
	 *
	 * @see <a href="http://schema.org/antagonist">antagonist</a>
	 */
	public static final URI antagonist;

	/**
	 * Apartment Complex
	 * <p>
	 * {@code http://schema.org/ApartmentComplex}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ApartmentComplex">ApartmentComplex</a>
	 */
	public static final URI ApartmentComplex;

	/**
	 * API Reference
	 * <p>
	 * {@code http://schema.org/APIReference}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/APIReference">APIReference</a>
	 */
	public static final URI APIReference;

	/**
	 * Append Action
	 * <p>
	 * {@code http://schema.org/AppendAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AppendAction">AppendAction</a>
	 */
	public static final URI AppendAction;

	/**
	 * Applicable Location
	 * <p>
	 * {@code http://schema.org/applicableLocation}.
	 * <p>
	 * The location in which the status applies.
	 *
	 * @see <a href="http://schema.org/applicableLocation">applicableLocation</a>
	 */
	public static final URI applicableLocation;

	/**
	 * Application Category
	 * <p>
	 * {@code http://schema.org/applicationCategory}.
	 * <p>
	 * Type of software application, e.g. "Game, Multimedia".
	 *
	 * @see <a href="http://schema.org/applicationCategory">applicationCategory</a>
	 */
	public static final URI applicationCategory;

	/**
	 * Application Sub Category
	 * <p>
	 * {@code http://schema.org/applicationSubCategory}.
	 * <p>
	 * Subcategory of the application, e.g. "Arcade Game".
	 *
	 * @see <a href="http://schema.org/applicationSubCategory">applicationSubCategory</a>
	 */
	public static final URI applicationSubCategory;

	/**
	 * Application Suite
	 * <p>
	 * {@code http://schema.org/applicationSuite}.
	 * <p>
	 * The name of the application suite to which the application belongs
	 * (e.g. Excel belongs to Office)
	 *
	 * @see <a href="http://schema.org/applicationSuite">applicationSuite</a>
	 */
	public static final URI applicationSuite;

	/**
	 * Applies to Delivery Method
	 * <p>
	 * {@code http://schema.org/appliesToDeliveryMethod}.
	 * <p>
	 * The delivery method(s) to which the delivery charge or payment charge
	 * specification applies.
	 *
	 * @see <a href="http://schema.org/appliesToDeliveryMethod">appliesToDeliveryMethod</a>
	 */
	public static final URI appliesToDeliveryMethod;

	/**
	 * Applies to Payment Method
	 * <p>
	 * {@code http://schema.org/appliesToPaymentMethod}.
	 * <p>
	 * The payment method(s) to which the payment charge specification
	 * applies.
	 *
	 * @see <a href="http://schema.org/appliesToPaymentMethod">appliesToPaymentMethod</a>
	 */
	public static final URI appliesToPaymentMethod;

	/**
	 * Apply Action
	 * <p>
	 * {@code http://schema.org/ApplyAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ApplyAction">ApplyAction</a>
	 */
	public static final URI ApplyAction;

	/**
	 * Approved Indication
	 * <p>
	 * {@code http://schema.org/ApprovedIndication}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ApprovedIndication">ApprovedIndication</a>
	 */
	public static final URI ApprovedIndication;

	/**
	 * Aquarium
	 * <p>
	 * {@code http://schema.org/Aquarium}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Aquarium">Aquarium</a>
	 */
	public static final URI Aquarium;

	/**
	 * Area
	 * <p>
	 * {@code http://schema.org/area}.
	 * <p>
	 * The area within which users can expect to reach the broadcast service.
	 *
	 * @see <a href="http://schema.org/area">area</a>
	 */
	public static final URI area;

	/**
	 * Area Served
	 * <p>
	 * {@code http://schema.org/areaServed}.
	 * <p>
	 * The location served by this contact point (e.g., a phone number
	 * intended for Europeans vs. North Americans or only within the United
	 * States.)
	 *
	 * @see <a href="http://schema.org/areaServed">areaServed</a>
	 */
	public static final URI areaServed;

	/**
	 * Arrive Action
	 * <p>
	 * {@code http://schema.org/ArriveAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ArriveAction">ArriveAction</a>
	 */
	public static final URI ArriveAction;

	/**
	 * Arterial Branch
	 * <p>
	 * {@code http://schema.org/arterialBranch}.
	 * <p>
	 * The branches that comprise the arterial structure.
	 *
	 * @see <a href="http://schema.org/arterialBranch">arterialBranch</a>
	 */
	public static final URI arterialBranch;

	/**
	 * Artery
	 * <p>
	 * {@code http://schema.org/Artery}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Artery">Artery</a>
	 */
	public static final URI Artery;

	/**
	 * Art Gallery
	 * <p>
	 * {@code http://schema.org/ArtGallery}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ArtGallery">ArtGallery</a>
	 */
	public static final URI ArtGallery;

	/**
	 * Article
	 * <p>
	 * {@code http://schema.org/Article}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Article">Article</a>
	 */
	public static final URI Article;

	/**
	 * Article Body
	 * <p>
	 * {@code http://schema.org/articleBody}.
	 * <p>
	 * The actual body of the article.
	 *
	 * @see <a href="http://schema.org/articleBody">articleBody</a>
	 */
	public static final URI articleBody;

	/**
	 * Article Section
	 * <p>
	 * {@code http://schema.org/articleSection}.
	 * <p>
	 * Articles may belong to one or more 'sections' in a magazine or
	 * newspaper, such as Sports, Lifestyle, etc.
	 *
	 * @see <a href="http://schema.org/articleSection">articleSection</a>
	 */
	public static final URI articleSection;

	/**
	 * Ask Action
	 * <p>
	 * {@code http://schema.org/AskAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AskAction">AskAction</a>
	 */
	public static final URI AskAction;

	/**
	 * Aspect
	 * <p>
	 * {@code http://schema.org/aspect}.
	 * <p>
	 * An aspect of medical practice that is considered on the page, such as
	 * 'diagnosis', 'treatment', 'causes', 'prognosis', 'etiology',
	 * 'epidemiology', etc.
	 *
	 * @see <a href="http://schema.org/aspect">aspect</a>
	 */
	public static final URI aspect;

	/**
	 * Assembly
	 * <p>
	 * {@code http://schema.org/assembly}.
	 * <p>
	 * Library file name e.g., mscorlib.dll, system.web.dll
	 *
	 * @see <a href="http://schema.org/assembly">assembly</a>
	 */
	public static final URI assembly;

	/**
	 * Assembly Version
	 * <p>
	 * {@code http://schema.org/assemblyVersion}.
	 * <p>
	 * Associated product/technology version. e.g., .NET Framework 4.5
	 *
	 * @see <a href="http://schema.org/assemblyVersion">assemblyVersion</a>
	 */
	public static final URI assemblyVersion;

	/**
	 * Assess Action
	 * <p>
	 * {@code http://schema.org/AssessAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AssessAction">AssessAction</a>
	 */
	public static final URI AssessAction;

	/**
	 * Assign Action
	 * <p>
	 * {@code http://schema.org/AssignAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AssignAction">AssignAction</a>
	 */
	public static final URI AssignAction;

	/**
	 * Associated Anatomy
	 * <p>
	 * {@code http://schema.org/associatedAnatomy}.
	 * <p>
	 * The anatomy of the underlying organ system or structures associated
	 * with this entity.
	 *
	 * @see <a href="http://schema.org/associatedAnatomy">associatedAnatomy</a>
	 */
	public static final URI associatedAnatomy;

	/**
	 * Associated Article
	 * <p>
	 * {@code http://schema.org/associatedArticle}.
	 * <p>
	 * A NewsArticle associated with the Media Object.
	 *
	 * @see <a href="http://schema.org/associatedArticle">associatedArticle</a>
	 */
	public static final URI associatedArticle;

	/**
	 * Associated Media
	 * <p>
	 * {@code http://schema.org/associatedMedia}.
	 * <p>
	 * The media objects that encode this creative work. This property is a
	 * synonym for encodings.
	 *
	 * @see <a href="http://schema.org/associatedMedia">associatedMedia</a>
	 */
	public static final URI associatedMedia;

	/**
	 * Associated Pathophysiology
	 * <p>
	 * {@code http://schema.org/associatedPathophysiology}.
	 * <p>
	 * If applicable, a description of the pathophysiology associated with
	 * the anatomical system, including potential abnormal changes in the
	 * mechanical, physical, and biochemical functions of the system.
	 *
	 * @see <a href="http://schema.org/associatedPathophysiology">associatedPathophysiology</a>
	 */
	public static final URI associatedPathophysiology;

	/**
	 * Attendee
	 * <p>
	 * {@code http://schema.org/attendee}.
	 * <p>
	 * A person or organization attending the event.
	 *
	 * @see <a href="http://schema.org/attendee">attendee</a>
	 */
	public static final URI attendee;

	/**
	 * Attendees
	 * <p>
	 * {@code http://schema.org/attendees}.
	 * <p>
	 * A person attending the event (legacy spelling; see singular form,
	 * attendee).
	 *
	 * @see <a href="http://schema.org/attendees">attendees</a>
	 */
	public static final URI attendees;

	/**
	 * Attorney
	 * <p>
	 * {@code http://schema.org/Attorney}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Attorney">Attorney</a>
	 */
	public static final URI Attorney;

	/**
	 * Audience
	 * <p>
	 * {@code http://schema.org/audience}.
	 * <p>
	 * The intended audience of the item, i.e. the group for whom the item
	 * was created.
	 *
	 * @see <a href="http://schema.org/audience">audience</a>
	 */
	public static final URI audience;

	/**
	 * Audience
	 * <p>
	 * {@code http://schema.org/Audience}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Audience">Audience</a>
	 */
	public static final URI Audience;

	/**
	 * Audience Type
	 * <p>
	 * {@code http://schema.org/audienceType}.
	 * <p>
	 * The target group associated with a given audience (e.g. veterans, car
	 * owners, musicians, etc.) domain: Audience Range: Text 
	 *
	 * @see <a href="http://schema.org/audienceType">audienceType</a>
	 */
	public static final URI audienceType;

	/**
	 * Audio
	 * <p>
	 * {@code http://schema.org/audio}.
	 * <p>
	 * An embedded audio object.
	 *
	 * @see <a href="http://schema.org/audio">audio</a>
	 */
	public static final URI audio;

	/**
	 * Audio Object
	 * <p>
	 * {@code http://schema.org/AudioObject}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AudioObject">AudioObject</a>
	 */
	public static final URI AudioObject;

	/**
	 * Author
	 * <p>
	 * {@code http://schema.org/author}.
	 * <p>
	 * The author of this content. Please note that author is special in that
	 * HTML 5 provides a special mechanism for indicating authorship via the
	 * rel tag. That is equivalent to this and may be used interchangeably.
	 *
	 * @see <a href="http://schema.org/author">author</a>
	 */
	public static final URI author;

	/**
	 * Authorize Action
	 * <p>
	 * {@code http://schema.org/AuthorizeAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AuthorizeAction">AuthorizeAction</a>
	 */
	public static final URI AuthorizeAction;

	/**
	 * Auto Body Shop
	 * <p>
	 * {@code http://schema.org/AutoBodyShop}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AutoBodyShop">AutoBodyShop</a>
	 */
	public static final URI AutoBodyShop;

	/**
	 * Auto Dealer
	 * <p>
	 * {@code http://schema.org/AutoDealer}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AutoDealer">AutoDealer</a>
	 */
	public static final URI AutoDealer;

	/**
	 * Automated Teller
	 * <p>
	 * {@code http://schema.org/AutomatedTeller}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AutomatedTeller">AutomatedTeller</a>
	 */
	public static final URI AutomatedTeller;

	/**
	 * Automotive Business
	 * <p>
	 * {@code http://schema.org/AutomotiveBusiness}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AutomotiveBusiness">AutomotiveBusiness</a>
	 */
	public static final URI AutomotiveBusiness;

	/**
	 * Auto Parts Store
	 * <p>
	 * {@code http://schema.org/AutoPartsStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AutoPartsStore">AutoPartsStore</a>
	 */
	public static final URI AutoPartsStore;

	/**
	 * Auto Rental
	 * <p>
	 * {@code http://schema.org/AutoRental}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AutoRental">AutoRental</a>
	 */
	public static final URI AutoRental;

	/**
	 * Auto Repair
	 * <p>
	 * {@code http://schema.org/AutoRepair}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AutoRepair">AutoRepair</a>
	 */
	public static final URI AutoRepair;

	/**
	 * Auto Wash
	 * <p>
	 * {@code http://schema.org/AutoWash}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/AutoWash">AutoWash</a>
	 */
	public static final URI AutoWash;

	/**
	 * Availability
	 * <p>
	 * {@code http://schema.org/availability}.
	 * <p>
	 * The availability of this item—for example In stock, Out of stock,
	 * Pre-order, etc.
	 *
	 * @see <a href="http://schema.org/availability">availability</a>
	 */
	public static final URI availability;

	/**
	 * Availability Ends
	 * <p>
	 * {@code http://schema.org/availabilityEnds}.
	 * <p>
	 * The end of the availability of the product or service included in the
	 * offer.
	 *
	 * @see <a href="http://schema.org/availabilityEnds">availabilityEnds</a>
	 */
	public static final URI availabilityEnds;

	/**
	 * Availability Starts
	 * <p>
	 * {@code http://schema.org/availabilityStarts}.
	 * <p>
	 * The beginning of the availability of the product or service included
	 * in the offer.
	 *
	 * @see <a href="http://schema.org/availabilityStarts">availabilityStarts</a>
	 */
	public static final URI availabilityStarts;

	/**
	 * Available At or From
	 * <p>
	 * {@code http://schema.org/availableAtOrFrom}.
	 * <p>
	 * The place(s) from which the offer can be obtained (e.g. store
	 * locations).
	 *
	 * @see <a href="http://schema.org/availableAtOrFrom">availableAtOrFrom</a>
	 */
	public static final URI availableAtOrFrom;

	/**
	 * Available Channel
	 * <p>
	 * {@code http://schema.org/availableChannel}.
	 * <p>
	 * A means of accessing the service (e.g. a phone bank, a web site, a
	 * location, etc.)
	 *
	 * @see <a href="http://schema.org/availableChannel">availableChannel</a>
	 */
	public static final URI availableChannel;

	/**
	 * Available Delivery Method
	 * <p>
	 * {@code http://schema.org/availableDeliveryMethod}.
	 * <p>
	 * The delivery method(s) available for this offer.
	 *
	 * @see <a href="http://schema.org/availableDeliveryMethod">availableDeliveryMethod</a>
	 */
	public static final URI availableDeliveryMethod;

	/**
	 * Available From
	 * <p>
	 * {@code http://schema.org/availableFrom}.
	 * <p>
	 * When the item is available for pickup from the store, locker, etc.
	 *
	 * @see <a href="http://schema.org/availableFrom">availableFrom</a>
	 */
	public static final URI availableFrom;

	/**
	 * Available in
	 * <p>
	 * {@code http://schema.org/availableIn}.
	 * <p>
	 * The location in which the strength is available.
	 *
	 * @see <a href="http://schema.org/availableIn">availableIn</a>
	 */
	public static final URI availableIn;

	/**
	 * Available Language
	 * <p>
	 * {@code http://schema.org/availableLanguage}.
	 * <p>
	 * A language someone may use with the item.
	 *
	 * @see <a href="http://schema.org/availableLanguage">availableLanguage</a>
	 */
	public static final URI availableLanguage;

	/**
	 * Available Service
	 * <p>
	 * {@code http://schema.org/availableService}.
	 * <p>
	 * A medical service available from this provider.
	 *
	 * @see <a href="http://schema.org/availableService">availableService</a>
	 */
	public static final URI availableService;

	/**
	 * Available Strength
	 * <p>
	 * {@code http://schema.org/availableStrength}.
	 * <p>
	 * An available dosage strength for the drug.
	 *
	 * @see <a href="http://schema.org/availableStrength">availableStrength</a>
	 */
	public static final URI availableStrength;

	/**
	 * Available Test
	 * <p>
	 * {@code http://schema.org/availableTest}.
	 * <p>
	 * A diagnostic test or procedure offered by this lab.
	 *
	 * @see <a href="http://schema.org/availableTest">availableTest</a>
	 */
	public static final URI availableTest;

	/**
	 * Available Through
	 * <p>
	 * {@code http://schema.org/availableThrough}.
	 * <p>
	 * After this date, the item will no longer be available for pickup.
	 *
	 * @see <a href="http://schema.org/availableThrough">availableThrough</a>
	 */
	public static final URI availableThrough;

	/**
	 * Award
	 * <p>
	 * {@code http://schema.org/award}.
	 * <p>
	 * An award won by this person or for this creative work.
	 *
	 * @see <a href="http://schema.org/award">award</a>
	 */
	public static final URI award;

	/**
	 * Awards
	 * <p>
	 * {@code http://schema.org/awards}.
	 * <p>
	 * Awards won by this person or for this creative work. (legacy spelling;
	 * see singular form, award)
	 *
	 * @see <a href="http://schema.org/awards">awards</a>
	 */
	public static final URI awards;

	/**
	 * Background
	 * <p>
	 * {@code http://schema.org/background}.
	 * <p>
	 * Descriptive information establishing a historical perspective on the
	 * supplement. May include the rationale for the name, the population
	 * where the supplement first came to prominence, etc.
	 *
	 * @see <a href="http://schema.org/background">background</a>
	 */
	public static final URI background;

	/**
	 * Bakery
	 * <p>
	 * {@code http://schema.org/Bakery}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Bakery">Bakery</a>
	 */
	public static final URI Bakery;

	/**
	 * Bank or Credit Union
	 * <p>
	 * {@code http://schema.org/BankOrCreditUnion}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BankOrCreditUnion">BankOrCreditUnion</a>
	 */
	public static final URI BankOrCreditUnion;

	/**
	 * Bar or Pub
	 * <p>
	 * {@code http://schema.org/BarOrPub}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BarOrPub">BarOrPub</a>
	 */
	public static final URI BarOrPub;

	/**
	 * Base Salary
	 * <p>
	 * {@code http://schema.org/baseSalary}.
	 * <p>
	 * The base salary of the job.
	 *
	 * @see <a href="http://schema.org/baseSalary">baseSalary</a>
	 */
	public static final URI baseSalary;

	/**
	 * Beach
	 * <p>
	 * {@code http://schema.org/Beach}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Beach">Beach</a>
	 */
	public static final URI Beach;

	/**
	 * Beauty Salon
	 * <p>
	 * {@code http://schema.org/BeautySalon}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BeautySalon">BeautySalon</a>
	 */
	public static final URI BeautySalon;

	/**
	 * Bed And Breakfast
	 * <p>
	 * {@code http://schema.org/BedAndBreakfast}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BedAndBreakfast">BedAndBreakfast</a>
	 */
	public static final URI BedAndBreakfast;

	/**
	 * Befriend Action
	 * <p>
	 * {@code http://schema.org/BefriendAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BefriendAction">BefriendAction</a>
	 */
	public static final URI BefriendAction;

	/**
	 * Benefits
	 * <p>
	 * {@code http://schema.org/benefits}.
	 * <p>
	 * Description of benefits associated with the job.
	 *
	 * @see <a href="http://schema.org/benefits">benefits</a>
	 */
	public static final URI benefits;

	/**
	 * Best Rating
	 * <p>
	 * {@code http://schema.org/bestRating}.
	 * <p>
	 * The highest value allowed in this rating system. If bestRating is
	 * omitted, 5 is assumed.
	 *
	 * @see <a href="http://schema.org/bestRating">bestRating</a>
	 */
	public static final URI bestRating;

	/**
	 * Bike Store
	 * <p>
	 * {@code http://schema.org/BikeStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BikeStore">BikeStore</a>
	 */
	public static final URI BikeStore;

	/**
	 * Billing Address
	 * <p>
	 * {@code http://schema.org/billingAddress}.
	 * <p>
	 * The billing address for the order.
	 *
	 * @see <a href="http://schema.org/billingAddress">billingAddress</a>
	 */
	public static final URI billingAddress;

	/**
	 * Billing Increment
	 * <p>
	 * {@code http://schema.org/billingIncrement}.
	 * <p>
	 * This property specifies the minimal quantity and rounding increment
	 * that will be the basis for the billing. The unit of measurement is
	 * specified by the unitCode property.
	 *
	 * @see <a href="http://schema.org/billingIncrement">billingIncrement</a>
	 */
	public static final URI billingIncrement;

	/**
	 * Biomechnical Class
	 * <p>
	 * {@code http://schema.org/biomechnicalClass}.
	 * <p>
	 * The biomechanical properties of the bone.
	 *
	 * @see <a href="http://schema.org/biomechnicalClass">biomechnicalClass</a>
	 */
	public static final URI biomechnicalClass;

	/**
	 * Birth Date
	 * <p>
	 * {@code http://schema.org/birthDate}.
	 * <p>
	 * Date of birth.
	 *
	 * @see <a href="http://schema.org/birthDate">birthDate</a>
	 */
	public static final URI birthDate;

	/**
	 * Bitrate
	 * <p>
	 * {@code http://schema.org/bitrate}.
	 * <p>
	 * The bitrate of the media object.
	 *
	 * @see <a href="http://schema.org/bitrate">bitrate</a>
	 */
	public static final URI bitrate;

	/**
	 * Blog
	 * <p>
	 * {@code http://schema.org/Blog}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Blog">Blog</a>
	 */
	public static final URI Blog;

	/**
	 * Blog Post
	 * <p>
	 * {@code http://schema.org/blogPost}.
	 * <p>
	 * A posting that is part of this blog.
	 *
	 * @see <a href="http://schema.org/blogPost">blogPost</a>
	 */
	public static final URI blogPost;

	/**
	 * Blog Posting
	 * <p>
	 * {@code http://schema.org/BlogPosting}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BlogPosting">BlogPosting</a>
	 */
	public static final URI BlogPosting;

	/**
	 * Blog Posts
	 * <p>
	 * {@code http://schema.org/blogPosts}.
	 * <p>
	 * The postings that are part of this blog (legacy spelling; see singular
	 * form, blogPost).
	 *
	 * @see <a href="http://schema.org/blogPosts">blogPosts</a>
	 */
	public static final URI blogPosts;

	/**
	 * Blood Supply
	 * <p>
	 * {@code http://schema.org/bloodSupply}.
	 * <p>
	 * The blood vessel that carries blood from the heart to the muscle.
	 *
	 * @see <a href="http://schema.org/bloodSupply">bloodSupply</a>
	 */
	public static final URI bloodSupply;

	/**
	 * Blood Test
	 * <p>
	 * {@code http://schema.org/BloodTest}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BloodTest">BloodTest</a>
	 */
	public static final URI BloodTest;

	/**
	 * Body Location
	 * <p>
	 * {@code http://schema.org/bodyLocation}.
	 * <p>
	 * Location in the body of the anatomical structure.
	 *
	 * @see <a href="http://schema.org/bodyLocation">bodyLocation</a>
	 */
	public static final URI bodyLocation;

	/**
	 * Body of Water
	 * <p>
	 * {@code http://schema.org/BodyOfWater}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BodyOfWater">BodyOfWater</a>
	 */
	public static final URI BodyOfWater;

	/**
	 * Bone
	 * <p>
	 * {@code http://schema.org/Bone}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Bone">Bone</a>
	 */
	public static final URI Bone;

	/**
	 * Book
	 * <p>
	 * {@code http://schema.org/Book}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Book">Book</a>
	 */
	public static final URI Book;

	/**
	 * Book Edition
	 * <p>
	 * {@code http://schema.org/bookEdition}.
	 * <p>
	 * The edition of the book.
	 *
	 * @see <a href="http://schema.org/bookEdition">bookEdition</a>
	 */
	public static final URI bookEdition;

	/**
	 * Book Format
	 * <p>
	 * {@code http://schema.org/bookFormat}.
	 * <p>
	 * The format of the book.
	 *
	 * @see <a href="http://schema.org/bookFormat">bookFormat</a>
	 */
	public static final URI bookFormat;

	/**
	 * Book Format Type
	 * <p>
	 * {@code http://schema.org/BookFormatType}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BookFormatType">BookFormatType</a>
	 */
	public static final URI BookFormatType;

	/**
	 * Bookmark Action
	 * <p>
	 * {@code http://schema.org/BookmarkAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BookmarkAction">BookmarkAction</a>
	 */
	public static final URI BookmarkAction;

	/**
	 * Book Store
	 * <p>
	 * {@code http://schema.org/BookStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BookStore">BookStore</a>
	 */
	public static final URI BookStore;

	/**
	 * Borrow Action
	 * <p>
	 * {@code http://schema.org/BorrowAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BorrowAction">BorrowAction</a>
	 */
	public static final URI BorrowAction;

	/**
	 * Borrower
	 * <p>
	 * {@code http://schema.org/borrower}.
	 * <p>
	 * A sub property of participant. The person that borrows the object
	 * being lent.
	 *
	 * @see <a href="http://schema.org/borrower">borrower</a>
	 */
	public static final URI borrower;

	/**
	 * Bowling Alley
	 * <p>
	 * {@code http://schema.org/BowlingAlley}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BowlingAlley">BowlingAlley</a>
	 */
	public static final URI BowlingAlley;

	/**
	 * Box
	 * <p>
	 * {@code http://schema.org/box}.
	 * <p>
	 * A polygon is the area enclosed by a point-to-point path for which the
	 * starting and ending points are the same. A polygon is expressed as a
	 * series of four or more spacedelimited points where the first and final
	 * points are identical.
	 *
	 * @see <a href="http://schema.org/box">box</a>
	 */
	public static final URI box;

	/**
	 * Brain Structure
	 * <p>
	 * {@code http://schema.org/BrainStructure}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BrainStructure">BrainStructure</a>
	 */
	public static final URI BrainStructure;

	/**
	 * Branch
	 * <p>
	 * {@code http://schema.org/branch}.
	 * <p>
	 * The branches that delineate from the nerve bundle.
	 *
	 * @see <a href="http://schema.org/branch">branch</a>
	 */
	public static final URI branch;

	/**
	 * Branch of
	 * <p>
	 * {@code http://schema.org/branchOf}.
	 * <p>
	 * The larger organization that this local business is a branch of, if
	 * any.
	 *
	 * @see <a href="http://schema.org/branchOf">branchOf</a>
	 */
	public static final URI branchOf;

	/**
	 * Brand
	 * <p>
	 * {@code http://schema.org/Brand}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Brand">Brand</a>
	 */
	public static final URI Brand;

	/**
	 * Brand
	 * <p>
	 * {@code http://schema.org/brand}.
	 * <p>
	 * The brand(s) associated with a product or service, or the brand(s)
	 * maintained by an organization or business person.
	 *
	 * @see <a href="http://schema.org/brand">brand</a>
	 */
	public static final URI brand;

	/**
	 * Breadcrumb
	 * <p>
	 * {@code http://schema.org/breadcrumb}.
	 * <p>
	 * A set of links that can help a user understand and navigate a website
	 * hierarchy.
	 *
	 * @see <a href="http://schema.org/breadcrumb">breadcrumb</a>
	 */
	public static final URI breadcrumb;

	/**
	 * Breastfeeding Warning
	 * <p>
	 * {@code http://schema.org/breastfeedingWarning}.
	 * <p>
	 * Any precaution, guidance, contraindication, etc. related to this
	 * drug's use by breastfeeding mothers.
	 *
	 * @see <a href="http://schema.org/breastfeedingWarning">breastfeedingWarning</a>
	 */
	public static final URI breastfeedingWarning;

	/**
	 * Brewery
	 * <p>
	 * {@code http://schema.org/Brewery}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Brewery">Brewery</a>
	 */
	public static final URI Brewery;

	/**
	 * Broadcaster
	 * <p>
	 * {@code http://schema.org/broadcaster}.
	 * <p>
	 * The organization owning or operating the broadcast service.
	 *
	 * @see <a href="http://schema.org/broadcaster">broadcaster</a>
	 */
	public static final URI broadcaster;

	/**
	 * Broadcast Event
	 * <p>
	 * {@code http://schema.org/BroadcastEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BroadcastEvent">BroadcastEvent</a>
	 */
	public static final URI BroadcastEvent;

	/**
	 * Broadcast Service
	 * <p>
	 * {@code http://schema.org/BroadcastService}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BroadcastService">BroadcastService</a>
	 */
	public static final URI BroadcastService;

	/**
	 * Browser Requirements
	 * <p>
	 * {@code http://schema.org/browserRequirements}.
	 * <p>
	 * Specifies browser requirements in human-readable text. For
	 * example,"requires HTML5 support".
	 *
	 * @see <a href="http://schema.org/browserRequirements">browserRequirements</a>
	 */
	public static final URI browserRequirements;

	/**
	 * Buddhist Temple
	 * <p>
	 * {@code http://schema.org/BuddhistTemple}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BuddhistTemple">BuddhistTemple</a>
	 */
	public static final URI BuddhistTemple;

	/**
	 * Business Audience
	 * <p>
	 * {@code http://schema.org/BusinessAudience}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BusinessAudience">BusinessAudience</a>
	 */
	public static final URI BusinessAudience;

	/**
	 * Business Entity Type
	 * <p>
	 * {@code http://schema.org/BusinessEntityType}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BusinessEntityType">BusinessEntityType</a>
	 */
	public static final URI BusinessEntityType;

	/**
	 * Business Event
	 * <p>
	 * {@code http://schema.org/BusinessEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BusinessEvent">BusinessEvent</a>
	 */
	public static final URI BusinessEvent;

	/**
	 * Business Function
	 * <p>
	 * {@code http://schema.org/businessFunction}.
	 * <p>
	 * The business function (e.g. sell, lease, repair, dispose) of the offer
	 * or component of a bundle (TypeAndQuantityNode). The default is
	 * http://purl.org/goodrelations/v1#Sell.
	 *
	 * @see <a href="http://schema.org/businessFunction">businessFunction</a>
	 */
	public static final URI businessFunction;

	/**
	 * Business Function
	 * <p>
	 * {@code http://schema.org/BusinessFunction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BusinessFunction">BusinessFunction</a>
	 */
	public static final URI BusinessFunction;

	/**
	 * Bus Station
	 * <p>
	 * {@code http://schema.org/BusStation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BusStation">BusStation</a>
	 */
	public static final URI BusStation;

	/**
	 * Bus Stop
	 * <p>
	 * {@code http://schema.org/BusStop}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BusStop">BusStop</a>
	 */
	public static final URI BusStop;

	/**
	 * Buy Action
	 * <p>
	 * {@code http://schema.org/BuyAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/BuyAction">BuyAction</a>
	 */
	public static final URI BuyAction;

	/**
	 * Buyer
	 * <p>
	 * {@code http://schema.org/buyer}.
	 * <p>
	 * A sub property of participant. The participant/person/organization
	 * that bought the object.
	 *
	 * @see <a href="http://schema.org/buyer">buyer</a>
	 */
	public static final URI buyer;

	/**
	 * By Artist
	 * <p>
	 * {@code http://schema.org/byArtist}.
	 * <p>
	 * The artist that performed this album or recording.
	 *
	 * @see <a href="http://schema.org/byArtist">byArtist</a>
	 */
	public static final URI byArtist;

	/**
	 * Cafe or Coffee Shop
	 * <p>
	 * {@code http://schema.org/CafeOrCoffeeShop}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CafeOrCoffeeShop">CafeOrCoffeeShop</a>
	 */
	public static final URI CafeOrCoffeeShop;

	/**
	 * Calories
	 * <p>
	 * {@code http://schema.org/calories}.
	 * <p>
	 * The number of calories
	 *
	 * @see <a href="http://schema.org/calories">calories</a>
	 */
	public static final URI calories;

	/**
	 * Campground
	 * <p>
	 * {@code http://schema.org/Campground}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Campground">Campground</a>
	 */
	public static final URI Campground;

	/**
	 * Canal
	 * <p>
	 * {@code http://schema.org/Canal}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Canal">Canal</a>
	 */
	public static final URI Canal;

	/**
	 * Cancel Action
	 * <p>
	 * {@code http://schema.org/CancelAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CancelAction">CancelAction</a>
	 */
	public static final URI CancelAction;

	/**
	 * Candidate
	 * <p>
	 * {@code http://schema.org/candidate}.
	 * <p>
	 * A sub property of object. The candidate subject of this action.
	 *
	 * @see <a href="http://schema.org/candidate">candidate</a>
	 */
	public static final URI candidate;

	/**
	 * Caption
	 * <p>
	 * {@code http://schema.org/caption}.
	 * <p>
	 * The caption for this object.
	 *
	 * @see <a href="http://schema.org/caption">caption</a>
	 */
	public static final URI caption;

	/**
	 * Carbohydrate Content
	 * <p>
	 * {@code http://schema.org/carbohydrateContent}.
	 * <p>
	 * The number of grams of carbohydrates.
	 *
	 * @see <a href="http://schema.org/carbohydrateContent">carbohydrateContent</a>
	 */
	public static final URI carbohydrateContent;

	/**
	 * Carrier
	 * <p>
	 * {@code http://schema.org/carrier}.
	 * <p>
	 * The party responsible for the parcel delivery.
	 *
	 * @see <a href="http://schema.org/carrier">carrier</a>
	 */
	public static final URI carrier;

	/**
	 * Carrier Requirements
	 * <p>
	 * {@code http://schema.org/carrierRequirements}.
	 * <p>
	 * Specifies specific carrier(s) requirements for the application (e.g.
	 * an application may only work on a specific carrier network).
	 *
	 * @see <a href="http://schema.org/carrierRequirements">carrierRequirements</a>
	 */
	public static final URI carrierRequirements;

	/**
	 * Casino
	 * <p>
	 * {@code http://schema.org/Casino}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Casino">Casino</a>
	 */
	public static final URI Casino;

	/**
	 * Catalog
	 * <p>
	 * {@code http://schema.org/catalog}.
	 * <p>
	 * A data catalog which contains a dataset.
	 *
	 * @see <a href="http://schema.org/catalog">catalog</a>
	 */
	public static final URI catalog;

	/**
	 * Category
	 * <p>
	 * {@code http://schema.org/category}.
	 * <p>
	 * A category for the item. Greater signs or slashes can be used to
	 * informally indicate a category hierarchy.
	 *
	 * @see <a href="http://schema.org/category">category</a>
	 */
	public static final URI category;

	/**
	 * Catholic Church
	 * <p>
	 * {@code http://schema.org/CatholicChurch}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CatholicChurch">CatholicChurch</a>
	 */
	public static final URI CatholicChurch;

	/**
	 * Cause
	 * <p>
	 * {@code http://schema.org/cause}.
	 * <p>
	 * An underlying cause. More specifically, one of the causative agent(s)
	 * that are most directly responsible for the pathophysiologic process
	 * that eventually results in the occurrence.
	 *
	 * @see <a href="http://schema.org/cause">cause</a>
	 */
	public static final URI cause;

	/**
	 * Cause of
	 * <p>
	 * {@code http://schema.org/causeOf}.
	 * <p>
	 * The condition, complication, symptom, sign, etc. caused.
	 *
	 * @see <a href="http://schema.org/causeOf">causeOf</a>
	 */
	public static final URI causeOf;

	/**
	 * Cemetery
	 * <p>
	 * {@code http://schema.org/Cemetery}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Cemetery">Cemetery</a>
	 */
	public static final URI Cemetery;

	/**
	 * Check Action
	 * <p>
	 * {@code http://schema.org/CheckAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CheckAction">CheckAction</a>
	 */
	public static final URI CheckAction;

	/**
	 * Check in Action
	 * <p>
	 * {@code http://schema.org/CheckInAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CheckInAction">CheckInAction</a>
	 */
	public static final URI CheckInAction;

	/**
	 * Check Out Action
	 * <p>
	 * {@code http://schema.org/CheckOutAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CheckOutAction">CheckOutAction</a>
	 */
	public static final URI CheckOutAction;

	/**
	 * Checkout Page
	 * <p>
	 * {@code http://schema.org/CheckoutPage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CheckoutPage">CheckoutPage</a>
	 */
	public static final URI CheckoutPage;

	/**
	 * Child Care
	 * <p>
	 * {@code http://schema.org/ChildCare}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ChildCare">ChildCare</a>
	 */
	public static final URI ChildCare;

	/**
	 * Child Max Age
	 * <p>
	 * {@code http://schema.org/childMaxAge}.
	 * <p>
	 * Maximal age of the child
	 *
	 * @see <a href="http://schema.org/childMaxAge">childMaxAge</a>
	 */
	public static final URI childMaxAge;

	/**
	 * Child Min Age
	 * <p>
	 * {@code http://schema.org/childMinAge}.
	 * <p>
	 * Minimal age of the child
	 *
	 * @see <a href="http://schema.org/childMinAge">childMinAge</a>
	 */
	public static final URI childMinAge;

	/**
	 * Children
	 * <p>
	 * {@code http://schema.org/children}.
	 * <p>
	 * A child of the person.
	 *
	 * @see <a href="http://schema.org/children">children</a>
	 */
	public static final URI children;

	/**
	 * Childrens Event
	 * <p>
	 * {@code http://schema.org/ChildrensEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ChildrensEvent">ChildrensEvent</a>
	 */
	public static final URI ChildrensEvent;

	/**
	 * Cholesterol Content
	 * <p>
	 * {@code http://schema.org/cholesterolContent}.
	 * <p>
	 * The number of milligrams of cholesterol.
	 *
	 * @see <a href="http://schema.org/cholesterolContent">cholesterolContent</a>
	 */
	public static final URI cholesterolContent;

	/**
	 * Choose Action
	 * <p>
	 * {@code http://schema.org/ChooseAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ChooseAction">ChooseAction</a>
	 */
	public static final URI ChooseAction;

	/**
	 * Church
	 * <p>
	 * {@code http://schema.org/Church}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Church">Church</a>
	 */
	public static final URI Church;

	/**
	 * Circle
	 * <p>
	 * {@code http://schema.org/circle}.
	 * <p>
	 * A circle is the circular region of a specified radius centered at a
	 * specified latitude and longitude. A circle is expressed as a pair
	 * followed by a radius in meters.
	 *
	 * @see <a href="http://schema.org/circle">circle</a>
	 */
	public static final URI circle;

	/**
	 * Citation
	 * <p>
	 * {@code http://schema.org/citation}.
	 * <p>
	 * A citation or reference to another creative work, such as another
	 * publication, web page, scholarly article, etc.
	 *
	 * @see <a href="http://schema.org/citation">citation</a>
	 */
	public static final URI citation;

	/**
	 * City
	 * <p>
	 * {@code http://schema.org/City}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/City">City</a>
	 */
	public static final URI City;

	/**
	 * City Hall
	 * <p>
	 * {@code http://schema.org/CityHall}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CityHall">CityHall</a>
	 */
	public static final URI CityHall;

	/**
	 * Civic Structure
	 * <p>
	 * {@code http://schema.org/CivicStructure}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CivicStructure">CivicStructure</a>
	 */
	public static final URI CivicStructure;

	/**
	 * Class
	 * <p>
	 * {@code http://schema.org/Class}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Class">Class</a>
	 */
	public static final URI Class;

	/**
	 * Clincal Pharmacology
	 * <p>
	 * {@code http://schema.org/clincalPharmacology}.
	 * <p>
	 * Description of the absorption and elimination of drugs, including
	 * their concentration (pharmacokinetics, pK) and biological effects
	 * (pharmacodynamics, pD).
	 *
	 * @see <a href="http://schema.org/clincalPharmacology">clincalPharmacology</a>
	 */
	public static final URI clincalPharmacology;

	/**
	 * Clip
	 * <p>
	 * {@code http://schema.org/Clip}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Clip">Clip</a>
	 */
	public static final URI Clip;

	/**
	 * Clip Number
	 * <p>
	 * {@code http://schema.org/clipNumber}.
	 * <p>
	 * Position of the clip within an ordered group of clips.
	 *
	 * @see <a href="http://schema.org/clipNumber">clipNumber</a>
	 */
	public static final URI clipNumber;

	/**
	 * Closes
	 * <p>
	 * {@code http://schema.org/closes}.
	 * <p>
	 * The closing hour of the place or service on the given day(s) of the
	 * week.
	 *
	 * @see <a href="http://schema.org/closes">closes</a>
	 */
	public static final URI closes;

	/**
	 * Clothing Store
	 * <p>
	 * {@code http://schema.org/ClothingStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ClothingStore">ClothingStore</a>
	 */
	public static final URI ClothingStore;

	/**
	 * Code
	 * <p>
	 * {@code http://schema.org/Code}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Code">Code</a>
	 */
	public static final URI Code;

	/**
	 * Code
	 * <p>
	 * {@code http://schema.org/code}.
	 * <p>
	 * A medical code for the entity, taken from a controlled vocabulary or
	 * ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
	 *
	 * @see <a href="http://schema.org/code">code</a>
	 */
	public static final URI code;

	/**
	 * Code Repository
	 * <p>
	 * {@code http://schema.org/codeRepository}.
	 * <p>
	 * Link to the repository where the un-compiled, human readable code and
	 * related code is located (SVN, github, CodePlex)
	 *
	 * @see <a href="http://schema.org/codeRepository">codeRepository</a>
	 */
	public static final URI codeRepository;

	/**
	 * Code Value
	 * <p>
	 * {@code http://schema.org/codeValue}.
	 * <p>
	 * The actual code.
	 *
	 * @see <a href="http://schema.org/codeValue">codeValue</a>
	 */
	public static final URI codeValue;

	/**
	 * Coding System
	 * <p>
	 * {@code http://schema.org/codingSystem}.
	 * <p>
	 * The coding system, e.g. 'ICD-10'.
	 *
	 * @see <a href="http://schema.org/codingSystem">codingSystem</a>
	 */
	public static final URI codingSystem;

	/**
	 * Colleague
	 * <p>
	 * {@code http://schema.org/colleague}.
	 * <p>
	 * A colleague of the person.
	 *
	 * @see <a href="http://schema.org/colleague">colleague</a>
	 */
	public static final URI colleague;

	/**
	 * Colleagues
	 * <p>
	 * {@code http://schema.org/colleagues}.
	 * <p>
	 * A colleague of the person (legacy spelling; see singular form,
	 * colleague).
	 *
	 * @see <a href="http://schema.org/colleagues">colleagues</a>
	 */
	public static final URI colleagues;

	/**
	 * Collection
	 * <p>
	 * {@code http://schema.org/collection}.
	 * <p>
	 * A sub property of object. The collection target of the action.
	 *
	 * @see <a href="http://schema.org/collection">collection</a>
	 */
	public static final URI collection;

	/**
	 * Collection Page
	 * <p>
	 * {@code http://schema.org/CollectionPage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CollectionPage">CollectionPage</a>
	 */
	public static final URI CollectionPage;

	/**
	 * College or University
	 * <p>
	 * {@code http://schema.org/CollegeOrUniversity}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CollegeOrUniversity">CollegeOrUniversity</a>
	 */
	public static final URI CollegeOrUniversity;

	/**
	 * Color
	 * <p>
	 * {@code http://schema.org/color}.
	 * <p>
	 * The color of the product.
	 *
	 * @see <a href="http://schema.org/color">color</a>
	 */
	public static final URI color;

	/**
	 * Comedy Club
	 * <p>
	 * {@code http://schema.org/ComedyClub}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ComedyClub">ComedyClub</a>
	 */
	public static final URI ComedyClub;

	/**
	 * Comedy Event
	 * <p>
	 * {@code http://schema.org/ComedyEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ComedyEvent">ComedyEvent</a>
	 */
	public static final URI ComedyEvent;

	/**
	 * Comment
	 * <p>
	 * {@code http://schema.org/Comment}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Comment">Comment</a>
	 */
	public static final URI Comment;

	/**
	 * Comment
	 * <p>
	 * {@code http://schema.org/comment}.
	 * <p>
	 * Comments, typically from users, on this CreativeWork.
	 *
	 * @see <a href="http://schema.org/comment">comment</a>
	 */
	public static final URI comment;

	/**
	 * Comment Action
	 * <p>
	 * {@code http://schema.org/CommentAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CommentAction">CommentAction</a>
	 */
	public static final URI CommentAction;

	/**
	 * Comment Text
	 * <p>
	 * {@code http://schema.org/commentText}.
	 * <p>
	 * The text of the UserComment.
	 *
	 * @see <a href="http://schema.org/commentText">commentText</a>
	 */
	public static final URI commentText;

	/**
	 * Comment Time
	 * <p>
	 * {@code http://schema.org/commentTime}.
	 * <p>
	 * The time at which the UserComment was made.
	 *
	 * @see <a href="http://schema.org/commentTime">commentTime</a>
	 */
	public static final URI commentTime;

	/**
	 * Communicate Action
	 * <p>
	 * {@code http://schema.org/CommunicateAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CommunicateAction">CommunicateAction</a>
	 */
	public static final URI CommunicateAction;

	/**
	 * Comprised of
	 * <p>
	 * {@code http://schema.org/comprisedOf}.
	 * <p>
	 * The underlying anatomical structures, such as organs, that comprise
	 * the anatomical system.
	 *
	 * @see <a href="http://schema.org/comprisedOf">comprisedOf</a>
	 */
	public static final URI comprisedOf;

	/**
	 * Computer Store
	 * <p>
	 * {@code http://schema.org/ComputerStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ComputerStore">ComputerStore</a>
	 */
	public static final URI ComputerStore;

	/**
	 * Confirm Action
	 * <p>
	 * {@code http://schema.org/ConfirmAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ConfirmAction">ConfirmAction</a>
	 */
	public static final URI ConfirmAction;

	/**
	 * Confirmation Number
	 * <p>
	 * {@code http://schema.org/confirmationNumber}.
	 * <p>
	 * A number that confirms the given order.
	 *
	 * @see <a href="http://schema.org/confirmationNumber">confirmationNumber</a>
	 */
	public static final URI confirmationNumber;

	/**
	 * Connected to
	 * <p>
	 * {@code http://schema.org/connectedTo}.
	 * <p>
	 * Other anatomical structures to which this structure is connected.
	 *
	 * @see <a href="http://schema.org/connectedTo">connectedTo</a>
	 */
	public static final URI connectedTo;

	/**
	 * Consume Action
	 * <p>
	 * {@code http://schema.org/ConsumeAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ConsumeAction">ConsumeAction</a>
	 */
	public static final URI ConsumeAction;

	/**
	 * Contact Option
	 * <p>
	 * {@code http://schema.org/contactOption}.
	 * <p>
	 * An option available on this contact point (e.g. a toll-free number or
	 * support for hearing-impaired callers.)
	 *
	 * @see <a href="http://schema.org/contactOption">contactOption</a>
	 */
	public static final URI contactOption;

	/**
	 * Contact Page
	 * <p>
	 * {@code http://schema.org/ContactPage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ContactPage">ContactPage</a>
	 */
	public static final URI ContactPage;

	/**
	 * Contact Point
	 * <p>
	 * {@code http://schema.org/ContactPoint}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ContactPoint">ContactPoint</a>
	 */
	public static final URI ContactPoint;

	/**
	 * Contact Point
	 * <p>
	 * {@code http://schema.org/contactPoint}.
	 * <p>
	 * A contact point for a person or organization.
	 *
	 * @see <a href="http://schema.org/contactPoint">contactPoint</a>
	 */
	public static final URI contactPoint;

	/**
	 * Contact Point Option
	 * <p>
	 * {@code http://schema.org/ContactPointOption}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ContactPointOption">ContactPointOption</a>
	 */
	public static final URI ContactPointOption;

	/**
	 * Contact Points
	 * <p>
	 * {@code http://schema.org/contactPoints}.
	 * <p>
	 * A contact point for a person or organization (legacy spelling; see
	 * singular form, contactPoint).
	 *
	 * @see <a href="http://schema.org/contactPoints">contactPoints</a>
	 */
	public static final URI contactPoints;

	/**
	 * Contact Type
	 * <p>
	 * {@code http://schema.org/contactType}.
	 * <p>
	 * A person or organization can have different contact points, for
	 * different purposes. For example, a sales contact point, a PR contact
	 * point and so on. This property is used to specify the kind of contact
	 * point.
	 *
	 * @see <a href="http://schema.org/contactType">contactType</a>
	 */
	public static final URI contactType;

	/**
	 * Contained in
	 * <p>
	 * {@code http://schema.org/containedIn}.
	 * <p>
	 * The basic containment relation between places.
	 *
	 * @see <a href="http://schema.org/containedIn">containedIn</a>
	 */
	public static final URI containedIn;

	/**
	 * Content Location
	 * <p>
	 * {@code http://schema.org/contentLocation}.
	 * <p>
	 * The location of the content.
	 *
	 * @see <a href="http://schema.org/contentLocation">contentLocation</a>
	 */
	public static final URI contentLocation;

	/**
	 * Content Rating
	 * <p>
	 * {@code http://schema.org/contentRating}.
	 * <p>
	 * Official rating of a piece of content—for example,'MPAA PG-13'.
	 *
	 * @see <a href="http://schema.org/contentRating">contentRating</a>
	 */
	public static final URI contentRating;

	/**
	 * Content Size
	 * <p>
	 * {@code http://schema.org/contentSize}.
	 * <p>
	 * File size in (mega/kilo) bytes.
	 *
	 * @see <a href="http://schema.org/contentSize">contentSize</a>
	 */
	public static final URI contentSize;

	/**
	 * Content Url
	 * <p>
	 * {@code http://schema.org/contentUrl}.
	 * <p>
	 * Actual bytes of the media object, for example the image file or video
	 * file. (previous spelling: contentURL)
	 *
	 * @see <a href="http://schema.org/contentUrl">contentUrl</a>
	 */
	public static final URI contentUrl;

	/**
	 * Continent
	 * <p>
	 * {@code http://schema.org/Continent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Continent">Continent</a>
	 */
	public static final URI Continent;

	/**
	 * Contraindication
	 * <p>
	 * {@code http://schema.org/contraindication}.
	 * <p>
	 * A contraindication for this therapy.
	 *
	 * @see <a href="http://schema.org/contraindication">contraindication</a>
	 */
	public static final URI contraindication;

	/**
	 * Contributor
	 * <p>
	 * {@code http://schema.org/contributor}.
	 * <p>
	 * A secondary contributor to the CreativeWork.
	 *
	 * @see <a href="http://schema.org/contributor">contributor</a>
	 */
	public static final URI contributor;

	/**
	 * Convenience Store
	 * <p>
	 * {@code http://schema.org/ConvenienceStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ConvenienceStore">ConvenienceStore</a>
	 */
	public static final URI ConvenienceStore;

	/**
	 * Cook Action
	 * <p>
	 * {@code http://schema.org/CookAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CookAction">CookAction</a>
	 */
	public static final URI CookAction;

	/**
	 * Cooking Method
	 * <p>
	 * {@code http://schema.org/cookingMethod}.
	 * <p>
	 * The method of cooking, such as Frying, Steaming, ...
	 *
	 * @see <a href="http://schema.org/cookingMethod">cookingMethod</a>
	 */
	public static final URI cookingMethod;

	/**
	 * Cook Time
	 * <p>
	 * {@code http://schema.org/cookTime}.
	 * <p>
	 * The time it takes to actually cook the dish, in ISO 8601 duration
	 * format.
	 *
	 * @see <a href="http://schema.org/cookTime">cookTime</a>
	 */
	public static final URI cookTime;

	/**
	 * Copyright Holder
	 * <p>
	 * {@code http://schema.org/copyrightHolder}.
	 * <p>
	 * The party holding the legal copyright to the CreativeWork.
	 *
	 * @see <a href="http://schema.org/copyrightHolder">copyrightHolder</a>
	 */
	public static final URI copyrightHolder;

	/**
	 * Copyright Year
	 * <p>
	 * {@code http://schema.org/copyrightYear}.
	 * <p>
	 * The year during which the claimed copyright for the CreativeWork was
	 * first asserted.
	 *
	 * @see <a href="http://schema.org/copyrightYear">copyrightYear</a>
	 */
	public static final URI copyrightYear;

	/**
	 * Corporation
	 * <p>
	 * {@code http://schema.org/Corporation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Corporation">Corporation</a>
	 */
	public static final URI Corporation;

	/**
	 * Cost
	 * <p>
	 * {@code http://schema.org/cost}.
	 * <p>
	 * Cost per unit of the drug, as reported by the source being tagged.
	 *
	 * @see <a href="http://schema.org/cost">cost</a>
	 */
	public static final URI cost;

	/**
	 * Cost Category
	 * <p>
	 * {@code http://schema.org/costCategory}.
	 * <p>
	 * The category of cost, such as wholesale, retail, reimbursement cap,
	 * etc.
	 *
	 * @see <a href="http://schema.org/costCategory">costCategory</a>
	 */
	public static final URI costCategory;

	/**
	 * Cost Currency
	 * <p>
	 * {@code http://schema.org/costCurrency}.
	 * <p>
	 * The currency (in 3-letter ISO 4217 format) of the drug cost.
	 *
	 * @see <a href="http://schema.org/costCurrency">costCurrency</a>
	 */
	public static final URI costCurrency;

	/**
	 * Cost Origin
	 * <p>
	 * {@code http://schema.org/costOrigin}.
	 * <p>
	 * Additional details to capture the origin of the cost data. For
	 * example, 'Medicare Part B'.
	 *
	 * @see <a href="http://schema.org/costOrigin">costOrigin</a>
	 */
	public static final URI costOrigin;

	/**
	 * Cost Per Unit
	 * <p>
	 * {@code http://schema.org/costPerUnit}.
	 * <p>
	 * The cost per unit of the drug.
	 *
	 * @see <a href="http://schema.org/costPerUnit">costPerUnit</a>
	 */
	public static final URI costPerUnit;

	/**
	 * Countries Not Supported
	 * <p>
	 * {@code http://schema.org/countriesNotSupported}.
	 * <p>
	 * Countries for which the application is not supported. You can also
	 * provide the two-letter ISO 3166-1 alpha-2 country code.
	 *
	 * @see <a href="http://schema.org/countriesNotSupported">countriesNotSupported</a>
	 */
	public static final URI countriesNotSupported;

	/**
	 * Countries Supported
	 * <p>
	 * {@code http://schema.org/countriesSupported}.
	 * <p>
	 * Countries for which the application is supported. You can also provide
	 * the two-letter ISO 3166-1 alpha-2 country code.
	 *
	 * @see <a href="http://schema.org/countriesSupported">countriesSupported</a>
	 */
	public static final URI countriesSupported;

	/**
	 * Country
	 * <p>
	 * {@code http://schema.org/Country}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Country">Country</a>
	 */
	public static final URI Country;

	/**
	 * Course
	 * <p>
	 * {@code http://schema.org/course}.
	 * <p>
	 * A sub property of location. The course where this action was taken.
	 *
	 * @see <a href="http://schema.org/course">course</a>
	 */
	public static final URI course;

	/**
	 * Courthouse
	 * <p>
	 * {@code http://schema.org/Courthouse}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Courthouse">Courthouse</a>
	 */
	public static final URI Courthouse;

	/**
	 * Create Action
	 * <p>
	 * {@code http://schema.org/CreateAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CreateAction">CreateAction</a>
	 */
	public static final URI CreateAction;

	/**
	 * Creative Work
	 * <p>
	 * {@code http://schema.org/CreativeWork}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CreativeWork">CreativeWork</a>
	 */
	public static final URI CreativeWork;

	/**
	 * Creator
	 * <p>
	 * {@code http://schema.org/creator}.
	 * <p>
	 * The creator/author of this CreativeWork or UserComments. This is the
	 * same as the Author property for CreativeWork.
	 *
	 * @see <a href="http://schema.org/creator">creator</a>
	 */
	public static final URI creator;

	/**
	 * Credit Card
	 * <p>
	 * {@code http://schema.org/CreditCard}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/CreditCard">CreditCard</a>
	 */
	public static final URI CreditCard;

	/**
	 * Crematorium
	 * <p>
	 * {@code http://schema.org/Crematorium}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Crematorium">Crematorium</a>
	 */
	public static final URI Crematorium;

	/**
	 * Currencies Accepted
	 * <p>
	 * {@code http://schema.org/currenciesAccepted}.
	 * <p>
	 * The currency accepted (in ISO 4217 currency format).
	 *
	 * @see <a href="http://schema.org/currenciesAccepted">currenciesAccepted</a>
	 */
	public static final URI currenciesAccepted;

	/**
	 * Customer
	 * <p>
	 * {@code http://schema.org/customer}.
	 * <p>
	 * Party placing the order.
	 *
	 * @see <a href="http://schema.org/customer">customer</a>
	 */
	public static final URI customer;

	/**
	 * Dance Event
	 * <p>
	 * {@code http://schema.org/DanceEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DanceEvent">DanceEvent</a>
	 */
	public static final URI DanceEvent;

	/**
	 * Dance Group
	 * <p>
	 * {@code http://schema.org/DanceGroup}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DanceGroup">DanceGroup</a>
	 */
	public static final URI DanceGroup;

	/**
	 * Data Catalog
	 * <p>
	 * {@code http://schema.org/DataCatalog}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DataCatalog">DataCatalog</a>
	 */
	public static final URI DataCatalog;

	/**
	 * Data Download
	 * <p>
	 * {@code http://schema.org/DataDownload}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DataDownload">DataDownload</a>
	 */
	public static final URI DataDownload;

	/**
	 * Dataset
	 * <p>
	 * {@code http://schema.org/dataset}.
	 * <p>
	 * A dataset contained in a catalog.
	 *
	 * @see <a href="http://schema.org/dataset">dataset</a>
	 */
	public static final URI dataset;

	/**
	 * Dataset
	 * <p>
	 * {@code http://schema.org/Dataset}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Dataset">Dataset</a>
	 */
	public static final URI Dataset;

	/**
	 * Date Created
	 * <p>
	 * {@code http://schema.org/dateCreated}.
	 * <p>
	 * The date on which the CreativeWork was created.
	 *
	 * @see <a href="http://schema.org/dateCreated">dateCreated</a>
	 */
	public static final URI dateCreated;

	/**
	 * Dateline
	 * <p>
	 * {@code http://schema.org/dateline}.
	 * <p>
	 * The location where the NewsArticle was produced.
	 *
	 * @see <a href="http://schema.org/dateline">dateline</a>
	 */
	public static final URI dateline;

	/**
	 * Date Modified
	 * <p>
	 * {@code http://schema.org/dateModified}.
	 * <p>
	 * The date on which the CreativeWork was most recently modified.
	 *
	 * @see <a href="http://schema.org/dateModified">dateModified</a>
	 */
	public static final URI dateModified;

	/**
	 * Date Posted
	 * <p>
	 * {@code http://schema.org/datePosted}.
	 * <p>
	 * Publication date for the job posting.
	 *
	 * @see <a href="http://schema.org/datePosted">datePosted</a>
	 */
	public static final URI datePosted;

	/**
	 * Date Published
	 * <p>
	 * {@code http://schema.org/datePublished}.
	 * <p>
	 * Date of first broadcast/publication.
	 *
	 * @see <a href="http://schema.org/datePublished">datePublished</a>
	 */
	public static final URI datePublished;

	/**
	 * Day of Week
	 * <p>
	 * {@code http://schema.org/DayOfWeek}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DayOfWeek">DayOfWeek</a>
	 */
	public static final URI DayOfWeek;

	/**
	 * Day of Week
	 * <p>
	 * {@code http://schema.org/dayOfWeek}.
	 * <p>
	 * The day of the week for which these opening hours are valid.
	 *
	 * @see <a href="http://schema.org/dayOfWeek">dayOfWeek</a>
	 */
	public static final URI dayOfWeek;

	/**
	 * Day Spa
	 * <p>
	 * {@code http://schema.org/DaySpa}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DaySpa">DaySpa</a>
	 */
	public static final URI DaySpa;

	/**
	 * D Dx Element
	 * <p>
	 * {@code http://schema.org/DDxElement}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DDxElement">DDxElement</a>
	 */
	public static final URI DDxElement;

	/**
	 * Death Date
	 * <p>
	 * {@code http://schema.org/deathDate}.
	 * <p>
	 * Date of death.
	 *
	 * @see <a href="http://schema.org/deathDate">deathDate</a>
	 */
	public static final URI deathDate;

	/**
	 * Defence Establishment
	 * <p>
	 * {@code http://schema.org/DefenceEstablishment}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DefenceEstablishment">DefenceEstablishment</a>
	 */
	public static final URI DefenceEstablishment;

	/**
	 * Delete Action
	 * <p>
	 * {@code http://schema.org/DeleteAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DeleteAction">DeleteAction</a>
	 */
	public static final URI DeleteAction;

	/**
	 * Delivery Address
	 * <p>
	 * {@code http://schema.org/deliveryAddress}.
	 * <p>
	 * Destination address.
	 *
	 * @see <a href="http://schema.org/deliveryAddress">deliveryAddress</a>
	 */
	public static final URI deliveryAddress;

	/**
	 * Delivery Charge Specification
	 * <p>
	 * {@code http://schema.org/DeliveryChargeSpecification}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DeliveryChargeSpecification">DeliveryChargeSpecification</a>
	 */
	public static final URI DeliveryChargeSpecification;

	/**
	 * Delivery Event
	 * <p>
	 * {@code http://schema.org/DeliveryEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DeliveryEvent">DeliveryEvent</a>
	 */
	public static final URI DeliveryEvent;

	/**
	 * Delivery Lead Time
	 * <p>
	 * {@code http://schema.org/deliveryLeadTime}.
	 * <p>
	 * The typical delay between the receipt of the order and the goods
	 * leaving the warehouse.
	 *
	 * @see <a href="http://schema.org/deliveryLeadTime">deliveryLeadTime</a>
	 */
	public static final URI deliveryLeadTime;

	/**
	 * Delivery Method
	 * <p>
	 * {@code http://schema.org/DeliveryMethod}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DeliveryMethod">DeliveryMethod</a>
	 */
	public static final URI DeliveryMethod;

	/**
	 * Delivery Method
	 * <p>
	 * {@code http://schema.org/deliveryMethod}.
	 * <p>
	 * A sub property of instrument. The method of delivery
	 *
	 * @see <a href="http://schema.org/deliveryMethod">deliveryMethod</a>
	 */
	public static final URI deliveryMethod;

	/**
	 * Delivery Status
	 * <p>
	 * {@code http://schema.org/deliveryStatus}.
	 * <p>
	 * New entry added as the package passes through each leg of its journey
	 * (from shipment to final delivery).
	 *
	 * @see <a href="http://schema.org/deliveryStatus">deliveryStatus</a>
	 */
	public static final URI deliveryStatus;

	/**
	 * Demand
	 * <p>
	 * {@code http://schema.org/Demand}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Demand">Demand</a>
	 */
	public static final URI Demand;

	/**
	 * Dentist
	 * <p>
	 * {@code http://schema.org/Dentist}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Dentist">Dentist</a>
	 */
	public static final URI Dentist;

	/**
	 * Depart Action
	 * <p>
	 * {@code http://schema.org/DepartAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DepartAction">DepartAction</a>
	 */
	public static final URI DepartAction;

	/**
	 * Department
	 * <p>
	 * {@code http://schema.org/department}.
	 * <p>
	 * A relationship between an organization and a department of that
	 * organization, also described as an organization (allowing different
	 * urls, logos, opening hours). For example: a store with a pharmacy, or
	 * a bakery with a cafe.
	 *
	 * @see <a href="http://schema.org/department">department</a>
	 */
	public static final URI department;

	/**
	 * Department Store
	 * <p>
	 * {@code http://schema.org/DepartmentStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DepartmentStore">DepartmentStore</a>
	 */
	public static final URI DepartmentStore;

	/**
	 * Dependencies
	 * <p>
	 * {@code http://schema.org/dependencies}.
	 * <p>
	 * Prerequisites needed to fulfill steps in article.
	 *
	 * @see <a href="http://schema.org/dependencies">dependencies</a>
	 */
	public static final URI dependencies;

	/**
	 * Depth
	 * <p>
	 * {@code http://schema.org/depth}.
	 * <p>
	 * The depth of the product.
	 *
	 * @see <a href="http://schema.org/depth">depth</a>
	 */
	public static final URI depth;

	/**
	 * Description
	 * <p>
	 * {@code http://schema.org/description}.
	 * <p>
	 * A short description of the item.
	 *
	 * @see <a href="http://schema.org/description">description</a>
	 */
	public static final URI description;

	/**
	 * Device
	 * <p>
	 * {@code http://schema.org/device}.
	 * <p>
	 * Device required to run the application. Used in cases where a specific
	 * make/model is required to run the application.
	 *
	 * @see <a href="http://schema.org/device">device</a>
	 */
	public static final URI device;

	/**
	 * Diagnosis
	 * <p>
	 * {@code http://schema.org/diagnosis}.
	 * <p>
	 * One or more alternative conditions considered in the differential
	 * diagnosis process.
	 *
	 * @see <a href="http://schema.org/diagnosis">diagnosis</a>
	 */
	public static final URI diagnosis;

	/**
	 * Diagnostic Lab
	 * <p>
	 * {@code http://schema.org/DiagnosticLab}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DiagnosticLab">DiagnosticLab</a>
	 */
	public static final URI DiagnosticLab;

	/**
	 * Diagnostic Procedure
	 * <p>
	 * {@code http://schema.org/DiagnosticProcedure}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DiagnosticProcedure">DiagnosticProcedure</a>
	 */
	public static final URI DiagnosticProcedure;

	/**
	 * Diagram
	 * <p>
	 * {@code http://schema.org/diagram}.
	 * <p>
	 * An image containing a diagram that illustrates the structure and/or
	 * its component substructures and/or connections with other structures.
	 *
	 * @see <a href="http://schema.org/diagram">diagram</a>
	 */
	public static final URI diagram;

	/**
	 * Diet
	 * <p>
	 * {@code http://schema.org/Diet}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Diet">Diet</a>
	 */
	public static final URI Diet;

	/**
	 * Diet
	 * <p>
	 * {@code http://schema.org/diet}.
	 * <p>
	 * A sub property of instrument. The died used in this action.
	 *
	 * @see <a href="http://schema.org/diet">diet</a>
	 */
	public static final URI diet;

	/**
	 * Dietary Supplement
	 * <p>
	 * {@code http://schema.org/DietarySupplement}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DietarySupplement">DietarySupplement</a>
	 */
	public static final URI DietarySupplement;

	/**
	 * Diet Features
	 * <p>
	 * {@code http://schema.org/dietFeatures}.
	 * <p>
	 * Nutritional information specific to the dietary plan. May include
	 * dietary recommendations on what foods to avoid, what foods to consume,
	 * and specific alterations/deviations from the USDA or other regulatory
	 * body's approved dietary guidelines.
	 *
	 * @see <a href="http://schema.org/dietFeatures">dietFeatures</a>
	 */
	public static final URI dietFeatures;

	/**
	 * Differential Diagnosis
	 * <p>
	 * {@code http://schema.org/differentialDiagnosis}.
	 * <p>
	 * One of a set of differential diagnoses for the condition.
	 * Specifically, a closely-related or competing diagnosis typically
	 * considered later in the cognitive process whereby this medical
	 * condition is distinguished from others most likely responsible for a
	 * similar collection of signs and symptoms to reach the most
	 * parsimonious diagnosis or diagnoses in a patient.
	 *
	 * @see <a href="http://schema.org/differentialDiagnosis">differentialDiagnosis</a>
	 */
	public static final URI differentialDiagnosis;

	/**
	 * Director
	 * <p>
	 * {@code http://schema.org/director}.
	 * <p>
	 * The director of the movie, tv/radio episode or series.
	 *
	 * @see <a href="http://schema.org/director">director</a>
	 */
	public static final URI director;

	/**
	 * Directors
	 * <p>
	 * {@code http://schema.org/directors}.
	 * <p>
	 * The director of the movie, tv/radio episode or series. (legacy
	 * spelling; see singular form, director)
	 *
	 * @see <a href="http://schema.org/directors">directors</a>
	 */
	public static final URI directors;

	/**
	 * Disagree Action
	 * <p>
	 * {@code http://schema.org/DisagreeAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DisagreeAction">DisagreeAction</a>
	 */
	public static final URI DisagreeAction;

	/**
	 * Discount
	 * <p>
	 * {@code http://schema.org/discount}.
	 * <p>
	 * Any discount applied (to an Order).
	 *
	 * @see <a href="http://schema.org/discount">discount</a>
	 */
	public static final URI discount;

	/**
	 * Discount Code
	 * <p>
	 * {@code http://schema.org/discountCode}.
	 * <p>
	 * Code used to redeem a discount.
	 *
	 * @see <a href="http://schema.org/discountCode">discountCode</a>
	 */
	public static final URI discountCode;

	/**
	 * Discount Currency
	 * <p>
	 * {@code http://schema.org/discountCurrency}.
	 * <p>
	 * The currency (in 3-letter ISO 4217 format) of the discount.
	 *
	 * @see <a href="http://schema.org/discountCurrency">discountCurrency</a>
	 */
	public static final URI discountCurrency;

	/**
	 * Discover Action
	 * <p>
	 * {@code http://schema.org/DiscoverAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DiscoverAction">DiscoverAction</a>
	 */
	public static final URI DiscoverAction;

	/**
	 * Discusses
	 * <p>
	 * {@code http://schema.org/discusses}.
	 * <p>
	 * Specifies the CreativeWork associated with the UserComment.
	 *
	 * @see <a href="http://schema.org/discusses">discusses</a>
	 */
	public static final URI discusses;

	/**
	 * Discussion Url
	 * <p>
	 * {@code http://schema.org/discussionUrl}.
	 * <p>
	 * A link to the page containing the comments of the CreativeWork.
	 *
	 * @see <a href="http://schema.org/discussionUrl">discussionUrl</a>
	 */
	public static final URI discussionUrl;

	/**
	 * Dislike Action
	 * <p>
	 * {@code http://schema.org/DislikeAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DislikeAction">DislikeAction</a>
	 */
	public static final URI DislikeAction;

	/**
	 * Distance
	 * <p>
	 * {@code http://schema.org/distance}.
	 * <p>
	 * A sub property of asset. The distance travelled.
	 *
	 * @see <a href="http://schema.org/distance">distance</a>
	 */
	public static final URI distance;

	/**
	 * Distance
	 * <p>
	 * {@code http://schema.org/Distance}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Distance">Distance</a>
	 */
	public static final URI Distance;

	/**
	 * Distinguishing Sign
	 * <p>
	 * {@code http://schema.org/distinguishingSign}.
	 * <p>
	 * One of a set of signs and symptoms that can be used to distinguish
	 * this diagnosis from others in the differential diagnosis.
	 *
	 * @see <a href="http://schema.org/distinguishingSign">distinguishingSign</a>
	 */
	public static final URI distinguishingSign;

	/**
	 * Distribution
	 * <p>
	 * {@code http://schema.org/distribution}.
	 * <p>
	 * A downloadable form of this dataset, at a specific location, in a
	 * specific format.
	 *
	 * @see <a href="http://schema.org/distribution">distribution</a>
	 */
	public static final URI distribution;

	/**
	 * Domain Includes
	 * <p>
	 * {@code http://schema.org/domainIncludes}.
	 * <p>
	 * Relates a property to a class that is (one of) the type(s) the
	 * property is expected to be used on.
	 *
	 * @see <a href="http://schema.org/domainIncludes">domainIncludes</a>
	 */
	public static final URI domainIncludes;

	/**
	 * Donate Action
	 * <p>
	 * {@code http://schema.org/DonateAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DonateAction">DonateAction</a>
	 */
	public static final URI DonateAction;

	/**
	 * Door Time
	 * <p>
	 * {@code http://schema.org/doorTime}.
	 * <p>
	 * The time admission will commence.
	 *
	 * @see <a href="http://schema.org/doorTime">doorTime</a>
	 */
	public static final URI doorTime;

	/**
	 * Dosage Form
	 * <p>
	 * {@code http://schema.org/dosageForm}.
	 * <p>
	 * A dosage form in which this drug/supplement is available, e.g.
	 * 'tablet', 'suspension', 'injection'.
	 *
	 * @see <a href="http://schema.org/dosageForm">dosageForm</a>
	 */
	public static final URI dosageForm;

	/**
	 * Dose Schedule
	 * <p>
	 * {@code http://schema.org/DoseSchedule}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DoseSchedule">DoseSchedule</a>
	 */
	public static final URI DoseSchedule;

	/**
	 * Dose Schedule
	 * <p>
	 * {@code http://schema.org/doseSchedule}.
	 * <p>
	 * A dosing schedule for the drug for a given population, either
	 * observed, recommended, or maximum dose based on the type used.
	 *
	 * @see <a href="http://schema.org/doseSchedule">doseSchedule</a>
	 */
	public static final URI doseSchedule;

	/**
	 * Dose Unit
	 * <p>
	 * {@code http://schema.org/doseUnit}.
	 * <p>
	 * The unit of the dose, e.g. 'mg'.
	 *
	 * @see <a href="http://schema.org/doseUnit">doseUnit</a>
	 */
	public static final URI doseUnit;

	/**
	 * Dose Value
	 * <p>
	 * {@code http://schema.org/doseValue}.
	 * <p>
	 * The value of the dose, e.g. 500.
	 *
	 * @see <a href="http://schema.org/doseValue">doseValue</a>
	 */
	public static final URI doseValue;

	/**
	 * Download Action
	 * <p>
	 * {@code http://schema.org/DownloadAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DownloadAction">DownloadAction</a>
	 */
	public static final URI DownloadAction;

	/**
	 * Download Url
	 * <p>
	 * {@code http://schema.org/downloadUrl}.
	 * <p>
	 * If the file can be downloaded, URL to download the binary.
	 *
	 * @see <a href="http://schema.org/downloadUrl">downloadUrl</a>
	 */
	public static final URI downloadUrl;

	/**
	 * Drains to
	 * <p>
	 * {@code http://schema.org/drainsTo}.
	 * <p>
	 * The vasculature that the vein drains into.
	 *
	 * @see <a href="http://schema.org/drainsTo">drainsTo</a>
	 */
	public static final URI drainsTo;

	/**
	 * Draw Action
	 * <p>
	 * {@code http://schema.org/DrawAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DrawAction">DrawAction</a>
	 */
	public static final URI DrawAction;

	/**
	 * Drink Action
	 * <p>
	 * {@code http://schema.org/DrinkAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DrinkAction">DrinkAction</a>
	 */
	public static final URI DrinkAction;

	/**
	 * Drug
	 * <p>
	 * {@code http://schema.org/Drug}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Drug">Drug</a>
	 */
	public static final URI Drug;

	/**
	 * Drug
	 * <p>
	 * {@code http://schema.org/drug}.
	 * <p>
	 * A drug in this drug class.
	 *
	 * @see <a href="http://schema.org/drug">drug</a>
	 */
	public static final URI drug;

	/**
	 * Drug Class
	 * <p>
	 * {@code http://schema.org/drugClass}.
	 * <p>
	 * The class of drug this belongs to (e.g., statins).
	 *
	 * @see <a href="http://schema.org/drugClass">drugClass</a>
	 */
	public static final URI drugClass;

	/**
	 * Drug Class
	 * <p>
	 * {@code http://schema.org/DrugClass}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DrugClass">DrugClass</a>
	 */
	public static final URI DrugClass;

	/**
	 * Drug Cost
	 * <p>
	 * {@code http://schema.org/DrugCost}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DrugCost">DrugCost</a>
	 */
	public static final URI DrugCost;

	/**
	 * Drug Cost Category
	 * <p>
	 * {@code http://schema.org/DrugCostCategory}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DrugCostCategory">DrugCostCategory</a>
	 */
	public static final URI DrugCostCategory;

	/**
	 * Drug Legal Status
	 * <p>
	 * {@code http://schema.org/DrugLegalStatus}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DrugLegalStatus">DrugLegalStatus</a>
	 */
	public static final URI DrugLegalStatus;

	/**
	 * Drug Pregnancy Category
	 * <p>
	 * {@code http://schema.org/DrugPregnancyCategory}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DrugPregnancyCategory">DrugPregnancyCategory</a>
	 */
	public static final URI DrugPregnancyCategory;

	/**
	 * Drug Prescription Status
	 * <p>
	 * {@code http://schema.org/DrugPrescriptionStatus}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DrugPrescriptionStatus">DrugPrescriptionStatus</a>
	 */
	public static final URI DrugPrescriptionStatus;

	/**
	 * Drug Strength
	 * <p>
	 * {@code http://schema.org/DrugStrength}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DrugStrength">DrugStrength</a>
	 */
	public static final URI DrugStrength;

	/**
	 * Drug Unit
	 * <p>
	 * {@code http://schema.org/drugUnit}.
	 * <p>
	 * The unit in which the drug is measured, e.g. '5 mg tablet'.
	 *
	 * @see <a href="http://schema.org/drugUnit">drugUnit</a>
	 */
	public static final URI drugUnit;

	/**
	 * Dry Cleaning or Laundry
	 * <p>
	 * {@code http://schema.org/DryCleaningOrLaundry}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/DryCleaningOrLaundry">DryCleaningOrLaundry</a>
	 */
	public static final URI DryCleaningOrLaundry;

	/**
	 * Duns
	 * <p>
	 * {@code http://schema.org/duns}.
	 * <p>
	 * The Dun & Bradstreet DUNS number for identifying an organization or
	 * business person.
	 *
	 * @see <a href="http://schema.org/duns">duns</a>
	 */
	public static final URI duns;

	/**
	 * Duplicate Therapy
	 * <p>
	 * {@code http://schema.org/duplicateTherapy}.
	 * <p>
	 * A therapy that duplicates or overlaps this one.
	 *
	 * @see <a href="http://schema.org/duplicateTherapy">duplicateTherapy</a>
	 */
	public static final URI duplicateTherapy;

	/**
	 * Duration
	 * <p>
	 * {@code http://schema.org/Duration}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Duration">Duration</a>
	 */
	public static final URI Duration;

	/**
	 * Duration
	 * <p>
	 * {@code http://schema.org/duration}.
	 * <p>
	 * The duration of the item (movie, audio recording, event, etc.) in ISO
	 * 8601 date format.
	 *
	 * @see <a href="http://schema.org/duration">duration</a>
	 */
	public static final URI duration;

	/**
	 * Duration of Warranty
	 * <p>
	 * {@code http://schema.org/durationOfWarranty}.
	 * <p>
	 * The duration of the warranty promise. Common unitCode values are ANN
	 * for year, MON for months, or DAY for days.
	 *
	 * @see <a href="http://schema.org/durationOfWarranty">durationOfWarranty</a>
	 */
	public static final URI durationOfWarranty;

	/**
	 * Eat Action
	 * <p>
	 * {@code http://schema.org/EatAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/EatAction">EatAction</a>
	 */
	public static final URI EatAction;

	/**
	 * Editor
	 * <p>
	 * {@code http://schema.org/editor}.
	 * <p>
	 * Specifies the Person who edited the CreativeWork.
	 *
	 * @see <a href="http://schema.org/editor">editor</a>
	 */
	public static final URI editor;

	/**
	 * Educational Alignment
	 * <p>
	 * {@code http://schema.org/educationalAlignment}.
	 * <p>
	 * An alignment to an established educational framework.
	 *
	 * @see <a href="http://schema.org/educationalAlignment">educationalAlignment</a>
	 */
	public static final URI educationalAlignment;

	/**
	 * Educational Audience
	 * <p>
	 * {@code http://schema.org/EducationalAudience}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/EducationalAudience">EducationalAudience</a>
	 */
	public static final URI EducationalAudience;

	/**
	 * Educational Framework
	 * <p>
	 * {@code http://schema.org/educationalFramework}.
	 * <p>
	 * The framework to which the resource being described is aligned.
	 *
	 * @see <a href="http://schema.org/educationalFramework">educationalFramework</a>
	 */
	public static final URI educationalFramework;

	/**
	 * Educational Organization
	 * <p>
	 * {@code http://schema.org/EducationalOrganization}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/EducationalOrganization">EducationalOrganization</a>
	 */
	public static final URI EducationalOrganization;

	/**
	 * Educational Role
	 * <p>
	 * {@code http://schema.org/educationalRole}.
	 * <p>
	 * An educationalRole of an EducationalAudience
	 *
	 * @see <a href="http://schema.org/educationalRole">educationalRole</a>
	 */
	public static final URI educationalRole;

	/**
	 * Educational Use
	 * <p>
	 * {@code http://schema.org/educationalUse}.
	 * <p>
	 * The purpose of a work in the context of education; for example,
	 * 'assignment', 'group work'.
	 *
	 * @see <a href="http://schema.org/educationalUse">educationalUse</a>
	 */
	public static final URI educationalUse;

	/**
	 * Education Event
	 * <p>
	 * {@code http://schema.org/EducationEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/EducationEvent">EducationEvent</a>
	 */
	public static final URI EducationEvent;

	/**
	 * Education Requirements
	 * <p>
	 * {@code http://schema.org/educationRequirements}.
	 * <p>
	 * Educational background needed for the position.
	 *
	 * @see <a href="http://schema.org/educationRequirements">educationRequirements</a>
	 */
	public static final URI educationRequirements;

	/**
	 * Electrician
	 * <p>
	 * {@code http://schema.org/Electrician}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Electrician">Electrician</a>
	 */
	public static final URI Electrician;

	/**
	 * Electronics Store
	 * <p>
	 * {@code http://schema.org/ElectronicsStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ElectronicsStore">ElectronicsStore</a>
	 */
	public static final URI ElectronicsStore;

	/**
	 * Elementary School
	 * <p>
	 * {@code http://schema.org/ElementarySchool}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ElementarySchool">ElementarySchool</a>
	 */
	public static final URI ElementarySchool;

	/**
	 * Elevation
	 * <p>
	 * {@code http://schema.org/elevation}.
	 * <p>
	 * The elevation of a location.
	 *
	 * @see <a href="http://schema.org/elevation">elevation</a>
	 */
	public static final URI elevation;

	/**
	 * Eligible Customer Type
	 * <p>
	 * {@code http://schema.org/eligibleCustomerType}.
	 * <p>
	 * The type(s) of customers for which the given offer is valid.
	 *
	 * @see <a href="http://schema.org/eligibleCustomerType">eligibleCustomerType</a>
	 */
	public static final URI eligibleCustomerType;

	/**
	 * Eligible Duration
	 * <p>
	 * {@code http://schema.org/eligibleDuration}.
	 * <p>
	 * The duration for which the given offer is valid.
	 *
	 * @see <a href="http://schema.org/eligibleDuration">eligibleDuration</a>
	 */
	public static final URI eligibleDuration;

	/**
	 * Eligible Quantity
	 * <p>
	 * {@code http://schema.org/eligibleQuantity}.
	 * <p>
	 * The interval and unit of measurement of ordering quantities for which
	 * the offer or price specification is valid. This allows e.g. specifying
	 * that a certain freight charge is valid only for a certain quantity.
	 *
	 * @see <a href="http://schema.org/eligibleQuantity">eligibleQuantity</a>
	 */
	public static final URI eligibleQuantity;

	/**
	 * Eligible Region
	 * <p>
	 * {@code http://schema.org/eligibleRegion}.
	 * <p>
	 * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, or the
	 * GeoShape for the geo-political region(s) for which the offer or
	 * delivery charge specification is valid.
	 *
	 * @see <a href="http://schema.org/eligibleRegion">eligibleRegion</a>
	 */
	public static final URI eligibleRegion;

	/**
	 * Eligible Transaction Volume
	 * <p>
	 * {@code http://schema.org/eligibleTransactionVolume}.
	 * <p>
	 * The transaction volume, in a monetary unit, for which the offer or
	 * price specification is valid, e.g. for indicating a minimal purchasing
	 * volume, to express free shipping above a certain order volume, or to
	 * limit the acceptance of credit cards to purchases to a certain minimal
	 * amount.
	 *
	 * @see <a href="http://schema.org/eligibleTransactionVolume">eligibleTransactionVolume</a>
	 */
	public static final URI eligibleTransactionVolume;

	/**
	 * Email
	 * <p>
	 * {@code http://schema.org/email}.
	 * <p>
	 * Email address.
	 *
	 * @see <a href="http://schema.org/email">email</a>
	 */
	public static final URI email;

	/**
	 * Embassy
	 * <p>
	 * {@code http://schema.org/Embassy}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Embassy">Embassy</a>
	 */
	public static final URI Embassy;

	/**
	 * Embed Url
	 * <p>
	 * {@code http://schema.org/embedUrl}.
	 * <p>
	 * A URL pointing to a player for a specific video. In general, this is
	 * the information in the src element of an embed tag and should not be
	 * the same as the content of the loc tag. (previous spelling: embedURL)
	 *
	 * @see <a href="http://schema.org/embedUrl">embedUrl</a>
	 */
	public static final URI embedUrl;

	/**
	 * Emergency Service
	 * <p>
	 * {@code http://schema.org/EmergencyService}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/EmergencyService">EmergencyService</a>
	 */
	public static final URI EmergencyService;

	/**
	 * Employee
	 * <p>
	 * {@code http://schema.org/employee}.
	 * <p>
	 * Someone working for this organization.
	 *
	 * @see <a href="http://schema.org/employee">employee</a>
	 */
	public static final URI employee;

	/**
	 * Employees
	 * <p>
	 * {@code http://schema.org/employees}.
	 * <p>
	 * People working for this organization. (legacy spelling; see singular
	 * form, employee)
	 *
	 * @see <a href="http://schema.org/employees">employees</a>
	 */
	public static final URI employees;

	/**
	 * Employment Agency
	 * <p>
	 * {@code http://schema.org/EmploymentAgency}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/EmploymentAgency">EmploymentAgency</a>
	 */
	public static final URI EmploymentAgency;

	/**
	 * Employment Type
	 * <p>
	 * {@code http://schema.org/employmentType}.
	 * <p>
	 * Type of employment (e.g. full-time, part-time, contract, temporary,
	 * seasonal, internship).
	 *
	 * @see <a href="http://schema.org/employmentType">employmentType</a>
	 */
	public static final URI employmentType;

	/**
	 * Encodes Creative Work
	 * <p>
	 * {@code http://schema.org/encodesCreativeWork}.
	 * <p>
	 * The creative work encoded by this media object
	 *
	 * @see <a href="http://schema.org/encodesCreativeWork">encodesCreativeWork</a>
	 */
	public static final URI encodesCreativeWork;

	/**
	 * Encoding
	 * <p>
	 * {@code http://schema.org/encoding}.
	 * <p>
	 * A media object that encode this CreativeWork.
	 *
	 * @see <a href="http://schema.org/encoding">encoding</a>
	 */
	public static final URI encoding;

	/**
	 * Encoding Format
	 * <p>
	 * {@code http://schema.org/encodingFormat}.
	 * <p>
	 * mp3, mpeg4, etc.
	 *
	 * @see <a href="http://schema.org/encodingFormat">encodingFormat</a>
	 */
	public static final URI encodingFormat;

	/**
	 * Encodings
	 * <p>
	 * {@code http://schema.org/encodings}.
	 * <p>
	 * The media objects that encode this creative work (legacy spelling; see
	 * singular form, encoding).
	 *
	 * @see <a href="http://schema.org/encodings">encodings</a>
	 */
	public static final URI encodings;

	/**
	 * End Date
	 * <p>
	 * {@code http://schema.org/endDate}.
	 * <p>
	 * The end date and time of the event or item (in ISO 8601 date format).
	 *
	 * @see <a href="http://schema.org/endDate">endDate</a>
	 */
	public static final URI endDate;

	/**
	 * Endorse Action
	 * <p>
	 * {@code http://schema.org/EndorseAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/EndorseAction">EndorseAction</a>
	 */
	public static final URI EndorseAction;

	/**
	 * Endorsee
	 * <p>
	 * {@code http://schema.org/endorsee}.
	 * <p>
	 * A sub property of participant. The person/organization being
	 * supported.
	 *
	 * @see <a href="http://schema.org/endorsee">endorsee</a>
	 */
	public static final URI endorsee;

	/**
	 * Endorsers
	 * <p>
	 * {@code http://schema.org/endorsers}.
	 * <p>
	 * People or organizations that endorse the plan.
	 *
	 * @see <a href="http://schema.org/endorsers">endorsers</a>
	 */
	public static final URI endorsers;

	/**
	 * End Time
	 * <p>
	 * {@code http://schema.org/endTime}.
	 * <p>
	 * When the Action was performed: end time. This is for actions that span
	 * a period of time. e.g. John wrote a book from January to *December*.
	 *
	 * @see <a href="http://schema.org/endTime">endTime</a>
	 */
	public static final URI endTime;

	/**
	 * Energy
	 * <p>
	 * {@code http://schema.org/Energy}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Energy">Energy</a>
	 */
	public static final URI Energy;

	/**
	 * Entertainment Business
	 * <p>
	 * {@code http://schema.org/entertainmentBusiness}.
	 * <p>
	 * A sub property of location. The entertainment business where the
	 * action occurred.
	 *
	 * @see <a href="http://schema.org/entertainmentBusiness">entertainmentBusiness</a>
	 */
	public static final URI entertainmentBusiness;

	/**
	 * Entertainment Business
	 * <p>
	 * {@code http://schema.org/EntertainmentBusiness}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/EntertainmentBusiness">EntertainmentBusiness</a>
	 */
	public static final URI EntertainmentBusiness;

	/**
	 * Enumeration
	 * <p>
	 * {@code http://schema.org/Enumeration}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Enumeration">Enumeration</a>
	 */
	public static final URI Enumeration;

	/**
	 * Epidemiology
	 * <p>
	 * {@code http://schema.org/epidemiology}.
	 * <p>
	 * The characteristics of associated patients, such as age, gender, race
	 * etc.
	 *
	 * @see <a href="http://schema.org/epidemiology">epidemiology</a>
	 */
	public static final URI epidemiology;

	/**
	 * Episode
	 * <p>
	 * {@code http://schema.org/Episode}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Episode">Episode</a>
	 */
	public static final URI Episode;

	/**
	 * Episode
	 * <p>
	 * {@code http://schema.org/episode}.
	 * <p>
	 * An episode of a TV/radio series or season
	 *
	 * @see <a href="http://schema.org/episode">episode</a>
	 */
	public static final URI episode;

	/**
	 * Episode Number
	 * <p>
	 * {@code http://schema.org/episodeNumber}.
	 * <p>
	 * Position of the episode within an ordered group of episodes.
	 *
	 * @see <a href="http://schema.org/episodeNumber">episodeNumber</a>
	 */
	public static final URI episodeNumber;

	/**
	 * Episodes
	 * <p>
	 * {@code http://schema.org/episodes}.
	 * <p>
	 * An episode of a TV/radio series or season (legacy spelling; see
	 * singular form, episode)
	 *
	 * @see <a href="http://schema.org/episodes">episodes</a>
	 */
	public static final URI episodes;

	/**
	 * Equal
	 * <p>
	 * {@code http://schema.org/equal}.
	 * <p>
	 * This ordering relation for qualitative values indicates that the
	 * subject is equal to the object.
	 *
	 * @see <a href="http://schema.org/equal">equal</a>
	 */
	public static final URI equal;

	/**
	 * Estimates Risk of
	 * <p>
	 * {@code http://schema.org/estimatesRiskOf}.
	 * <p>
	 * The condition, complication, or symptom whose risk is being estimated.
	 *
	 * @see <a href="http://schema.org/estimatesRiskOf">estimatesRiskOf</a>
	 */
	public static final URI estimatesRiskOf;

	/**
	 * Event
	 * <p>
	 * {@code http://schema.org/Event}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Event">Event</a>
	 */
	public static final URI Event;

	/**
	 * Event
	 * <p>
	 * {@code http://schema.org/event}.
	 * <p>
	 * Upcoming or past event associated with this place or organization.
	 *
	 * @see <a href="http://schema.org/event">event</a>
	 */
	public static final URI event;

	/**
	 * Events
	 * <p>
	 * {@code http://schema.org/events}.
	 * <p>
	 * Upcoming or past events associated with this place or organization
	 * (legacy spelling; see singular form, event).
	 *
	 * @see <a href="http://schema.org/events">events</a>
	 */
	public static final URI events;

	/**
	 * Event Status
	 * <p>
	 * {@code http://schema.org/eventStatus}.
	 * <p>
	 * An eventStatus of an event represents its status; particularly useful
	 * when an event is cancelled or rescheduled.
	 *
	 * @see <a href="http://schema.org/eventStatus">eventStatus</a>
	 */
	public static final URI eventStatus;

	/**
	 * Event Status Type
	 * <p>
	 * {@code http://schema.org/EventStatusType}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/EventStatusType">EventStatusType</a>
	 */
	public static final URI EventStatusType;

	/**
	 * Event Venue
	 * <p>
	 * {@code http://schema.org/EventVenue}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/EventVenue">EventVenue</a>
	 */
	public static final URI EventVenue;

	/**
	 * Evidence Level
	 * <p>
	 * {@code http://schema.org/evidenceLevel}.
	 * <p>
	 * Strength of evidence of the data used to formulate the guideline
	 * (enumerated).
	 *
	 * @see <a href="http://schema.org/evidenceLevel">evidenceLevel</a>
	 */
	public static final URI evidenceLevel;

	/**
	 * Evidence Origin
	 * <p>
	 * {@code http://schema.org/evidenceOrigin}.
	 * <p>
	 * Source of the data used to formulate the guidance, e.g. RCT, consensus
	 * opinion, etc.
	 *
	 * @see <a href="http://schema.org/evidenceOrigin">evidenceOrigin</a>
	 */
	public static final URI evidenceOrigin;

	/**
	 * Exercise Action
	 * <p>
	 * {@code http://schema.org/ExerciseAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ExerciseAction">ExerciseAction</a>
	 */
	public static final URI ExerciseAction;

	/**
	 * Exercise Gym
	 * <p>
	 * {@code http://schema.org/ExerciseGym}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ExerciseGym">ExerciseGym</a>
	 */
	public static final URI ExerciseGym;

	/**
	 * Exercise Plan
	 * <p>
	 * {@code http://schema.org/exercisePlan}.
	 * <p>
	 * A sub property of instrument. The exercise plan used on this action.
	 *
	 * @see <a href="http://schema.org/exercisePlan">exercisePlan</a>
	 */
	public static final URI exercisePlan;

	/**
	 * Exercise Plan
	 * <p>
	 * {@code http://schema.org/ExercisePlan}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ExercisePlan">ExercisePlan</a>
	 */
	public static final URI ExercisePlan;

	/**
	 * Exercise Type
	 * <p>
	 * {@code http://schema.org/exerciseType}.
	 * <p>
	 * Type(s) of exercise or activity, such as strength training,
	 * flexibility training, aerobics, cardiac rehabilitation, etc.
	 *
	 * @see <a href="http://schema.org/exerciseType">exerciseType</a>
	 */
	public static final URI exerciseType;

	/**
	 * Exif Data
	 * <p>
	 * {@code http://schema.org/exifData}.
	 * <p>
	 * exif data for this object.
	 *
	 * @see <a href="http://schema.org/exifData">exifData</a>
	 */
	public static final URI exifData;

	/**
	 * Expected Arrival From
	 * <p>
	 * {@code http://schema.org/expectedArrivalFrom}.
	 * <p>
	 * The earliest date the package may arrive.
	 *
	 * @see <a href="http://schema.org/expectedArrivalFrom">expectedArrivalFrom</a>
	 */
	public static final URI expectedArrivalFrom;

	/**
	 * Expected Arrival Until
	 * <p>
	 * {@code http://schema.org/expectedArrivalUntil}.
	 * <p>
	 * The latest date the package may arrive.
	 *
	 * @see <a href="http://schema.org/expectedArrivalUntil">expectedArrivalUntil</a>
	 */
	public static final URI expectedArrivalUntil;

	/**
	 * Expected Prognosis
	 * <p>
	 * {@code http://schema.org/expectedPrognosis}.
	 * <p>
	 * The likely outcome in either the short term or long term of the
	 * medical condition.
	 *
	 * @see <a href="http://schema.org/expectedPrognosis">expectedPrognosis</a>
	 */
	public static final URI expectedPrognosis;

	/**
	 * Experience Requirements
	 * <p>
	 * {@code http://schema.org/experienceRequirements}.
	 * <p>
	 * Description of skills and experience needed for the position.
	 *
	 * @see <a href="http://schema.org/experienceRequirements">experienceRequirements</a>
	 */
	public static final URI experienceRequirements;

	/**
	 * Expert Considerations
	 * <p>
	 * {@code http://schema.org/expertConsiderations}.
	 * <p>
	 * Medical expert advice related to the plan.
	 *
	 * @see <a href="http://schema.org/expertConsiderations">expertConsiderations</a>
	 */
	public static final URI expertConsiderations;

	/**
	 * Expires
	 * <p>
	 * {@code http://schema.org/expires}.
	 * <p>
	 * Date the content expires and is no longer useful or available. Useful
	 * for videos.
	 *
	 * @see <a href="http://schema.org/expires">expires</a>
	 */
	public static final URI expires;

	/**
	 * Family Name
	 * <p>
	 * {@code http://schema.org/familyName}.
	 * <p>
	 * Family name. In the U.S., the last name of an Person. This can be used
	 * along with givenName instead of the Name property.
	 *
	 * @see <a href="http://schema.org/familyName">familyName</a>
	 */
	public static final URI familyName;

	/**
	 * Fast Food Restaurant
	 * <p>
	 * {@code http://schema.org/FastFoodRestaurant}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/FastFoodRestaurant">FastFoodRestaurant</a>
	 */
	public static final URI FastFoodRestaurant;

	/**
	 * Fat Content
	 * <p>
	 * {@code http://schema.org/fatContent}.
	 * <p>
	 * The number of grams of fat.
	 *
	 * @see <a href="http://schema.org/fatContent">fatContent</a>
	 */
	public static final URI fatContent;

	/**
	 * Fax Number
	 * <p>
	 * {@code http://schema.org/faxNumber}.
	 * <p>
	 * The fax number.
	 *
	 * @see <a href="http://schema.org/faxNumber">faxNumber</a>
	 */
	public static final URI faxNumber;

	/**
	 * Feature List
	 * <p>
	 * {@code http://schema.org/featureList}.
	 * <p>
	 * Features or modules provided by this application (and possibly
	 * required by other applications).
	 *
	 * @see <a href="http://schema.org/featureList">featureList</a>
	 */
	public static final URI featureList;

	/**
	 * Festival
	 * <p>
	 * {@code http://schema.org/Festival}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Festival">Festival</a>
	 */
	public static final URI Festival;

	/**
	 * Fiber Content
	 * <p>
	 * {@code http://schema.org/fiberContent}.
	 * <p>
	 * The number of grams of fiber.
	 *
	 * @see <a href="http://schema.org/fiberContent">fiberContent</a>
	 */
	public static final URI fiberContent;

	/**
	 * File Format
	 * <p>
	 * {@code http://schema.org/fileFormat}.
	 * <p>
	 * MIME format of the binary (e.g. application/zip).
	 *
	 * @see <a href="http://schema.org/fileFormat">fileFormat</a>
	 */
	public static final URI fileFormat;

	/**
	 * File Size
	 * <p>
	 * {@code http://schema.org/fileSize}.
	 * <p>
	 * Size of the application / package (e.g. 18MB). In the absence of a
	 * unit (MB, KB etc.), KB will be assumed.
	 *
	 * @see <a href="http://schema.org/fileSize">fileSize</a>
	 */
	public static final URI fileSize;

	/**
	 * Film Action
	 * <p>
	 * {@code http://schema.org/FilmAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/FilmAction">FilmAction</a>
	 */
	public static final URI FilmAction;

	/**
	 * Financial Service
	 * <p>
	 * {@code http://schema.org/FinancialService}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/FinancialService">FinancialService</a>
	 */
	public static final URI FinancialService;

	/**
	 * Find Action
	 * <p>
	 * {@code http://schema.org/FindAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/FindAction">FindAction</a>
	 */
	public static final URI FindAction;

	/**
	 * Fire Station
	 * <p>
	 * {@code http://schema.org/FireStation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/FireStation">FireStation</a>
	 */
	public static final URI FireStation;

	/**
	 * Florist
	 * <p>
	 * {@code http://schema.org/Florist}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Florist">Florist</a>
	 */
	public static final URI Florist;

	/**
	 * Follow Action
	 * <p>
	 * {@code http://schema.org/FollowAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/FollowAction">FollowAction</a>
	 */
	public static final URI FollowAction;

	/**
	 * Followee
	 * <p>
	 * {@code http://schema.org/followee}.
	 * <p>
	 * A sub property of object. The person or organization being followed.
	 *
	 * @see <a href="http://schema.org/followee">followee</a>
	 */
	public static final URI followee;

	/**
	 * Follows
	 * <p>
	 * {@code http://schema.org/follows}.
	 * <p>
	 * The most generic uni-directional social relation.
	 *
	 * @see <a href="http://schema.org/follows">follows</a>
	 */
	public static final URI follows;

	/**
	 * Followup
	 * <p>
	 * {@code http://schema.org/followup}.
	 * <p>
	 * Typical or recommended followup care after the procedure is performed.
	 *
	 * @see <a href="http://schema.org/followup">followup</a>
	 */
	public static final URI followup;

	/**
	 * Food Establishment
	 * <p>
	 * {@code http://schema.org/FoodEstablishment}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/FoodEstablishment">FoodEstablishment</a>
	 */
	public static final URI FoodEstablishment;

	/**
	 * Food Establishment
	 * <p>
	 * {@code http://schema.org/foodEstablishment}.
	 * <p>
	 * A sub property of location. The specific food establishment where the
	 * action occurreed.
	 *
	 * @see <a href="http://schema.org/foodEstablishment">foodEstablishment</a>
	 */
	public static final URI foodEstablishment;

	/**
	 * Food Event
	 * <p>
	 * {@code http://schema.org/FoodEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/FoodEvent">FoodEvent</a>
	 */
	public static final URI FoodEvent;

	/**
	 * Food Event
	 * <p>
	 * {@code http://schema.org/foodEvent}.
	 * <p>
	 * A sub property of location. The specific food event where the action
	 * occurred.
	 *
	 * @see <a href="http://schema.org/foodEvent">foodEvent</a>
	 */
	public static final URI foodEvent;

	/**
	 * Food Warning
	 * <p>
	 * {@code http://schema.org/foodWarning}.
	 * <p>
	 * Any precaution, guidance, contraindication, etc. related to
	 * consumption of specific foods while taking this drug.
	 *
	 * @see <a href="http://schema.org/foodWarning">foodWarning</a>
	 */
	public static final URI foodWarning;

	/**
	 * Founder
	 * <p>
	 * {@code http://schema.org/founder}.
	 * <p>
	 * A person who founded this organization.
	 *
	 * @see <a href="http://schema.org/founder">founder</a>
	 */
	public static final URI founder;

	/**
	 * Founders
	 * <p>
	 * {@code http://schema.org/founders}.
	 * <p>
	 * A person who founded this organization (legacy spelling; see singular
	 * form, founder).
	 *
	 * @see <a href="http://schema.org/founders">founders</a>
	 */
	public static final URI founders;

	/**
	 * Founding Date
	 * <p>
	 * {@code http://schema.org/foundingDate}.
	 * <p>
	 * The date that this organization was founded.
	 *
	 * @see <a href="http://schema.org/foundingDate">foundingDate</a>
	 */
	public static final URI foundingDate;

	/**
	 * Free
	 * <p>
	 * {@code http://schema.org/free}.
	 * <p>
	 * A flag to signal that the publication is accessible for free.
	 *
	 * @see <a href="http://schema.org/free">free</a>
	 */
	public static final URI free;

	/**
	 * Frequency
	 * <p>
	 * {@code http://schema.org/frequency}.
	 * <p>
	 * How often the dose is taken, e.g. 'daily'.
	 *
	 * @see <a href="http://schema.org/frequency">frequency</a>
	 */
	public static final URI frequency;

	/**
	 * From Location
	 * <p>
	 * {@code http://schema.org/fromLocation}.
	 * <p>
	 * A sub property of location. The original location of the object or the
	 * agent before the action.
	 *
	 * @see <a href="http://schema.org/fromLocation">fromLocation</a>
	 */
	public static final URI fromLocation;

	/**
	 * Function
	 * <p>
	 * {@code http://schema.org/function}.
	 * <p>
	 * Function of the anatomical structure.
	 *
	 * @see <a href="http://schema.org/function">function</a>
	 */
	public static final URI function;

	/**
	 * Functional Class
	 * <p>
	 * {@code http://schema.org/functionalClass}.
	 * <p>
	 * The degree of mobility the joint allows.
	 *
	 * @see <a href="http://schema.org/functionalClass">functionalClass</a>
	 */
	public static final URI functionalClass;

	/**
	 * Furniture Store
	 * <p>
	 * {@code http://schema.org/FurnitureStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/FurnitureStore">FurnitureStore</a>
	 */
	public static final URI FurnitureStore;

	/**
	 * Garden Store
	 * <p>
	 * {@code http://schema.org/GardenStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GardenStore">GardenStore</a>
	 */
	public static final URI GardenStore;

	/**
	 * Gas Station
	 * <p>
	 * {@code http://schema.org/GasStation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GasStation">GasStation</a>
	 */
	public static final URI GasStation;

	/**
	 * Gated Residence Community
	 * <p>
	 * {@code http://schema.org/GatedResidenceCommunity}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GatedResidenceCommunity">GatedResidenceCommunity</a>
	 */
	public static final URI GatedResidenceCommunity;

	/**
	 * Gender
	 * <p>
	 * {@code http://schema.org/gender}.
	 * <p>
	 * Gender of the person.
	 *
	 * @see <a href="http://schema.org/gender">gender</a>
	 */
	public static final URI gender;

	/**
	 * General Contractor
	 * <p>
	 * {@code http://schema.org/GeneralContractor}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GeneralContractor">GeneralContractor</a>
	 */
	public static final URI GeneralContractor;

	/**
	 * Genre
	 * <p>
	 * {@code http://schema.org/genre}.
	 * <p>
	 * Genre of the creative work
	 *
	 * @see <a href="http://schema.org/genre">genre</a>
	 */
	public static final URI genre;

	/**
	 * Geo
	 * <p>
	 * {@code http://schema.org/geo}.
	 * <p>
	 * The geo coordinates of the place.
	 *
	 * @see <a href="http://schema.org/geo">geo</a>
	 */
	public static final URI geo;

	/**
	 * Geo Coordinates
	 * <p>
	 * {@code http://schema.org/GeoCoordinates}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GeoCoordinates">GeoCoordinates</a>
	 */
	public static final URI GeoCoordinates;

	/**
	 * Geographic Area
	 * <p>
	 * {@code http://schema.org/geographicArea}.
	 * <p>
	 * The geographic area associated with the audience.
	 *
	 * @see <a href="http://schema.org/geographicArea">geographicArea</a>
	 */
	public static final URI geographicArea;

	/**
	 * Geo Shape
	 * <p>
	 * {@code http://schema.org/GeoShape}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GeoShape">GeoShape</a>
	 */
	public static final URI GeoShape;

	/**
	 * Give Action
	 * <p>
	 * {@code http://schema.org/GiveAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GiveAction">GiveAction</a>
	 */
	public static final URI GiveAction;

	/**
	 * Given Name
	 * <p>
	 * {@code http://schema.org/givenName}.
	 * <p>
	 * Given name. In the U.S., the first name of a Person. This can be used
	 * along with familyName instead of the Name property.
	 *
	 * @see <a href="http://schema.org/givenName">givenName</a>
	 */
	public static final URI givenName;

	/**
	 * Global Location Number
	 * <p>
	 * {@code http://schema.org/globalLocationNumber}.
	 * <p>
	 * The Global Location Number (GLN, sometimes also referred to as
	 * International Location Number or ILN) of the respective organization,
	 * person, or place. The GLN is a 13-digit number used to identify
	 * parties and physical locations.
	 *
	 * @see <a href="http://schema.org/globalLocationNumber">globalLocationNumber</a>
	 */
	public static final URI globalLocationNumber;

	/**
	 * Golf Course
	 * <p>
	 * {@code http://schema.org/GolfCourse}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GolfCourse">GolfCourse</a>
	 */
	public static final URI GolfCourse;

	/**
	 * Government Building
	 * <p>
	 * {@code http://schema.org/GovernmentBuilding}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GovernmentBuilding">GovernmentBuilding</a>
	 */
	public static final URI GovernmentBuilding;

	/**
	 * Government Office
	 * <p>
	 * {@code http://schema.org/GovernmentOffice}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GovernmentOffice">GovernmentOffice</a>
	 */
	public static final URI GovernmentOffice;

	/**
	 * Government Organization
	 * <p>
	 * {@code http://schema.org/GovernmentOrganization}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GovernmentOrganization">GovernmentOrganization</a>
	 */
	public static final URI GovernmentOrganization;

	/**
	 * Government Permit
	 * <p>
	 * {@code http://schema.org/GovernmentPermit}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GovernmentPermit">GovernmentPermit</a>
	 */
	public static final URI GovernmentPermit;

	/**
	 * Government Service
	 * <p>
	 * {@code http://schema.org/GovernmentService}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GovernmentService">GovernmentService</a>
	 */
	public static final URI GovernmentService;

	/**
	 * Greater
	 * <p>
	 * {@code http://schema.org/greater}.
	 * <p>
	 * This ordering relation for qualitative values indicates that the
	 * subject is greater than the object.
	 *
	 * @see <a href="http://schema.org/greater">greater</a>
	 */
	public static final URI greater;

	/**
	 * Greater or Equal
	 * <p>
	 * {@code http://schema.org/greaterOrEqual}.
	 * <p>
	 * This ordering relation for qualitative values indicates that the
	 * subject is greater than or equal to the object.
	 *
	 * @see <a href="http://schema.org/greaterOrEqual">greaterOrEqual</a>
	 */
	public static final URI greaterOrEqual;

	/**
	 * Grocery Store
	 * <p>
	 * {@code http://schema.org/GroceryStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/GroceryStore">GroceryStore</a>
	 */
	public static final URI GroceryStore;

	/**
	 * Gtin13
	 * <p>
	 * {@code http://schema.org/gtin13}.
	 * <p>
	 * The GTIN-13 code of the product, or the product to which the offer
	 * refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13.
	 * Former 12-digit UPC codes can be converted into a GTIN-13 code by
	 * simply adding a preceeding zero.
	 *
	 * @see <a href="http://schema.org/gtin13">gtin13</a>
	 */
	public static final URI gtin13;

	/**
	 * Gtin14
	 * <p>
	 * {@code http://schema.org/gtin14}.
	 * <p>
	 * The GTIN-14 code of the product, or the product to which the offer
	 * refers.
	 *
	 * @see <a href="http://schema.org/gtin14">gtin14</a>
	 */
	public static final URI gtin14;

	/**
	 * Gtin8
	 * <p>
	 * {@code http://schema.org/gtin8}.
	 * <p>
	 * The GTIN-8 code of the product, or the product to which the offer
	 * refers. This code is also known as EAN/UCC-8 or 8-digit EAN.
	 *
	 * @see <a href="http://schema.org/gtin8">gtin8</a>
	 */
	public static final URI gtin8;

	/**
	 * Guideline
	 * <p>
	 * {@code http://schema.org/guideline}.
	 * <p>
	 * A medical guideline related to this entity.
	 *
	 * @see <a href="http://schema.org/guideline">guideline</a>
	 */
	public static final URI guideline;

	/**
	 * Guideline Date
	 * <p>
	 * {@code http://schema.org/guidelineDate}.
	 * <p>
	 * Date on which this guideline's recommendation was made.
	 *
	 * @see <a href="http://schema.org/guidelineDate">guidelineDate</a>
	 */
	public static final URI guidelineDate;

	/**
	 * Guideline Subject
	 * <p>
	 * {@code http://schema.org/guidelineSubject}.
	 * <p>
	 * The medical conditions, treatments, etc. that are the subject of the
	 * guideline.
	 *
	 * @see <a href="http://schema.org/guidelineSubject">guidelineSubject</a>
	 */
	public static final URI guidelineSubject;

	/**
	 * Hair Salon
	 * <p>
	 * {@code http://schema.org/HairSalon}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/HairSalon">HairSalon</a>
	 */
	public static final URI HairSalon;

	/**
	 * Hardware Store
	 * <p>
	 * {@code http://schema.org/HardwareStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/HardwareStore">HardwareStore</a>
	 */
	public static final URI HardwareStore;

	/**
	 * Has Delivery Method
	 * <p>
	 * {@code http://schema.org/hasDeliveryMethod}.
	 * <p>
	 * Method used for delivery or shipping.
	 *
	 * @see <a href="http://schema.org/hasDeliveryMethod">hasDeliveryMethod</a>
	 */
	public static final URI hasDeliveryMethod;

	/**
	 * Has POS
	 * <p>
	 * {@code http://schema.org/hasPOS}.
	 * <p>
	 * Points-of-Sales operated by the organization or person.
	 *
	 * @see <a href="http://schema.org/hasPOS">hasPOS</a>
	 */
	public static final URI hasPOS;

	/**
	 * Headline
	 * <p>
	 * {@code http://schema.org/headline}.
	 * <p>
	 * Headline of the article
	 *
	 * @see <a href="http://schema.org/headline">headline</a>
	 */
	public static final URI headline;

	/**
	 * Health And Beauty Business
	 * <p>
	 * {@code http://schema.org/HealthAndBeautyBusiness}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/HealthAndBeautyBusiness">HealthAndBeautyBusiness</a>
	 */
	public static final URI HealthAndBeautyBusiness;

	/**
	 * Health Club
	 * <p>
	 * {@code http://schema.org/HealthClub}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/HealthClub">HealthClub</a>
	 */
	public static final URI HealthClub;

	/**
	 * Health Condition
	 * <p>
	 * {@code http://schema.org/healthCondition}.
	 * <p>
	 * Expectations for health conditions of target audience
	 *
	 * @see <a href="http://schema.org/healthCondition">healthCondition</a>
	 */
	public static final URI healthCondition;

	/**
	 * Height
	 * <p>
	 * {@code http://schema.org/height}.
	 * <p>
	 * The height of the item.
	 *
	 * @see <a href="http://schema.org/height">height</a>
	 */
	public static final URI height;

	/**
	 * High Price
	 * <p>
	 * {@code http://schema.org/highPrice}.
	 * <p>
	 * The highest price of all offers available.
	 *
	 * @see <a href="http://schema.org/highPrice">highPrice</a>
	 */
	public static final URI highPrice;

	/**
	 * High School
	 * <p>
	 * {@code http://schema.org/HighSchool}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/HighSchool">HighSchool</a>
	 */
	public static final URI HighSchool;

	/**
	 * Hindu Temple
	 * <p>
	 * {@code http://schema.org/HinduTemple}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/HinduTemple">HinduTemple</a>
	 */
	public static final URI HinduTemple;

	/**
	 * Hiring Organization
	 * <p>
	 * {@code http://schema.org/hiringOrganization}.
	 * <p>
	 * Organization offering the job position.
	 *
	 * @see <a href="http://schema.org/hiringOrganization">hiringOrganization</a>
	 */
	public static final URI hiringOrganization;

	/**
	 * Hobby Shop
	 * <p>
	 * {@code http://schema.org/HobbyShop}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/HobbyShop">HobbyShop</a>
	 */
	public static final URI HobbyShop;

	/**
	 * Home And Construction Business
	 * <p>
	 * {@code http://schema.org/HomeAndConstructionBusiness}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/HomeAndConstructionBusiness">HomeAndConstructionBusiness</a>
	 */
	public static final URI HomeAndConstructionBusiness;

	/**
	 * Home Goods Store
	 * <p>
	 * {@code http://schema.org/HomeGoodsStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/HomeGoodsStore">HomeGoodsStore</a>
	 */
	public static final URI HomeGoodsStore;

	/**
	 * Home Location
	 * <p>
	 * {@code http://schema.org/homeLocation}.
	 * <p>
	 * A contact location for a person's residence.
	 *
	 * @see <a href="http://schema.org/homeLocation">homeLocation</a>
	 */
	public static final URI homeLocation;

	/**
	 * Honorific Prefix
	 * <p>
	 * {@code http://schema.org/honorificPrefix}.
	 * <p>
	 * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
	 *
	 * @see <a href="http://schema.org/honorificPrefix">honorificPrefix</a>
	 */
	public static final URI honorificPrefix;

	/**
	 * Honorific Suffix
	 * <p>
	 * {@code http://schema.org/honorificSuffix}.
	 * <p>
	 * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
	 *
	 * @see <a href="http://schema.org/honorificSuffix">honorificSuffix</a>
	 */
	public static final URI honorificSuffix;

	/**
	 * Hospital
	 * <p>
	 * {@code http://schema.org/Hospital}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Hospital">Hospital</a>
	 */
	public static final URI Hospital;

	/**
	 * Hospital Affiliation
	 * <p>
	 * {@code http://schema.org/hospitalAffiliation}.
	 * <p>
	 * A hospital with which the physician or office is affiliated.
	 *
	 * @see <a href="http://schema.org/hospitalAffiliation">hospitalAffiliation</a>
	 */
	public static final URI hospitalAffiliation;

	/**
	 * Hostel
	 * <p>
	 * {@code http://schema.org/Hostel}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Hostel">Hostel</a>
	 */
	public static final URI Hostel;

	/**
	 * Hotel
	 * <p>
	 * {@code http://schema.org/Hotel}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Hotel">Hotel</a>
	 */
	public static final URI Hotel;

	/**
	 * Hours Available
	 * <p>
	 * {@code http://schema.org/hoursAvailable}.
	 * <p>
	 * The hours during which this contact point is available.
	 *
	 * @see <a href="http://schema.org/hoursAvailable">hoursAvailable</a>
	 */
	public static final URI hoursAvailable;

	/**
	 * House Painter
	 * <p>
	 * {@code http://schema.org/HousePainter}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/HousePainter">HousePainter</a>
	 */
	public static final URI HousePainter;

	/**
	 * How Performed
	 * <p>
	 * {@code http://schema.org/howPerformed}.
	 * <p>
	 * How the procedure is performed.
	 *
	 * @see <a href="http://schema.org/howPerformed">howPerformed</a>
	 */
	public static final URI howPerformed;

	/**
	 * HVAC Business
	 * <p>
	 * {@code http://schema.org/HVACBusiness}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/HVACBusiness">HVACBusiness</a>
	 */
	public static final URI HVACBusiness;

	/**
	 * Ice Cream Shop
	 * <p>
	 * {@code http://schema.org/IceCreamShop}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/IceCreamShop">IceCreamShop</a>
	 */
	public static final URI IceCreamShop;

	/**
	 * Identifying Exam
	 * <p>
	 * {@code http://schema.org/identifyingExam}.
	 * <p>
	 * A physical examination that can identify this sign.
	 *
	 * @see <a href="http://schema.org/identifyingExam">identifyingExam</a>
	 */
	public static final URI identifyingExam;

	/**
	 * Identifying Test
	 * <p>
	 * {@code http://schema.org/identifyingTest}.
	 * <p>
	 * A diagnostic test that can identify this sign.
	 *
	 * @see <a href="http://schema.org/identifyingTest">identifyingTest</a>
	 */
	public static final URI identifyingTest;

	/**
	 * Ignore Action
	 * <p>
	 * {@code http://schema.org/IgnoreAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/IgnoreAction">IgnoreAction</a>
	 */
	public static final URI IgnoreAction;

	/**
	 * Illustrator
	 * <p>
	 * {@code http://schema.org/illustrator}.
	 * <p>
	 * The illustrator of the book.
	 *
	 * @see <a href="http://schema.org/illustrator">illustrator</a>
	 */
	public static final URI illustrator;

	/**
	 * Image
	 * <p>
	 * {@code http://schema.org/image}.
	 * <p>
	 * URL of an image of the item.
	 *
	 * @see <a href="http://schema.org/image">image</a>
	 */
	public static final URI image;

	/**
	 * Image Gallery
	 * <p>
	 * {@code http://schema.org/ImageGallery}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ImageGallery">ImageGallery</a>
	 */
	public static final URI ImageGallery;

	/**
	 * Image Object
	 * <p>
	 * {@code http://schema.org/ImageObject}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ImageObject">ImageObject</a>
	 */
	public static final URI ImageObject;

	/**
	 * Imaging Technique
	 * <p>
	 * {@code http://schema.org/imagingTechnique}.
	 * <p>
	 * Imaging technique used.
	 *
	 * @see <a href="http://schema.org/imagingTechnique">imagingTechnique</a>
	 */
	public static final URI imagingTechnique;

	/**
	 * Imaging Test
	 * <p>
	 * {@code http://schema.org/ImagingTest}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ImagingTest">ImagingTest</a>
	 */
	public static final URI ImagingTest;

	/**
	 * In Album
	 * <p>
	 * {@code http://schema.org/inAlbum}.
	 * <p>
	 * The album to which this recording belongs.
	 *
	 * @see <a href="http://schema.org/inAlbum">inAlbum</a>
	 */
	public static final URI inAlbum;

	/**
	 * Incentives
	 * <p>
	 * {@code http://schema.org/incentives}.
	 * <p>
	 * Description of bonus and commission compensation aspects of the job.
	 *
	 * @see <a href="http://schema.org/incentives">incentives</a>
	 */
	public static final URI incentives;

	/**
	 * Included Risk Factor
	 * <p>
	 * {@code http://schema.org/includedRiskFactor}.
	 * <p>
	 * A modifiable or non-modifiable risk factor included in the
	 * calculation, e.g. age, coexisting condition.
	 *
	 * @see <a href="http://schema.org/includedRiskFactor">includedRiskFactor</a>
	 */
	public static final URI includedRiskFactor;

	/**
	 * Includes Object
	 * <p>
	 * {@code http://schema.org/includesObject}.
	 * <p>
	 * This links to a node or nodes indicating the exact quantity of the
	 * products included in the offer.
	 *
	 * @see <a href="http://schema.org/includesObject">includesObject</a>
	 */
	public static final URI includesObject;

	/**
	 * Increases Risk of
	 * <p>
	 * {@code http://schema.org/increasesRiskOf}.
	 * <p>
	 * The condition, complication, etc. influenced by this factor.
	 *
	 * @see <a href="http://schema.org/increasesRiskOf">increasesRiskOf</a>
	 */
	public static final URI increasesRiskOf;

	/**
	 * Indication
	 * <p>
	 * {@code http://schema.org/indication}.
	 * <p>
	 * A factor that indicates use of this therapy for treatment and/or
	 * prevention of a condition, symptom, etc. For therapies such as drugs,
	 * indications can include both officially-approved indications as well
	 * as off-label uses. These can be distinguished by using the
	 * ApprovedIndication subtype of MedicalIndication.
	 *
	 * @see <a href="http://schema.org/indication">indication</a>
	 */
	public static final URI indication;

	/**
	 * Individual Product
	 * <p>
	 * {@code http://schema.org/IndividualProduct}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/IndividualProduct">IndividualProduct</a>
	 */
	public static final URI IndividualProduct;

	/**
	 * Industry
	 * <p>
	 * {@code http://schema.org/industry}.
	 * <p>
	 * The industry associated with the job position.
	 *
	 * @see <a href="http://schema.org/industry">industry</a>
	 */
	public static final URI industry;

	/**
	 * Infectious Agent
	 * <p>
	 * {@code http://schema.org/infectiousAgent}.
	 * <p>
	 * The actual infectious agent, such as a specific bacterium.
	 *
	 * @see <a href="http://schema.org/infectiousAgent">infectiousAgent</a>
	 */
	public static final URI infectiousAgent;

	/**
	 * Infectious Agent Class
	 * <p>
	 * {@code http://schema.org/InfectiousAgentClass}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/InfectiousAgentClass">InfectiousAgentClass</a>
	 */
	public static final URI InfectiousAgentClass;

	/**
	 * Infectious Agent Class
	 * <p>
	 * {@code http://schema.org/infectiousAgentClass}.
	 * <p>
	 * The class of infectious agent (bacteria, prion, etc.) that causes the
	 * disease.
	 *
	 * @see <a href="http://schema.org/infectiousAgentClass">infectiousAgentClass</a>
	 */
	public static final URI infectiousAgentClass;

	/**
	 * Infectious Disease
	 * <p>
	 * {@code http://schema.org/InfectiousDisease}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/InfectiousDisease">InfectiousDisease</a>
	 */
	public static final URI InfectiousDisease;

	/**
	 * Inform Action
	 * <p>
	 * {@code http://schema.org/InformAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/InformAction">InformAction</a>
	 */
	public static final URI InformAction;

	/**
	 * Ingredients
	 * <p>
	 * {@code http://schema.org/ingredients}.
	 * <p>
	 * An ingredient used in the recipe.
	 *
	 * @see <a href="http://schema.org/ingredients">ingredients</a>
	 */
	public static final URI ingredients;

	/**
	 * In Language
	 * <p>
	 * {@code http://schema.org/inLanguage}.
	 * <p>
	 * The language of the content. please use one of the language codes from
	 * the IETF BCP 47 standard.
	 *
	 * @see <a href="http://schema.org/inLanguage">inLanguage</a>
	 */
	public static final URI inLanguage;

	/**
	 * In Playlist
	 * <p>
	 * {@code http://schema.org/inPlaylist}.
	 * <p>
	 * The playlist to which this recording belongs.
	 *
	 * @see <a href="http://schema.org/inPlaylist">inPlaylist</a>
	 */
	public static final URI inPlaylist;

	/**
	 * Insert Action
	 * <p>
	 * {@code http://schema.org/InsertAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/InsertAction">InsertAction</a>
	 */
	public static final URI InsertAction;

	/**
	 * Insertion
	 * <p>
	 * {@code http://schema.org/insertion}.
	 * <p>
	 * The place of attachment of a muscle, or what the muscle moves.
	 *
	 * @see <a href="http://schema.org/insertion">insertion</a>
	 */
	public static final URI insertion;

	/**
	 * Install Action
	 * <p>
	 * {@code http://schema.org/InstallAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/InstallAction">InstallAction</a>
	 */
	public static final URI InstallAction;

	/**
	 * Install Url
	 * <p>
	 * {@code http://schema.org/installUrl}.
	 * <p>
	 * URL at which the app may be installed, if different from the URL of
	 * the item.
	 *
	 * @see <a href="http://schema.org/installUrl">installUrl</a>
	 */
	public static final URI installUrl;

	/**
	 * Instrument
	 * <p>
	 * {@code http://schema.org/instrument}.
	 * <p>
	 * The object that helped the agent perform the action. e.g. John wrote a
	 * book with *a pen*.
	 *
	 * @see <a href="http://schema.org/instrument">instrument</a>
	 */
	public static final URI instrument;

	/**
	 * Insurance Agency
	 * <p>
	 * {@code http://schema.org/InsuranceAgency}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/InsuranceAgency">InsuranceAgency</a>
	 */
	public static final URI InsuranceAgency;

	/**
	 * Intangible
	 * <p>
	 * {@code http://schema.org/Intangible}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Intangible">Intangible</a>
	 */
	public static final URI Intangible;

	/**
	 * Intensity
	 * <p>
	 * {@code http://schema.org/intensity}.
	 * <p>
	 * Quantitative measure gauging the degree of force involved in the
	 * exercise, for example, heartbeats per minute. May include the velocity
	 * of the movement.
	 *
	 * @see <a href="http://schema.org/intensity">intensity</a>
	 */
	public static final URI intensity;

	/**
	 * Interact Action
	 * <p>
	 * {@code http://schema.org/InteractAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/InteractAction">InteractAction</a>
	 */
	public static final URI InteractAction;

	/**
	 * Interacting Drug
	 * <p>
	 * {@code http://schema.org/interactingDrug}.
	 * <p>
	 * Another drug that is known to interact with this drug in a way that
	 * impacts the effect of this drug or causes a risk to the patient. Note:
	 * disease interactions are typically captured as contraindications.
	 *
	 * @see <a href="http://schema.org/interactingDrug">interactingDrug</a>
	 */
	public static final URI interactingDrug;

	/**
	 * Interaction Count
	 * <p>
	 * {@code http://schema.org/interactionCount}.
	 * <p>
	 * A count of a specific user interactions with this item—for example, 20
	 * UserLikes, 5 UserComments, or 300 UserDownloads. The user interaction
	 * type should be one of the sub types of UserInteraction.
	 *
	 * @see <a href="http://schema.org/interactionCount">interactionCount</a>
	 */
	public static final URI interactionCount;

	/**
	 * Interactivity Type
	 * <p>
	 * {@code http://schema.org/interactivityType}.
	 * <p>
	 * The predominant mode of learning supported by the learning resource.
	 * Acceptable values are 'active', 'expositive', or 'mixed'.
	 *
	 * @see <a href="http://schema.org/interactivityType">interactivityType</a>
	 */
	public static final URI interactivityType;

	/**
	 * Internet Cafe
	 * <p>
	 * {@code http://schema.org/InternetCafe}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/InternetCafe">InternetCafe</a>
	 */
	public static final URI InternetCafe;

	/**
	 * Inventory Level
	 * <p>
	 * {@code http://schema.org/inventoryLevel}.
	 * <p>
	 * The current approximate inventory level for the item or items.
	 *
	 * @see <a href="http://schema.org/inventoryLevel">inventoryLevel</a>
	 */
	public static final URI inventoryLevel;

	/**
	 * Invite Action
	 * <p>
	 * {@code http://schema.org/InviteAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/InviteAction">InviteAction</a>
	 */
	public static final URI InviteAction;

	/**
	 * Is Accessory or Spare Part for
	 * <p>
	 * {@code http://schema.org/isAccessoryOrSparePartFor}.
	 * <p>
	 * A pointer to another product (or multiple products) for which this
	 * product is an accessory or spare part.
	 *
	 * @see <a href="http://schema.org/isAccessoryOrSparePartFor">isAccessoryOrSparePartFor</a>
	 */
	public static final URI isAccessoryOrSparePartFor;

	/**
	 * Is Available Generically
	 * <p>
	 * {@code http://schema.org/isAvailableGenerically}.
	 * <p>
	 * True if the drug is available in a generic form (regardless of name).
	 *
	 * @see <a href="http://schema.org/isAvailableGenerically">isAvailableGenerically</a>
	 */
	public static final URI isAvailableGenerically;

	/**
	 * Is Based On Url
	 * <p>
	 * {@code http://schema.org/isBasedOnUrl}.
	 * <p>
	 * A resource that was used in the creation of this resource. This term
	 * can be repeated for multiple sources. For example,
	 * http://example.com/great-multiplication-intro.html
	 *
	 * @see <a href="http://schema.org/isBasedOnUrl">isBasedOnUrl</a>
	 */
	public static final URI isBasedOnUrl;

	/**
	 * ISBN
	 * <p>
	 * {@code http://schema.org/isbn}.
	 * <p>
	 * The ISBN of the book.
	 *
	 * @see <a href="http://schema.org/isbn">isbn</a>
	 */
	public static final URI isbn;

	/**
	 * Is Consumable for
	 * <p>
	 * {@code http://schema.org/isConsumableFor}.
	 * <p>
	 * A pointer to another product (or multiple products) for which this
	 * product is a consumable.
	 *
	 * @see <a href="http://schema.org/isConsumableFor">isConsumableFor</a>
	 */
	public static final URI isConsumableFor;

	/**
	 * Is Family Friendly
	 * <p>
	 * {@code http://schema.org/isFamilyFriendly}.
	 * <p>
	 * Indicates whether this content is family friendly.
	 *
	 * @see <a href="http://schema.org/isFamilyFriendly">isFamilyFriendly</a>
	 */
	public static final URI isFamilyFriendly;

	/**
	 * Is Gift
	 * <p>
	 * {@code http://schema.org/isGift}.
	 * <p>
	 * Was the offer accepted as a gift for someone other than the buyer.
	 *
	 * @see <a href="http://schema.org/isGift">isGift</a>
	 */
	public static final URI isGift;

	/**
	 * Isic V4
	 * <p>
	 * {@code http://schema.org/isicV4}.
	 * <p>
	 * The International Standard of Industrial Classification of All
	 * Economic Activities (ISIC), Revision 4 code for a particular
	 * organization, business person, or place.
	 *
	 * @see <a href="http://schema.org/isicV4">isicV4</a>
	 */
	public static final URI isicV4;

	/**
	 * Is Part of
	 * <p>
	 * {@code http://schema.org/isPartOf}.
	 * <p>
	 * Indicates the collection or gallery to which the item belongs.
	 *
	 * @see <a href="http://schema.org/isPartOf">isPartOf</a>
	 */
	public static final URI isPartOf;

	/**
	 * Is Proprietary
	 * <p>
	 * {@code http://schema.org/isProprietary}.
	 * <p>
	 * True if this item's name is a proprietary/brand name (vs. generic
	 * name).
	 *
	 * @see <a href="http://schema.org/isProprietary">isProprietary</a>
	 */
	public static final URI isProprietary;

	/**
	 * Is Related to
	 * <p>
	 * {@code http://schema.org/isRelatedTo}.
	 * <p>
	 * A pointer to another, somehow related product (or multiple products).
	 *
	 * @see <a href="http://schema.org/isRelatedTo">isRelatedTo</a>
	 */
	public static final URI isRelatedTo;

	/**
	 * Is Similar to
	 * <p>
	 * {@code http://schema.org/isSimilarTo}.
	 * <p>
	 * A pointer to another, functionally similar product (or multiple
	 * products).
	 *
	 * @see <a href="http://schema.org/isSimilarTo">isSimilarTo</a>
	 */
	public static final URI isSimilarTo;

	/**
	 * Issued by
	 * <p>
	 * {@code http://schema.org/issuedBy}.
	 * <p>
	 * The organization issuing the permit.
	 *
	 * @see <a href="http://schema.org/issuedBy">issuedBy</a>
	 */
	public static final URI issuedBy;

	/**
	 * Issued Through
	 * <p>
	 * {@code http://schema.org/issuedThrough}.
	 * <p>
	 * The service through with the permit was granted.
	 *
	 * @see <a href="http://schema.org/issuedThrough">issuedThrough</a>
	 */
	public static final URI issuedThrough;

	/**
	 * Is Variant of
	 * <p>
	 * {@code http://schema.org/isVariantOf}.
	 * <p>
	 * A pointer to a base product from which this product is a variant. It
	 * is safe to infer that the variant inherits all product features from
	 * the base model, unless defined locally. This is not transitive.
	 *
	 * @see <a href="http://schema.org/isVariantOf">isVariantOf</a>
	 */
	public static final URI isVariantOf;

	/**
	 * Item Availability
	 * <p>
	 * {@code http://schema.org/ItemAvailability}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ItemAvailability">ItemAvailability</a>
	 */
	public static final URI ItemAvailability;

	/**
	 * Item Condition
	 * <p>
	 * {@code http://schema.org/itemCondition}.
	 * <p>
	 * A predefined value from OfferItemCondition or a textual description of
	 * the condition of the product or service, or the products or services
	 * included in the offer.
	 *
	 * @see <a href="http://schema.org/itemCondition">itemCondition</a>
	 */
	public static final URI itemCondition;

	/**
	 * Item List
	 * <p>
	 * {@code http://schema.org/ItemList}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ItemList">ItemList</a>
	 */
	public static final URI ItemList;

	/**
	 * Item List Element
	 * <p>
	 * {@code http://schema.org/itemListElement}.
	 * <p>
	 * A single list item.
	 *
	 * @see <a href="http://schema.org/itemListElement">itemListElement</a>
	 */
	public static final URI itemListElement;

	/**
	 * Item List Order
	 * <p>
	 * {@code http://schema.org/itemListOrder}.
	 * <p>
	 * Type of ordering (e.g. Ascending, Descending, Unordered).
	 *
	 * @see <a href="http://schema.org/itemListOrder">itemListOrder</a>
	 */
	public static final URI itemListOrder;

	/**
	 * Item Offered
	 * <p>
	 * {@code http://schema.org/itemOffered}.
	 * <p>
	 * The item being offered.
	 *
	 * @see <a href="http://schema.org/itemOffered">itemOffered</a>
	 */
	public static final URI itemOffered;

	/**
	 * Item Page
	 * <p>
	 * {@code http://schema.org/ItemPage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ItemPage">ItemPage</a>
	 */
	public static final URI ItemPage;

	/**
	 * Item Reviewed
	 * <p>
	 * {@code http://schema.org/itemReviewed}.
	 * <p>
	 * The item that is being reviewed/rated.
	 *
	 * @see <a href="http://schema.org/itemReviewed">itemReviewed</a>
	 */
	public static final URI itemReviewed;

	/**
	 * Item Shipped
	 * <p>
	 * {@code http://schema.org/itemShipped}.
	 * <p>
	 * Item(s) being shipped.
	 *
	 * @see <a href="http://schema.org/itemShipped">itemShipped</a>
	 */
	public static final URI itemShipped;

	/**
	 * Jewelry Store
	 * <p>
	 * {@code http://schema.org/JewelryStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/JewelryStore">JewelryStore</a>
	 */
	public static final URI JewelryStore;

	/**
	 * Job Location
	 * <p>
	 * {@code http://schema.org/jobLocation}.
	 * <p>
	 * A (typically single) geographic location associated with the job
	 * position.
	 *
	 * @see <a href="http://schema.org/jobLocation">jobLocation</a>
	 */
	public static final URI jobLocation;

	/**
	 * Job Posting
	 * <p>
	 * {@code http://schema.org/JobPosting}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/JobPosting">JobPosting</a>
	 */
	public static final URI JobPosting;

	/**
	 * Job Title
	 * <p>
	 * {@code http://schema.org/jobTitle}.
	 * <p>
	 * The job title of the person (for example, Financial Manager).
	 *
	 * @see <a href="http://schema.org/jobTitle">jobTitle</a>
	 */
	public static final URI jobTitle;

	/**
	 * Join Action
	 * <p>
	 * {@code http://schema.org/JoinAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/JoinAction">JoinAction</a>
	 */
	public static final URI JoinAction;

	/**
	 * Joint
	 * <p>
	 * {@code http://schema.org/Joint}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Joint">Joint</a>
	 */
	public static final URI Joint;

	/**
	 * Keywords
	 * <p>
	 * {@code http://schema.org/keywords}.
	 * <p>
	 * The keywords/tags used to describe this content.
	 *
	 * @see <a href="http://schema.org/keywords">keywords</a>
	 */
	public static final URI keywords;

	/**
	 * Knows
	 * <p>
	 * {@code http://schema.org/knows}.
	 * <p>
	 * The most generic bi-directional social/work relation.
	 *
	 * @see <a href="http://schema.org/knows">knows</a>
	 */
	public static final URI knows;

	/**
	 * Label Details
	 * <p>
	 * {@code http://schema.org/labelDetails}.
	 * <p>
	 * Link to the drug's label details.
	 *
	 * @see <a href="http://schema.org/labelDetails">labelDetails</a>
	 */
	public static final URI labelDetails;

	/**
	 * Lake Body of Water
	 * <p>
	 * {@code http://schema.org/LakeBodyOfWater}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LakeBodyOfWater">LakeBodyOfWater</a>
	 */
	public static final URI LakeBodyOfWater;

	/**
	 * Landform
	 * <p>
	 * {@code http://schema.org/Landform}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Landform">Landform</a>
	 */
	public static final URI Landform;

	/**
	 * Landlord
	 * <p>
	 * {@code http://schema.org/landlord}.
	 * <p>
	 * A sub property of participant. The owner of the real estate property.
	 * Sub property of destination or participant?
	 *
	 * @see <a href="http://schema.org/landlord">landlord</a>
	 */
	public static final URI landlord;

	/**
	 * Landmarks or Historical Buildings
	 * <p>
	 * {@code http://schema.org/LandmarksOrHistoricalBuildings}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LandmarksOrHistoricalBuildings">LandmarksOrHistoricalBuildings</a>
	 */
	public static final URI LandmarksOrHistoricalBuildings;

	/**
	 * Language
	 * <p>
	 * {@code http://schema.org/language}.
	 * <p>
	 * A sub property of instrument. The languaged used on this action.
	 *
	 * @see <a href="http://schema.org/language">language</a>
	 */
	public static final URI language;

	/**
	 * Language
	 * <p>
	 * {@code http://schema.org/Language}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Language">Language</a>
	 */
	public static final URI Language;

	/**
	 * Last Reviewed
	 * <p>
	 * {@code http://schema.org/lastReviewed}.
	 * <p>
	 * Date on which the content on this web page was last reviewed for
	 * accuracy and/or completeness.
	 *
	 * @see <a href="http://schema.org/lastReviewed">lastReviewed</a>
	 */
	public static final URI lastReviewed;

	/**
	 * Latitude
	 * <p>
	 * {@code http://schema.org/latitude}.
	 * <p>
	 * The latitude of a location. For example 37.42242.
	 *
	 * @see <a href="http://schema.org/latitude">latitude</a>
	 */
	public static final URI latitude;

	/**
	 * Learning Resource Type
	 * <p>
	 * {@code http://schema.org/learningResourceType}.
	 * <p>
	 * The predominant type or kind characterizing the learning resource. For
	 * example, 'presentation', 'handout'.
	 *
	 * @see <a href="http://schema.org/learningResourceType">learningResourceType</a>
	 */
	public static final URI learningResourceType;

	/**
	 * Leave Action
	 * <p>
	 * {@code http://schema.org/LeaveAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LeaveAction">LeaveAction</a>
	 */
	public static final URI LeaveAction;

	/**
	 * Legal Name
	 * <p>
	 * {@code http://schema.org/legalName}.
	 * <p>
	 * The official name of the organization, e.g. the registered company
	 * name.
	 *
	 * @see <a href="http://schema.org/legalName">legalName</a>
	 */
	public static final URI legalName;

	/**
	 * Legal Status
	 * <p>
	 * {@code http://schema.org/legalStatus}.
	 * <p>
	 * The drug or supplement's legal status, including any controlled
	 * substance schedules that apply.
	 *
	 * @see <a href="http://schema.org/legalStatus">legalStatus</a>
	 */
	public static final URI legalStatus;

	/**
	 * Legislative Building
	 * <p>
	 * {@code http://schema.org/LegislativeBuilding}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LegislativeBuilding">LegislativeBuilding</a>
	 */
	public static final URI LegislativeBuilding;

	/**
	 * Lend Action
	 * <p>
	 * {@code http://schema.org/LendAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LendAction">LendAction</a>
	 */
	public static final URI LendAction;

	/**
	 * Lender
	 * <p>
	 * {@code http://schema.org/lender}.
	 * <p>
	 * A sub property of participant. The person that lends the object being
	 * borrowed.
	 *
	 * @see <a href="http://schema.org/lender">lender</a>
	 */
	public static final URI lender;

	/**
	 * Lesser
	 * <p>
	 * {@code http://schema.org/lesser}.
	 * <p>
	 * This ordering relation for qualitative values indicates that the
	 * subject is lesser than the object.
	 *
	 * @see <a href="http://schema.org/lesser">lesser</a>
	 */
	public static final URI lesser;

	/**
	 * Lesser or Equal
	 * <p>
	 * {@code http://schema.org/lesserOrEqual}.
	 * <p>
	 * This ordering relation for qualitative values indicates that the
	 * subject is lesser than or equal to the object.
	 *
	 * @see <a href="http://schema.org/lesserOrEqual">lesserOrEqual</a>
	 */
	public static final URI lesserOrEqual;

	/**
	 * Library
	 * <p>
	 * {@code http://schema.org/Library}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Library">Library</a>
	 */
	public static final URI Library;

	/**
	 * Lifestyle Modification
	 * <p>
	 * {@code http://schema.org/LifestyleModification}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LifestyleModification">LifestyleModification</a>
	 */
	public static final URI LifestyleModification;

	/**
	 * Ligament
	 * <p>
	 * {@code http://schema.org/Ligament}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Ligament">Ligament</a>
	 */
	public static final URI Ligament;

	/**
	 * Like Action
	 * <p>
	 * {@code http://schema.org/LikeAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LikeAction">LikeAction</a>
	 */
	public static final URI LikeAction;

	/**
	 * Line
	 * <p>
	 * {@code http://schema.org/line}.
	 * <p>
	 * A line is a point-to-point path consisting of two or more points. A
	 * line is expressed as a series of two or more point objects separated
	 * by space.
	 *
	 * @see <a href="http://schema.org/line">line</a>
	 */
	public static final URI line;

	/**
	 * Liquor Store
	 * <p>
	 * {@code http://schema.org/LiquorStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LiquorStore">LiquorStore</a>
	 */
	public static final URI LiquorStore;

	/**
	 * Listen Action
	 * <p>
	 * {@code http://schema.org/ListenAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ListenAction">ListenAction</a>
	 */
	public static final URI ListenAction;

	/**
	 * Literary Event
	 * <p>
	 * {@code http://schema.org/LiteraryEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LiteraryEvent">LiteraryEvent</a>
	 */
	public static final URI LiteraryEvent;

	/**
	 * Local Business
	 * <p>
	 * {@code http://schema.org/LocalBusiness}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LocalBusiness">LocalBusiness</a>
	 */
	public static final URI LocalBusiness;

	/**
	 * Location
	 * <p>
	 * {@code http://schema.org/location}.
	 * <p>
	 * The location of the event, organization or action.
	 *
	 * @see <a href="http://schema.org/location">location</a>
	 */
	public static final URI location;

	/**
	 * Locker Delivery
	 * <p>
	 * {@code http://schema.org/LockerDelivery}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LockerDelivery">LockerDelivery</a>
	 */
	public static final URI LockerDelivery;

	/**
	 * Locksmith
	 * <p>
	 * {@code http://schema.org/Locksmith}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Locksmith">Locksmith</a>
	 */
	public static final URI Locksmith;

	/**
	 * Lodging Business
	 * <p>
	 * {@code http://schema.org/LodgingBusiness}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LodgingBusiness">LodgingBusiness</a>
	 */
	public static final URI LodgingBusiness;

	/**
	 * Logo
	 * <p>
	 * {@code http://schema.org/logo}.
	 * <p>
	 * A logo associated with an organization.
	 *
	 * @see <a href="http://schema.org/logo">logo</a>
	 */
	public static final URI logo;

	/**
	 * Longitude
	 * <p>
	 * {@code http://schema.org/longitude}.
	 * <p>
	 * The longitude of a location. For example -122.08585.
	 *
	 * @see <a href="http://schema.org/longitude">longitude</a>
	 */
	public static final URI longitude;

	/**
	 * Lose Action
	 * <p>
	 * {@code http://schema.org/LoseAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LoseAction">LoseAction</a>
	 */
	public static final URI LoseAction;

	/**
	 * Loser
	 * <p>
	 * {@code http://schema.org/loser}.
	 * <p>
	 * A sub property of participant. The loser of the action.
	 *
	 * @see <a href="http://schema.org/loser">loser</a>
	 */
	public static final URI loser;

	/**
	 * Low Price
	 * <p>
	 * {@code http://schema.org/lowPrice}.
	 * <p>
	 * The lowest price of all offers available.
	 *
	 * @see <a href="http://schema.org/lowPrice">lowPrice</a>
	 */
	public static final URI lowPrice;

	/**
	 * Lymphatic Vessel
	 * <p>
	 * {@code http://schema.org/LymphaticVessel}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/LymphaticVessel">LymphaticVessel</a>
	 */
	public static final URI LymphaticVessel;

	/**
	 * Main Content of Page
	 * <p>
	 * {@code http://schema.org/mainContentOfPage}.
	 * <p>
	 * Indicates if this web page element is the main subject of the page.
	 *
	 * @see <a href="http://schema.org/mainContentOfPage">mainContentOfPage</a>
	 */
	public static final URI mainContentOfPage;

	/**
	 * Makes Offer
	 * <p>
	 * {@code http://schema.org/makesOffer}.
	 * <p>
	 * A pointer to products or services offered by the organization or
	 * person.
	 *
	 * @see <a href="http://schema.org/makesOffer">makesOffer</a>
	 */
	public static final URI makesOffer;

	/**
	 * Manufacturer
	 * <p>
	 * {@code http://schema.org/manufacturer}.
	 * <p>
	 * The manufacturer of the product.
	 *
	 * @see <a href="http://schema.org/manufacturer">manufacturer</a>
	 */
	public static final URI manufacturer;

	/**
	 * Map
	 * <p>
	 * {@code http://schema.org/Map}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Map">Map</a>
	 */
	public static final URI Map;

	/**
	 * Map
	 * <p>
	 * {@code http://schema.org/map}.
	 * <p>
	 * A URL to a map of the place.
	 *
	 * @see <a href="http://schema.org/map">map</a>
	 */
	public static final URI map;

	/**
	 * Maps
	 * <p>
	 * {@code http://schema.org/maps}.
	 * <p>
	 * A URL to a map of the place (legacy spelling; see singular form, map).
	 *
	 * @see <a href="http://schema.org/maps">maps</a>
	 */
	public static final URI maps;

	/**
	 * Marry Action
	 * <p>
	 * {@code http://schema.org/MarryAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MarryAction">MarryAction</a>
	 */
	public static final URI MarryAction;

	/**
	 * Mass
	 * <p>
	 * {@code http://schema.org/Mass}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Mass">Mass</a>
	 */
	public static final URI Mass;

	/**
	 * Maximum Dose Schedule
	 * <p>
	 * {@code http://schema.org/MaximumDoseSchedule}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MaximumDoseSchedule">MaximumDoseSchedule</a>
	 */
	public static final URI MaximumDoseSchedule;

	/**
	 * Maximum Intake
	 * <p>
	 * {@code http://schema.org/maximumIntake}.
	 * <p>
	 * Recommended intake of this supplement for a given population as
	 * defined by a specific recommending authority.
	 *
	 * @see <a href="http://schema.org/maximumIntake">maximumIntake</a>
	 */
	public static final URI maximumIntake;

	/**
	 * Max Price
	 * <p>
	 * {@code http://schema.org/maxPrice}.
	 * <p>
	 * The highest price if the price is a range.
	 *
	 * @see <a href="http://schema.org/maxPrice">maxPrice</a>
	 */
	public static final URI maxPrice;

	/**
	 * Max Value
	 * <p>
	 * {@code http://schema.org/maxValue}.
	 * <p>
	 * The upper of the product characteristic.
	 *
	 * @see <a href="http://schema.org/maxValue">maxValue</a>
	 */
	public static final URI maxValue;

	/**
	 * Mechanism of Action
	 * <p>
	 * {@code http://schema.org/mechanismOfAction}.
	 * <p>
	 * The specific biochemical interaction through which this drug or
	 * supplement produces its pharmacological effect.
	 *
	 * @see <a href="http://schema.org/mechanismOfAction">mechanismOfAction</a>
	 */
	public static final URI mechanismOfAction;

	/**
	 * Media Object
	 * <p>
	 * {@code http://schema.org/MediaObject}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MediaObject">MediaObject</a>
	 */
	public static final URI MediaObject;

	/**
	 * Medical Audience
	 * <p>
	 * {@code http://schema.org/MedicalAudience}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalAudience">MedicalAudience</a>
	 */
	public static final URI MedicalAudience;

	/**
	 * Medical Cause
	 * <p>
	 * {@code http://schema.org/MedicalCause}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalCause">MedicalCause</a>
	 */
	public static final URI MedicalCause;

	/**
	 * Medical Clinic
	 * <p>
	 * {@code http://schema.org/MedicalClinic}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalClinic">MedicalClinic</a>
	 */
	public static final URI MedicalClinic;

	/**
	 * Medical Code
	 * <p>
	 * {@code http://schema.org/MedicalCode}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalCode">MedicalCode</a>
	 */
	public static final URI MedicalCode;

	/**
	 * Medical Condition
	 * <p>
	 * {@code http://schema.org/MedicalCondition}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalCondition">MedicalCondition</a>
	 */
	public static final URI MedicalCondition;

	/**
	 * Medical Condition Stage
	 * <p>
	 * {@code http://schema.org/MedicalConditionStage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalConditionStage">MedicalConditionStage</a>
	 */
	public static final URI MedicalConditionStage;

	/**
	 * Medical Contraindication
	 * <p>
	 * {@code http://schema.org/MedicalContraindication}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalContraindication">MedicalContraindication</a>
	 */
	public static final URI MedicalContraindication;

	/**
	 * Medical Device
	 * <p>
	 * {@code http://schema.org/MedicalDevice}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalDevice">MedicalDevice</a>
	 */
	public static final URI MedicalDevice;

	/**
	 * Medical Device Purpose
	 * <p>
	 * {@code http://schema.org/MedicalDevicePurpose}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalDevicePurpose">MedicalDevicePurpose</a>
	 */
	public static final URI MedicalDevicePurpose;

	/**
	 * Medical Entity
	 * <p>
	 * {@code http://schema.org/MedicalEntity}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalEntity">MedicalEntity</a>
	 */
	public static final URI MedicalEntity;

	/**
	 * Medical Enumeration
	 * <p>
	 * {@code http://schema.org/MedicalEnumeration}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalEnumeration">MedicalEnumeration</a>
	 */
	public static final URI MedicalEnumeration;

	/**
	 * Medical Evidence Level
	 * <p>
	 * {@code http://schema.org/MedicalEvidenceLevel}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalEvidenceLevel">MedicalEvidenceLevel</a>
	 */
	public static final URI MedicalEvidenceLevel;

	/**
	 * Medical Guideline
	 * <p>
	 * {@code http://schema.org/MedicalGuideline}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalGuideline">MedicalGuideline</a>
	 */
	public static final URI MedicalGuideline;

	/**
	 * Medical Guideline Contraindication
	 * <p>
	 * {@code http://schema.org/MedicalGuidelineContraindication}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalGuidelineContraindication">MedicalGuidelineContraindication</a>
	 */
	public static final URI MedicalGuidelineContraindication;

	/**
	 * Medical Guideline Recommendation
	 * <p>
	 * {@code http://schema.org/MedicalGuidelineRecommendation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">MedicalGuidelineRecommendation</a>
	 */
	public static final URI MedicalGuidelineRecommendation;

	/**
	 * Medical Imaging Technique
	 * <p>
	 * {@code http://schema.org/MedicalImagingTechnique}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalImagingTechnique">MedicalImagingTechnique</a>
	 */
	public static final URI MedicalImagingTechnique;

	/**
	 * Medical Indication
	 * <p>
	 * {@code http://schema.org/MedicalIndication}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalIndication">MedicalIndication</a>
	 */
	public static final URI MedicalIndication;

	/**
	 * Medical Intangible
	 * <p>
	 * {@code http://schema.org/MedicalIntangible}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalIntangible">MedicalIntangible</a>
	 */
	public static final URI MedicalIntangible;

	/**
	 * Medical Observational Study
	 * <p>
	 * {@code http://schema.org/MedicalObservationalStudy}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalObservationalStudy">MedicalObservationalStudy</a>
	 */
	public static final URI MedicalObservationalStudy;

	/**
	 * Medical Observational Study Design
	 * <p>
	 * {@code http://schema.org/MedicalObservationalStudyDesign}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalObservationalStudyDesign">MedicalObservationalStudyDesign</a>
	 */
	public static final URI MedicalObservationalStudyDesign;

	/**
	 * Medical Organization
	 * <p>
	 * {@code http://schema.org/MedicalOrganization}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalOrganization">MedicalOrganization</a>
	 */
	public static final URI MedicalOrganization;

	/**
	 * Medical Procedure
	 * <p>
	 * {@code http://schema.org/MedicalProcedure}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalProcedure">MedicalProcedure</a>
	 */
	public static final URI MedicalProcedure;

	/**
	 * Medical Procedure Type
	 * <p>
	 * {@code http://schema.org/MedicalProcedureType}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalProcedureType">MedicalProcedureType</a>
	 */
	public static final URI MedicalProcedureType;

	/**
	 * Medical Risk Calculator
	 * <p>
	 * {@code http://schema.org/MedicalRiskCalculator}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalRiskCalculator">MedicalRiskCalculator</a>
	 */
	public static final URI MedicalRiskCalculator;

	/**
	 * Medical Risk Estimator
	 * <p>
	 * {@code http://schema.org/MedicalRiskEstimator}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalRiskEstimator">MedicalRiskEstimator</a>
	 */
	public static final URI MedicalRiskEstimator;

	/**
	 * Medical Risk Factor
	 * <p>
	 * {@code http://schema.org/MedicalRiskFactor}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalRiskFactor">MedicalRiskFactor</a>
	 */
	public static final URI MedicalRiskFactor;

	/**
	 * Medical Risk Score
	 * <p>
	 * {@code http://schema.org/MedicalRiskScore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalRiskScore">MedicalRiskScore</a>
	 */
	public static final URI MedicalRiskScore;

	/**
	 * Medical Scholarly Article
	 * <p>
	 * {@code http://schema.org/MedicalScholarlyArticle}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalScholarlyArticle">MedicalScholarlyArticle</a>
	 */
	public static final URI MedicalScholarlyArticle;

	/**
	 * Medical Sign
	 * <p>
	 * {@code http://schema.org/MedicalSign}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalSign">MedicalSign</a>
	 */
	public static final URI MedicalSign;

	/**
	 * Medical Sign or Symptom
	 * <p>
	 * {@code http://schema.org/MedicalSignOrSymptom}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalSignOrSymptom">MedicalSignOrSymptom</a>
	 */
	public static final URI MedicalSignOrSymptom;

	/**
	 * Medical Specialty
	 * <p>
	 * {@code http://schema.org/MedicalSpecialty}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalSpecialty">MedicalSpecialty</a>
	 */
	public static final URI MedicalSpecialty;

	/**
	 * Medical Specialty
	 * <p>
	 * {@code http://schema.org/medicalSpecialty}.
	 * <p>
	 * A medical specialty of the provider.
	 *
	 * @see <a href="http://schema.org/medicalSpecialty">medicalSpecialty</a>
	 */
	public static final URI medicalSpecialty;

	/**
	 * Medical Study
	 * <p>
	 * {@code http://schema.org/MedicalStudy}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalStudy">MedicalStudy</a>
	 */
	public static final URI MedicalStudy;

	/**
	 * Medical Study Status
	 * <p>
	 * {@code http://schema.org/MedicalStudyStatus}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalStudyStatus">MedicalStudyStatus</a>
	 */
	public static final URI MedicalStudyStatus;

	/**
	 * Medical Symptom
	 * <p>
	 * {@code http://schema.org/MedicalSymptom}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalSymptom">MedicalSymptom</a>
	 */
	public static final URI MedicalSymptom;

	/**
	 * Medical Test
	 * <p>
	 * {@code http://schema.org/MedicalTest}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalTest">MedicalTest</a>
	 */
	public static final URI MedicalTest;

	/**
	 * Medical Test Panel
	 * <p>
	 * {@code http://schema.org/MedicalTestPanel}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalTestPanel">MedicalTestPanel</a>
	 */
	public static final URI MedicalTestPanel;

	/**
	 * Medical Therapy
	 * <p>
	 * {@code http://schema.org/MedicalTherapy}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalTherapy">MedicalTherapy</a>
	 */
	public static final URI MedicalTherapy;

	/**
	 * Medical Trial
	 * <p>
	 * {@code http://schema.org/MedicalTrial}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalTrial">MedicalTrial</a>
	 */
	public static final URI MedicalTrial;

	/**
	 * Medical Trial Design
	 * <p>
	 * {@code http://schema.org/MedicalTrialDesign}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalTrialDesign">MedicalTrialDesign</a>
	 */
	public static final URI MedicalTrialDesign;

	/**
	 * Medical Web Page
	 * <p>
	 * {@code http://schema.org/MedicalWebPage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicalWebPage">MedicalWebPage</a>
	 */
	public static final URI MedicalWebPage;

	/**
	 * Medicine System
	 * <p>
	 * {@code http://schema.org/MedicineSystem}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MedicineSystem">MedicineSystem</a>
	 */
	public static final URI MedicineSystem;

	/**
	 * Medicine System
	 * <p>
	 * {@code http://schema.org/medicineSystem}.
	 * <p>
	 * The system of medicine that includes this MedicalEntity, for example
	 * 'evidence-based', 'homeopathic', 'chiropractic', etc.
	 *
	 * @see <a href="http://schema.org/medicineSystem">medicineSystem</a>
	 */
	public static final URI medicineSystem;

	/**
	 * Member
	 * <p>
	 * {@code http://schema.org/member}.
	 * <p>
	 * A member of this organization.
	 *
	 * @see <a href="http://schema.org/member">member</a>
	 */
	public static final URI member;

	/**
	 * Member of
	 * <p>
	 * {@code http://schema.org/memberOf}.
	 * <p>
	 * An organization to which the person belongs.
	 *
	 * @see <a href="http://schema.org/memberOf">memberOf</a>
	 */
	public static final URI memberOf;

	/**
	 * Members
	 * <p>
	 * {@code http://schema.org/members}.
	 * <p>
	 * A member of this organization (legacy spelling; see singular form,
	 * member).
	 *
	 * @see <a href="http://schema.org/members">members</a>
	 */
	public static final URI members;

	/**
	 * Memory Requirements
	 * <p>
	 * {@code http://schema.org/memoryRequirements}.
	 * <p>
	 * Minimum memory requirements.
	 *
	 * @see <a href="http://schema.org/memoryRequirements">memoryRequirements</a>
	 */
	public static final URI memoryRequirements;

	/**
	 * Mens Clothing Store
	 * <p>
	 * {@code http://schema.org/MensClothingStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MensClothingStore">MensClothingStore</a>
	 */
	public static final URI MensClothingStore;

	/**
	 * Mentions
	 * <p>
	 * {@code http://schema.org/mentions}.
	 * <p>
	 * Indicates that the CreativeWork contains a reference to, but is not
	 * necessarily about a concept.
	 *
	 * @see <a href="http://schema.org/mentions">mentions</a>
	 */
	public static final URI mentions;

	/**
	 * Menu
	 * <p>
	 * {@code http://schema.org/menu}.
	 * <p>
	 * Either the actual menu or a URL of the menu.
	 *
	 * @see <a href="http://schema.org/menu">menu</a>
	 */
	public static final URI menu;

	/**
	 * Merchant
	 * <p>
	 * {@code http://schema.org/merchant}.
	 * <p>
	 * The party taking the order (e.g. Amazon.com is a merchant for many
	 * sellers).
	 *
	 * @see <a href="http://schema.org/merchant">merchant</a>
	 */
	public static final URI merchant;

	/**
	 * Middle School
	 * <p>
	 * {@code http://schema.org/MiddleSchool}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MiddleSchool">MiddleSchool</a>
	 */
	public static final URI MiddleSchool;

	/**
	 * Min Price
	 * <p>
	 * {@code http://schema.org/minPrice}.
	 * <p>
	 * The lowest price if the price is a range.
	 *
	 * @see <a href="http://schema.org/minPrice">minPrice</a>
	 */
	public static final URI minPrice;

	/**
	 * Min Value
	 * <p>
	 * {@code http://schema.org/minValue}.
	 * <p>
	 * The lower value of the product characteristic.
	 *
	 * @see <a href="http://schema.org/minValue">minValue</a>
	 */
	public static final URI minValue;

	/**
	 * Mobile Application
	 * <p>
	 * {@code http://schema.org/MobileApplication}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MobileApplication">MobileApplication</a>
	 */
	public static final URI MobileApplication;

	/**
	 * Mobile Phone Store
	 * <p>
	 * {@code http://schema.org/MobilePhoneStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MobilePhoneStore">MobilePhoneStore</a>
	 */
	public static final URI MobilePhoneStore;

	/**
	 * Model
	 * <p>
	 * {@code http://schema.org/model}.
	 * <p>
	 * The model of the product. Use with the URL of a ProductModel or a
	 * textual representation of the model identifier. The URL of the
	 * ProductModel can be from an external source. It is recommended to
	 * additionally provide strong product identifiers via the
	 * gtin8/gtin13/gtin14 and mpn properties.
	 *
	 * @see <a href="http://schema.org/model">model</a>
	 */
	public static final URI model;

	/**
	 * Mosque
	 * <p>
	 * {@code http://schema.org/Mosque}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Mosque">Mosque</a>
	 */
	public static final URI Mosque;

	/**
	 * Motel
	 * <p>
	 * {@code http://schema.org/Motel}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Motel">Motel</a>
	 */
	public static final URI Motel;

	/**
	 * Motorcycle Dealer
	 * <p>
	 * {@code http://schema.org/MotorcycleDealer}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MotorcycleDealer">MotorcycleDealer</a>
	 */
	public static final URI MotorcycleDealer;

	/**
	 * Motorcycle Repair
	 * <p>
	 * {@code http://schema.org/MotorcycleRepair}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MotorcycleRepair">MotorcycleRepair</a>
	 */
	public static final URI MotorcycleRepair;

	/**
	 * Mountain
	 * <p>
	 * {@code http://schema.org/Mountain}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Mountain">Mountain</a>
	 */
	public static final URI Mountain;

	/**
	 * Move Action
	 * <p>
	 * {@code http://schema.org/MoveAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MoveAction">MoveAction</a>
	 */
	public static final URI MoveAction;

	/**
	 * Movie
	 * <p>
	 * {@code http://schema.org/Movie}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Movie">Movie</a>
	 */
	public static final URI Movie;

	/**
	 * Movie Rental Store
	 * <p>
	 * {@code http://schema.org/MovieRentalStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MovieRentalStore">MovieRentalStore</a>
	 */
	public static final URI MovieRentalStore;

	/**
	 * Movie Theater
	 * <p>
	 * {@code http://schema.org/MovieTheater}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MovieTheater">MovieTheater</a>
	 */
	public static final URI MovieTheater;

	/**
	 * Moving Company
	 * <p>
	 * {@code http://schema.org/MovingCompany}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MovingCompany">MovingCompany</a>
	 */
	public static final URI MovingCompany;

	/**
	 * Mpn
	 * <p>
	 * {@code http://schema.org/mpn}.
	 * <p>
	 * The Manufacturer Part Number (MPN) of the product, or the product to
	 * which the offer refers.
	 *
	 * @see <a href="http://schema.org/mpn">mpn</a>
	 */
	public static final URI mpn;

	/**
	 * Muscle
	 * <p>
	 * {@code http://schema.org/Muscle}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Muscle">Muscle</a>
	 */
	public static final URI Muscle;

	/**
	 * Museum
	 * <p>
	 * {@code http://schema.org/Museum}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Museum">Museum</a>
	 */
	public static final URI Museum;

	/**
	 * Music Album
	 * <p>
	 * {@code http://schema.org/MusicAlbum}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MusicAlbum">MusicAlbum</a>
	 */
	public static final URI MusicAlbum;

	/**
	 * Music by
	 * <p>
	 * {@code http://schema.org/musicBy}.
	 * <p>
	 * The composer of the movie or TV/radio soundtrack.
	 *
	 * @see <a href="http://schema.org/musicBy">musicBy</a>
	 */
	public static final URI musicBy;

	/**
	 * Music Event
	 * <p>
	 * {@code http://schema.org/MusicEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MusicEvent">MusicEvent</a>
	 */
	public static final URI MusicEvent;

	/**
	 * Music Group
	 * <p>
	 * {@code http://schema.org/MusicGroup}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MusicGroup">MusicGroup</a>
	 */
	public static final URI MusicGroup;

	/**
	 * Music Group Member
	 * <p>
	 * {@code http://schema.org/musicGroupMember}.
	 * <p>
	 * A member of the music group—for example, John, Paul, George, or Ringo.
	 *
	 * @see <a href="http://schema.org/musicGroupMember">musicGroupMember</a>
	 */
	public static final URI musicGroupMember;

	/**
	 * Music Playlist
	 * <p>
	 * {@code http://schema.org/MusicPlaylist}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MusicPlaylist">MusicPlaylist</a>
	 */
	public static final URI MusicPlaylist;

	/**
	 * Music Recording
	 * <p>
	 * {@code http://schema.org/MusicRecording}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MusicRecording">MusicRecording</a>
	 */
	public static final URI MusicRecording;

	/**
	 * Music Store
	 * <p>
	 * {@code http://schema.org/MusicStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MusicStore">MusicStore</a>
	 */
	public static final URI MusicStore;

	/**
	 * Music Venue
	 * <p>
	 * {@code http://schema.org/MusicVenue}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MusicVenue">MusicVenue</a>
	 */
	public static final URI MusicVenue;

	/**
	 * Music Video Object
	 * <p>
	 * {@code http://schema.org/MusicVideoObject}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/MusicVideoObject">MusicVideoObject</a>
	 */
	public static final URI MusicVideoObject;

	/**
	 * Naics
	 * <p>
	 * {@code http://schema.org/naics}.
	 * <p>
	 * The North American Industry Classification System (NAICS) code for a
	 * particular organization or business person.
	 *
	 * @see <a href="http://schema.org/naics">naics</a>
	 */
	public static final URI naics;

	/**
	 * Nail Salon
	 * <p>
	 * {@code http://schema.org/NailSalon}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/NailSalon">NailSalon</a>
	 */
	public static final URI NailSalon;

	/**
	 * Name
	 * <p>
	 * {@code http://schema.org/name}.
	 * <p>
	 * The name of the item.
	 *
	 * @see <a href="http://schema.org/name">name</a>
	 */
	public static final URI name;

	/**
	 * Nationality
	 * <p>
	 * {@code http://schema.org/nationality}.
	 * <p>
	 * Nationality of the person.
	 *
	 * @see <a href="http://schema.org/nationality">nationality</a>
	 */
	public static final URI nationality;

	/**
	 * Natural Progression
	 * <p>
	 * {@code http://schema.org/naturalProgression}.
	 * <p>
	 * The expected progression of the condition if it is not treated and
	 * allowed to progress naturally.
	 *
	 * @see <a href="http://schema.org/naturalProgression">naturalProgression</a>
	 */
	public static final URI naturalProgression;

	/**
	 * Nerve
	 * <p>
	 * {@code http://schema.org/Nerve}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Nerve">Nerve</a>
	 */
	public static final URI Nerve;

	/**
	 * Nerve
	 * <p>
	 * {@code http://schema.org/nerve}.
	 * <p>
	 * The underlying innervation associated with the muscle.
	 *
	 * @see <a href="http://schema.org/nerve">nerve</a>
	 */
	public static final URI nerve;

	/**
	 * Nerve Motor
	 * <p>
	 * {@code http://schema.org/nerveMotor}.
	 * <p>
	 * The neurological pathway extension that involves muscle control.
	 *
	 * @see <a href="http://schema.org/nerveMotor">nerveMotor</a>
	 */
	public static final URI nerveMotor;

	/**
	 * News Article
	 * <p>
	 * {@code http://schema.org/NewsArticle}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/NewsArticle">NewsArticle</a>
	 */
	public static final URI NewsArticle;

	/**
	 * NGO
	 * <p>
	 * {@code http://schema.org/NGO}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/NGO">NGO</a>
	 */
	public static final URI NGO;

	/**
	 * Night Club
	 * <p>
	 * {@code http://schema.org/NightClub}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/NightClub">NightClub</a>
	 */
	public static final URI NightClub;

	/**
	 * Non Equal
	 * <p>
	 * {@code http://schema.org/nonEqual}.
	 * <p>
	 * This ordering relation for qualitative values indicates that the
	 * subject is not equal to the object.
	 *
	 * @see <a href="http://schema.org/nonEqual">nonEqual</a>
	 */
	public static final URI nonEqual;

	/**
	 * Non Proprietary Name
	 * <p>
	 * {@code http://schema.org/nonProprietaryName}.
	 * <p>
	 * The generic name of this drug or supplement.
	 *
	 * @see <a href="http://schema.org/nonProprietaryName">nonProprietaryName</a>
	 */
	public static final URI nonProprietaryName;

	/**
	 * Normal Range
	 * <p>
	 * {@code http://schema.org/normalRange}.
	 * <p>
	 * Range of acceptable values for a typical patient, when applicable.
	 *
	 * @see <a href="http://schema.org/normalRange">normalRange</a>
	 */
	public static final URI normalRange;

	/**
	 * Notary
	 * <p>
	 * {@code http://schema.org/Notary}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Notary">Notary</a>
	 */
	public static final URI Notary;

	/**
	 * Numberof Employees
	 * <p>
	 * {@code http://schema.org/numberofEmployees}.
	 * <p>
	 * The size of business by number of employees.
	 *
	 * @see <a href="http://schema.org/numberofEmployees">numberofEmployees</a>
	 */
	public static final URI numberofEmployees;

	/**
	 * Number of Episodes
	 * <p>
	 * {@code http://schema.org/numberOfEpisodes}.
	 * <p>
	 * The number of episodes in this season or series.
	 *
	 * @see <a href="http://schema.org/numberOfEpisodes">numberOfEpisodes</a>
	 */
	public static final URI numberOfEpisodes;

	/**
	 * Number of Pages
	 * <p>
	 * {@code http://schema.org/numberOfPages}.
	 * <p>
	 * The number of pages in the book.
	 *
	 * @see <a href="http://schema.org/numberOfPages">numberOfPages</a>
	 */
	public static final URI numberOfPages;

	/**
	 * Number of Seasons
	 * <p>
	 * {@code http://schema.org/numberOfSeasons}.
	 * <p>
	 * The number of seasons in this series.
	 *
	 * @see <a href="http://schema.org/numberOfSeasons">numberOfSeasons</a>
	 */
	public static final URI numberOfSeasons;

	/**
	 * Num Tracks
	 * <p>
	 * {@code http://schema.org/numTracks}.
	 * <p>
	 * The number of tracks in this album or playlist.
	 *
	 * @see <a href="http://schema.org/numTracks">numTracks</a>
	 */
	public static final URI numTracks;

	/**
	 * Nutrition
	 * <p>
	 * {@code http://schema.org/nutrition}.
	 * <p>
	 * Nutrition information about the recipe.
	 *
	 * @see <a href="http://schema.org/nutrition">nutrition</a>
	 */
	public static final URI nutrition;

	/**
	 * Nutrition Information
	 * <p>
	 * {@code http://schema.org/NutritionInformation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/NutritionInformation">NutritionInformation</a>
	 */
	public static final URI NutritionInformation;

	/**
	 * Object
	 * <p>
	 * {@code http://schema.org/object}.
	 * <p>
	 * The object upon the action is carried out, whose state is kept intact
	 * or changed. Also known as the semantic roles patient, affected or
	 * undergoer (which change their state) or theme (which doesn't). e.g.
	 * John read *a book*.
	 *
	 * @see <a href="http://schema.org/object">object</a>
	 */
	public static final URI object;

	/**
	 * Occupational Category
	 * <p>
	 * {@code http://schema.org/occupationalCategory}.
	 * <p>
	 * Category or categories describing the job. Use BLS O*NET-SOC taxonomy:
	 * http://www.onetcenter.org/taxonomy.html. Ideally includes textual
	 * label and formal code, with the property repeated for each applicable
	 * value.
	 *
	 * @see <a href="http://schema.org/occupationalCategory">occupationalCategory</a>
	 */
	public static final URI occupationalCategory;

	/**
	 * Ocean Body of Water
	 * <p>
	 * {@code http://schema.org/OceanBodyOfWater}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/OceanBodyOfWater">OceanBodyOfWater</a>
	 */
	public static final URI OceanBodyOfWater;

	/**
	 * Offer
	 * <p>
	 * {@code http://schema.org/Offer}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Offer">Offer</a>
	 */
	public static final URI Offer;

	/**
	 * Offer Count
	 * <p>
	 * {@code http://schema.org/offerCount}.
	 * <p>
	 * The number of offers for the product.
	 *
	 * @see <a href="http://schema.org/offerCount">offerCount</a>
	 */
	public static final URI offerCount;

	/**
	 * Offer Item Condition
	 * <p>
	 * {@code http://schema.org/OfferItemCondition}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/OfferItemCondition">OfferItemCondition</a>
	 */
	public static final URI OfferItemCondition;

	/**
	 * Offers
	 * <p>
	 * {@code http://schema.org/offers}.
	 * <p>
	 * An offer to transfer some rights to an item or to provide a
	 * service—for example, an offer to sell tickets to an event, to rent the
	 * DVD of a movie, to stream a TV show over the internet, to repair a
	 * motorcycle, or to loan a book.
	 *
	 * @see <a href="http://schema.org/offers">offers</a>
	 */
	public static final URI offers;

	/**
	 * Office Equipment Store
	 * <p>
	 * {@code http://schema.org/OfficeEquipmentStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/OfficeEquipmentStore">OfficeEquipmentStore</a>
	 */
	public static final URI OfficeEquipmentStore;

	/**
	 * On Demand Event
	 * <p>
	 * {@code http://schema.org/OnDemandEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/OnDemandEvent">OnDemandEvent</a>
	 */
	public static final URI OnDemandEvent;

	/**
	 * On Site Pickup
	 * <p>
	 * {@code http://schema.org/OnSitePickup}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/OnSitePickup">OnSitePickup</a>
	 */
	public static final URI OnSitePickup;

	/**
	 * Opening Hours
	 * <p>
	 * {@code http://schema.org/openingHours}.
	 * <p>
	 * The opening hours for a business. Opening hours can be specified as a
	 * weekly time range, starting with days, then times per day. Multiple
	 * days can be listed with commas ',' separating each day. Day or time
	 * ranges are specified using a hyphen '-'.- Days are specified using the
	 * following two-letter combinations: Mo, Tu, We, Th, Fr, Sa, Su.- Times
	 * are specified using 24:00 time. For example, 3pm is specified as
	 * 15:00. - Here is an example: <time itemprop="openingHours"
	 * datetime="Tu,Th 16:00-20:00">Tuesdays and Thursdays 4-8pm</time>. - If
	 * a business is open 7 days a week, then it can be specified as <time
	 * itemprop="openingHours" datetime="Mo-Su">Monday through Sunday, all
	 * day</time>.
	 *
	 * @see <a href="http://schema.org/openingHours">openingHours</a>
	 */
	public static final URI openingHours;

	/**
	 * Opening Hours Specification
	 * <p>
	 * {@code http://schema.org/openingHoursSpecification}.
	 * <p>
	 * The opening hours of a certain place.
	 *
	 * @see <a href="http://schema.org/openingHoursSpecification">openingHoursSpecification</a>
	 */
	public static final URI openingHoursSpecification;

	/**
	 * Opening Hours Specification
	 * <p>
	 * {@code http://schema.org/OpeningHoursSpecification}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/OpeningHoursSpecification">OpeningHoursSpecification</a>
	 */
	public static final URI OpeningHoursSpecification;

	/**
	 * Opens
	 * <p>
	 * {@code http://schema.org/opens}.
	 * <p>
	 * The opening hour of the place or service on the given day(s) of the
	 * week.
	 *
	 * @see <a href="http://schema.org/opens">opens</a>
	 */
	public static final URI opens;

	/**
	 * Operating System
	 * <p>
	 * {@code http://schema.org/operatingSystem}.
	 * <p>
	 * Operating systems supported (Windows 7, OSX 10.6, Android 1.6).
	 *
	 * @see <a href="http://schema.org/operatingSystem">operatingSystem</a>
	 */
	public static final URI operatingSystem;

	/**
	 * Oponent
	 * <p>
	 * {@code http://schema.org/oponent}.
	 * <p>
	 * A sub property of participant. The oponent on this action.
	 *
	 * @see <a href="http://schema.org/oponent">oponent</a>
	 */
	public static final URI oponent;

	/**
	 * Optician
	 * <p>
	 * {@code http://schema.org/Optician}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Optician">Optician</a>
	 */
	public static final URI Optician;

	/**
	 * Option
	 * <p>
	 * {@code http://schema.org/option}.
	 * <p>
	 * A sub property of object. The options subject to this action.
	 *
	 * @see <a href="http://schema.org/option">option</a>
	 */
	public static final URI option;

	/**
	 * Order
	 * <p>
	 * {@code http://schema.org/Order}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Order">Order</a>
	 */
	public static final URI Order;

	/**
	 * Order Action
	 * <p>
	 * {@code http://schema.org/OrderAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/OrderAction">OrderAction</a>
	 */
	public static final URI OrderAction;

	/**
	 * Order Date
	 * <p>
	 * {@code http://schema.org/orderDate}.
	 * <p>
	 * Date order was placed.
	 *
	 * @see <a href="http://schema.org/orderDate">orderDate</a>
	 */
	public static final URI orderDate;

	/**
	 * Ordered Item
	 * <p>
	 * {@code http://schema.org/orderedItem}.
	 * <p>
	 * The item ordered.
	 *
	 * @see <a href="http://schema.org/orderedItem">orderedItem</a>
	 */
	public static final URI orderedItem;

	/**
	 * Order Number
	 * <p>
	 * {@code http://schema.org/orderNumber}.
	 * <p>
	 * The identifier of the transaction.
	 *
	 * @see <a href="http://schema.org/orderNumber">orderNumber</a>
	 */
	public static final URI orderNumber;

	/**
	 * Order Status
	 * <p>
	 * {@code http://schema.org/orderStatus}.
	 * <p>
	 * The current status of the order.
	 *
	 * @see <a href="http://schema.org/orderStatus">orderStatus</a>
	 */
	public static final URI orderStatus;

	/**
	 * Order Status
	 * <p>
	 * {@code http://schema.org/OrderStatus}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/OrderStatus">OrderStatus</a>
	 */
	public static final URI OrderStatus;

	/**
	 * Organization
	 * <p>
	 * {@code http://schema.org/Organization}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Organization">Organization</a>
	 */
	public static final URI Organization;

	/**
	 * Organize Action
	 * <p>
	 * {@code http://schema.org/OrganizeAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/OrganizeAction">OrganizeAction</a>
	 */
	public static final URI OrganizeAction;

	/**
	 * Origin
	 * <p>
	 * {@code http://schema.org/origin}.
	 * <p>
	 * The place or point where a muscle arises.
	 *
	 * @see <a href="http://schema.org/origin">origin</a>
	 */
	public static final URI origin;

	/**
	 * Origin Address
	 * <p>
	 * {@code http://schema.org/originAddress}.
	 * <p>
	 * Shipper's address.
	 *
	 * @see <a href="http://schema.org/originAddress">originAddress</a>
	 */
	public static final URI originAddress;

	/**
	 * Originates From
	 * <p>
	 * {@code http://schema.org/originatesFrom}.
	 * <p>
	 * The vasculature the lymphatic structure originates, or afferents,
	 * from.
	 *
	 * @see <a href="http://schema.org/originatesFrom">originatesFrom</a>
	 */
	public static final URI originatesFrom;

	/**
	 * Outcome
	 * <p>
	 * {@code http://schema.org/outcome}.
	 * <p>
	 * Expected or actual outcomes of the study.
	 *
	 * @see <a href="http://schema.org/outcome">outcome</a>
	 */
	public static final URI outcome;

	/**
	 * Outlet Store
	 * <p>
	 * {@code http://schema.org/OutletStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/OutletStore">OutletStore</a>
	 */
	public static final URI OutletStore;

	/**
	 * Overdosage
	 * <p>
	 * {@code http://schema.org/overdosage}.
	 * <p>
	 * Any information related to overdose on a drug, including signs or
	 * symptoms, treatments, contact information for emergency response.
	 *
	 * @see <a href="http://schema.org/overdosage">overdosage</a>
	 */
	public static final URI overdosage;

	/**
	 * Overview
	 * <p>
	 * {@code http://schema.org/overview}.
	 * <p>
	 * Descriptive information establishing the overarching theory/philosophy
	 * of the plan. May include the rationale for the name, the population
	 * where the plan first came to prominence, etc.
	 *
	 * @see <a href="http://schema.org/overview">overview</a>
	 */
	public static final URI overview;

	/**
	 * Owned From
	 * <p>
	 * {@code http://schema.org/ownedFrom}.
	 * <p>
	 * The date and time of obtaining the product.
	 *
	 * @see <a href="http://schema.org/ownedFrom">ownedFrom</a>
	 */
	public static final URI ownedFrom;

	/**
	 * Owned Through
	 * <p>
	 * {@code http://schema.org/ownedThrough}.
	 * <p>
	 * The date and time of giving up ownership on the product.
	 *
	 * @see <a href="http://schema.org/ownedThrough">ownedThrough</a>
	 */
	public static final URI ownedThrough;

	/**
	 * Ownership Info
	 * <p>
	 * {@code http://schema.org/OwnershipInfo}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/OwnershipInfo">OwnershipInfo</a>
	 */
	public static final URI OwnershipInfo;

	/**
	 * Owns
	 * <p>
	 * {@code http://schema.org/owns}.
	 * <p>
	 * Products owned by the organization or person.
	 *
	 * @see <a href="http://schema.org/owns">owns</a>
	 */
	public static final URI owns;

	/**
	 * Paint Action
	 * <p>
	 * {@code http://schema.org/PaintAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PaintAction">PaintAction</a>
	 */
	public static final URI PaintAction;

	/**
	 * Painting
	 * <p>
	 * {@code http://schema.org/Painting}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Painting">Painting</a>
	 */
	public static final URI Painting;

	/**
	 * Palliative Procedure
	 * <p>
	 * {@code http://schema.org/PalliativeProcedure}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PalliativeProcedure">PalliativeProcedure</a>
	 */
	public static final URI PalliativeProcedure;

	/**
	 * Parcel Delivery
	 * <p>
	 * {@code http://schema.org/ParcelDelivery}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ParcelDelivery">ParcelDelivery</a>
	 */
	public static final URI ParcelDelivery;

	/**
	 * Parcel Service
	 * <p>
	 * {@code http://schema.org/ParcelService}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ParcelService">ParcelService</a>
	 */
	public static final URI ParcelService;

	/**
	 * Parent
	 * <p>
	 * {@code http://schema.org/parent}.
	 * <p>
	 * A parent of this person.
	 *
	 * @see <a href="http://schema.org/parent">parent</a>
	 */
	public static final URI parent;

	/**
	 * Parent Audience
	 * <p>
	 * {@code http://schema.org/ParentAudience}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ParentAudience">ParentAudience</a>
	 */
	public static final URI ParentAudience;

	/**
	 * Parents
	 * <p>
	 * {@code http://schema.org/parents}.
	 * <p>
	 * A parents of the person (legacy spelling; see singular form, parent).
	 *
	 * @see <a href="http://schema.org/parents">parents</a>
	 */
	public static final URI parents;

	/**
	 * Parent Service
	 * <p>
	 * {@code http://schema.org/parentService}.
	 * <p>
	 * A broadcast service to which the broadcast service may belong to such
	 * as regional variations of a national channel.
	 *
	 * @see <a href="http://schema.org/parentService">parentService</a>
	 */
	public static final URI parentService;

	/**
	 * Park
	 * <p>
	 * {@code http://schema.org/Park}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Park">Park</a>
	 */
	public static final URI Park;

	/**
	 * Parking Facility
	 * <p>
	 * {@code http://schema.org/ParkingFacility}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ParkingFacility">ParkingFacility</a>
	 */
	public static final URI ParkingFacility;

	/**
	 * Participant
	 * <p>
	 * {@code http://schema.org/participant}.
	 * <p>
	 * Other co-agents that participated in the action indirectly. e.g. John
	 * wrote a book with *Steve*.
	 *
	 * @see <a href="http://schema.org/participant">participant</a>
	 */
	public static final URI participant;

	/**
	 * Part of Episode
	 * <p>
	 * {@code http://schema.org/partOfEpisode}.
	 * <p>
	 * The episode to which this clip belongs.
	 *
	 * @see <a href="http://schema.org/partOfEpisode">partOfEpisode</a>
	 */
	public static final URI partOfEpisode;

	/**
	 * Part of Order
	 * <p>
	 * {@code http://schema.org/partOfOrder}.
	 * <p>
	 * The overall order the items in this delivery were included in.
	 *
	 * @see <a href="http://schema.org/partOfOrder">partOfOrder</a>
	 */
	public static final URI partOfOrder;

	/**
	 * Part of Season
	 * <p>
	 * {@code http://schema.org/partOfSeason}.
	 * <p>
	 * The season to which this episode belongs.
	 *
	 * @see <a href="http://schema.org/partOfSeason">partOfSeason</a>
	 */
	public static final URI partOfSeason;

	/**
	 * Part of Series
	 * <p>
	 * {@code http://schema.org/partOfSeries}.
	 * <p>
	 * The series to which this episode or season belongs.
	 *
	 * @see <a href="http://schema.org/partOfSeries">partOfSeries</a>
	 */
	public static final URI partOfSeries;

	/**
	 * Part of System
	 * <p>
	 * {@code http://schema.org/partOfSystem}.
	 * <p>
	 * The anatomical or organ system that this structure is part of.
	 *
	 * @see <a href="http://schema.org/partOfSystem">partOfSystem</a>
	 */
	public static final URI partOfSystem;

	/**
	 * Part of TV Series
	 * <p>
	 * {@code http://schema.org/partOfTVSeries}.
	 * <p>
	 * The TV series to which this episode or season belongs. (legacy form;
	 * partOfSeries is preferred)
	 *
	 * @see <a href="http://schema.org/partOfTVSeries">partOfTVSeries</a>
	 */
	public static final URI partOfTVSeries;

	/**
	 * Pathology Test
	 * <p>
	 * {@code http://schema.org/PathologyTest}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PathologyTest">PathologyTest</a>
	 */
	public static final URI PathologyTest;

	/**
	 * Pathophysiology
	 * <p>
	 * {@code http://schema.org/pathophysiology}.
	 * <p>
	 * Changes in the normal mechanical, physical, and biochemical functions
	 * that are associated with this activity or condition.
	 *
	 * @see <a href="http://schema.org/pathophysiology">pathophysiology</a>
	 */
	public static final URI pathophysiology;

	/**
	 * Pawn Shop
	 * <p>
	 * {@code http://schema.org/PawnShop}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PawnShop">PawnShop</a>
	 */
	public static final URI PawnShop;

	/**
	 * Pay Action
	 * <p>
	 * {@code http://schema.org/PayAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PayAction">PayAction</a>
	 */
	public static final URI PayAction;

	/**
	 * Payment Accepted
	 * <p>
	 * {@code http://schema.org/paymentAccepted}.
	 * <p>
	 * Cash, credit card, etc.
	 *
	 * @see <a href="http://schema.org/paymentAccepted">paymentAccepted</a>
	 */
	public static final URI paymentAccepted;

	/**
	 * Payment Charge Specification
	 * <p>
	 * {@code http://schema.org/PaymentChargeSpecification}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PaymentChargeSpecification">PaymentChargeSpecification</a>
	 */
	public static final URI PaymentChargeSpecification;

	/**
	 * Payment Due
	 * <p>
	 * {@code http://schema.org/paymentDue}.
	 * <p>
	 * The date that payment is due.
	 *
	 * @see <a href="http://schema.org/paymentDue">paymentDue</a>
	 */
	public static final URI paymentDue;

	/**
	 * Payment Method
	 * <p>
	 * {@code http://schema.org/paymentMethod}.
	 * <p>
	 * The name of the credit card or other method of payment for the order.
	 *
	 * @see <a href="http://schema.org/paymentMethod">paymentMethod</a>
	 */
	public static final URI paymentMethod;

	/**
	 * Payment Method
	 * <p>
	 * {@code http://schema.org/PaymentMethod}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PaymentMethod">PaymentMethod</a>
	 */
	public static final URI PaymentMethod;

	/**
	 * Payment Method Id
	 * <p>
	 * {@code http://schema.org/paymentMethodId}.
	 * <p>
	 * An identifier for the method of payment used (e.g. the last 4 digits
	 * of the credit card).
	 *
	 * @see <a href="http://schema.org/paymentMethodId">paymentMethodId</a>
	 */
	public static final URI paymentMethodId;

	/**
	 * Payment Url
	 * <p>
	 * {@code http://schema.org/paymentUrl}.
	 * <p>
	 * The URL for sending a payment.
	 *
	 * @see <a href="http://schema.org/paymentUrl">paymentUrl</a>
	 */
	public static final URI paymentUrl;

	/**
	 * People Audience
	 * <p>
	 * {@code http://schema.org/PeopleAudience}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PeopleAudience">PeopleAudience</a>
	 */
	public static final URI PeopleAudience;

	/**
	 * Perform Action
	 * <p>
	 * {@code http://schema.org/PerformAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PerformAction">PerformAction</a>
	 */
	public static final URI PerformAction;

	/**
	 * Performer
	 * <p>
	 * {@code http://schema.org/performer}.
	 * <p>
	 * A performer at the event—for example, a presenter, musician, musical
	 * group or actor.
	 *
	 * @see <a href="http://schema.org/performer">performer</a>
	 */
	public static final URI performer;

	/**
	 * Performer in
	 * <p>
	 * {@code http://schema.org/performerIn}.
	 * <p>
	 * Event that this person is a performer or participant in.
	 *
	 * @see <a href="http://schema.org/performerIn">performerIn</a>
	 */
	public static final URI performerIn;

	/**
	 * Performers
	 * <p>
	 * {@code http://schema.org/performers}.
	 * <p>
	 * The main performer or performers of the event—for example, a
	 * presenter, musician, or actor (legacy spelling; see singular form,
	 * performer).
	 *
	 * @see <a href="http://schema.org/performers">performers</a>
	 */
	public static final URI performers;

	/**
	 * Performing Arts Theater
	 * <p>
	 * {@code http://schema.org/PerformingArtsTheater}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PerformingArtsTheater">PerformingArtsTheater</a>
	 */
	public static final URI PerformingArtsTheater;

	/**
	 * Performing Group
	 * <p>
	 * {@code http://schema.org/PerformingGroup}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PerformingGroup">PerformingGroup</a>
	 */
	public static final URI PerformingGroup;

	/**
	 * Permissions
	 * <p>
	 * {@code http://schema.org/permissions}.
	 * <p>
	 * Permission(s) required to run the app (for example, a mobile app may
	 * require full internet access or may run only on wifi).
	 *
	 * @see <a href="http://schema.org/permissions">permissions</a>
	 */
	public static final URI permissions;

	/**
	 * Permit
	 * <p>
	 * {@code http://schema.org/Permit}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Permit">Permit</a>
	 */
	public static final URI Permit;

	/**
	 * Permit Audience
	 * <p>
	 * {@code http://schema.org/permitAudience}.
	 * <p>
	 * The target audience for this permit.
	 *
	 * @see <a href="http://schema.org/permitAudience">permitAudience</a>
	 */
	public static final URI permitAudience;

	/**
	 * Person
	 * <p>
	 * {@code http://schema.org/Person}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Person">Person</a>
	 */
	public static final URI Person;

	/**
	 * Pet Store
	 * <p>
	 * {@code http://schema.org/PetStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PetStore">PetStore</a>
	 */
	public static final URI PetStore;

	/**
	 * Pharmacy
	 * <p>
	 * {@code http://schema.org/Pharmacy}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Pharmacy">Pharmacy</a>
	 */
	public static final URI Pharmacy;

	/**
	 * Phase
	 * <p>
	 * {@code http://schema.org/phase}.
	 * <p>
	 * The phase of the trial.
	 *
	 * @see <a href="http://schema.org/phase">phase</a>
	 */
	public static final URI phase;

	/**
	 * Photo
	 * <p>
	 * {@code http://schema.org/photo}.
	 * <p>
	 * A photograph of this place.
	 *
	 * @see <a href="http://schema.org/photo">photo</a>
	 */
	public static final URI photo;

	/**
	 * Photograph
	 * <p>
	 * {@code http://schema.org/Photograph}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Photograph">Photograph</a>
	 */
	public static final URI Photograph;

	/**
	 * Photograph Action
	 * <p>
	 * {@code http://schema.org/PhotographAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PhotographAction">PhotographAction</a>
	 */
	public static final URI PhotographAction;

	/**
	 * Photos
	 * <p>
	 * {@code http://schema.org/photos}.
	 * <p>
	 * Photographs of this place (legacy spelling; see singular form, photo).
	 *
	 * @see <a href="http://schema.org/photos">photos</a>
	 */
	public static final URI photos;

	/**
	 * Physical Activity
	 * <p>
	 * {@code http://schema.org/PhysicalActivity}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PhysicalActivity">PhysicalActivity</a>
	 */
	public static final URI PhysicalActivity;

	/**
	 * Physical Activity Category
	 * <p>
	 * {@code http://schema.org/PhysicalActivityCategory}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PhysicalActivityCategory">PhysicalActivityCategory</a>
	 */
	public static final URI PhysicalActivityCategory;

	/**
	 * Physical Exam
	 * <p>
	 * {@code http://schema.org/PhysicalExam}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PhysicalExam">PhysicalExam</a>
	 */
	public static final URI PhysicalExam;

	/**
	 * Physical Therapy
	 * <p>
	 * {@code http://schema.org/PhysicalTherapy}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PhysicalTherapy">PhysicalTherapy</a>
	 */
	public static final URI PhysicalTherapy;

	/**
	 * Physician
	 * <p>
	 * {@code http://schema.org/Physician}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Physician">Physician</a>
	 */
	public static final URI Physician;

	/**
	 * Physiological Benefits
	 * <p>
	 * {@code http://schema.org/physiologicalBenefits}.
	 * <p>
	 * Specific physiologic benefits associated to the plan.
	 *
	 * @see <a href="http://schema.org/physiologicalBenefits">physiologicalBenefits</a>
	 */
	public static final URI physiologicalBenefits;

	/**
	 * Place
	 * <p>
	 * {@code http://schema.org/Place}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Place">Place</a>
	 */
	public static final URI Place;

	/**
	 * Place of Worship
	 * <p>
	 * {@code http://schema.org/PlaceOfWorship}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PlaceOfWorship">PlaceOfWorship</a>
	 */
	public static final URI PlaceOfWorship;

	/**
	 * Plan Action
	 * <p>
	 * {@code http://schema.org/PlanAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PlanAction">PlanAction</a>
	 */
	public static final URI PlanAction;

	/**
	 * Play Action
	 * <p>
	 * {@code http://schema.org/PlayAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PlayAction">PlayAction</a>
	 */
	public static final URI PlayAction;

	/**
	 * Player Type
	 * <p>
	 * {@code http://schema.org/playerType}.
	 * <p>
	 * Player type required—for example, Flash or Silverlight.
	 *
	 * @see <a href="http://schema.org/playerType">playerType</a>
	 */
	public static final URI playerType;

	/**
	 * Playground
	 * <p>
	 * {@code http://schema.org/Playground}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Playground">Playground</a>
	 */
	public static final URI Playground;

	/**
	 * Plumber
	 * <p>
	 * {@code http://schema.org/Plumber}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Plumber">Plumber</a>
	 */
	public static final URI Plumber;

	/**
	 * Police Station
	 * <p>
	 * {@code http://schema.org/PoliceStation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PoliceStation">PoliceStation</a>
	 */
	public static final URI PoliceStation;

	/**
	 * Polygon
	 * <p>
	 * {@code http://schema.org/polygon}.
	 * <p>
	 * A polygon is the area enclosed by a point-to-point path for which the
	 * starting and ending points are the same. A polygon is expressed as a
	 * series of four or more spacedelimited points where the first and final
	 * points are identical.
	 *
	 * @see <a href="http://schema.org/polygon">polygon</a>
	 */
	public static final URI polygon;

	/**
	 * Pond
	 * <p>
	 * {@code http://schema.org/Pond}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Pond">Pond</a>
	 */
	public static final URI Pond;

	/**
	 * Population
	 * <p>
	 * {@code http://schema.org/population}.
	 * <p>
	 * Any characteristics of the population used in the study, e.g. 'males
	 * under 65'.
	 *
	 * @see <a href="http://schema.org/population">population</a>
	 */
	public static final URI population;

	/**
	 * Position
	 * <p>
	 * {@code http://schema.org/position}.
	 * <p>
	 * Free text to define other than pure numerical ranking of an episode or
	 * a season in an ordered list of items (further formatting restrictions
	 * may apply within particular user groups).
	 *
	 * @see <a href="http://schema.org/position">position</a>
	 */
	public static final URI position;

	/**
	 * Possible Complication
	 * <p>
	 * {@code http://schema.org/possibleComplication}.
	 * <p>
	 * A possible unexpected and unfavorable evolution of a medical
	 * condition. Complications may include worsening of the signs or
	 * symptoms of the disease, extension of the condition to other organ
	 * systems, etc.
	 *
	 * @see <a href="http://schema.org/possibleComplication">possibleComplication</a>
	 */
	public static final URI possibleComplication;

	/**
	 * Possible Treatment
	 * <p>
	 * {@code http://schema.org/possibleTreatment}.
	 * <p>
	 * A possible treatment to address this condition, sign or symptom.
	 *
	 * @see <a href="http://schema.org/possibleTreatment">possibleTreatment</a>
	 */
	public static final URI possibleTreatment;

	/**
	 * Postal Address
	 * <p>
	 * {@code http://schema.org/PostalAddress}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PostalAddress">PostalAddress</a>
	 */
	public static final URI PostalAddress;

	/**
	 * Postal Code
	 * <p>
	 * {@code http://schema.org/postalCode}.
	 * <p>
	 * The postal code. For example, 94043.
	 *
	 * @see <a href="http://schema.org/postalCode">postalCode</a>
	 */
	public static final URI postalCode;

	/**
	 * Post Office
	 * <p>
	 * {@code http://schema.org/PostOffice}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PostOffice">PostOffice</a>
	 */
	public static final URI PostOffice;

	/**
	 * Post Office Box Number
	 * <p>
	 * {@code http://schema.org/postOfficeBoxNumber}.
	 * <p>
	 * The post offce box number for PO box addresses.
	 *
	 * @see <a href="http://schema.org/postOfficeBoxNumber">postOfficeBoxNumber</a>
	 */
	public static final URI postOfficeBoxNumber;

	/**
	 * Post Op
	 * <p>
	 * {@code http://schema.org/postOp}.
	 * <p>
	 * A description of the postoperative procedures, care, and/or followups
	 * for this device.
	 *
	 * @see <a href="http://schema.org/postOp">postOp</a>
	 */
	public static final URI postOp;

	/**
	 * Predecessor of
	 * <p>
	 * {@code http://schema.org/predecessorOf}.
	 * <p>
	 * A pointer from a previous, often discontinued variant of the product
	 * to its newer variant.
	 *
	 * @see <a href="http://schema.org/predecessorOf">predecessorOf</a>
	 */
	public static final URI predecessorOf;

	/**
	 * Pregnancy Category
	 * <p>
	 * {@code http://schema.org/pregnancyCategory}.
	 * <p>
	 * Pregnancy category of this drug.
	 *
	 * @see <a href="http://schema.org/pregnancyCategory">pregnancyCategory</a>
	 */
	public static final URI pregnancyCategory;

	/**
	 * Pregnancy Warning
	 * <p>
	 * {@code http://schema.org/pregnancyWarning}.
	 * <p>
	 * Any precaution, guidance, contraindication, etc. related to this
	 * drug's use during pregnancy.
	 *
	 * @see <a href="http://schema.org/pregnancyWarning">pregnancyWarning</a>
	 */
	public static final URI pregnancyWarning;

	/**
	 * Pre Op
	 * <p>
	 * {@code http://schema.org/preOp}.
	 * <p>
	 * A description of the workup, testing, and other preparations required
	 * before implanting this device.
	 *
	 * @see <a href="http://schema.org/preOp">preOp</a>
	 */
	public static final URI preOp;

	/**
	 * Preparation
	 * <p>
	 * {@code http://schema.org/preparation}.
	 * <p>
	 * Typical preparation that a patient must undergo before having the
	 * procedure performed.
	 *
	 * @see <a href="http://schema.org/preparation">preparation</a>
	 */
	public static final URI preparation;

	/**
	 * Prepend Action
	 * <p>
	 * {@code http://schema.org/PrependAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PrependAction">PrependAction</a>
	 */
	public static final URI PrependAction;

	/**
	 * Prep Time
	 * <p>
	 * {@code http://schema.org/prepTime}.
	 * <p>
	 * The length of time it takes to prepare the recipe, in ISO 8601
	 * duration format.
	 *
	 * @see <a href="http://schema.org/prepTime">prepTime</a>
	 */
	public static final URI prepTime;

	/**
	 * Preschool
	 * <p>
	 * {@code http://schema.org/Preschool}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Preschool">Preschool</a>
	 */
	public static final URI Preschool;

	/**
	 * Prescribing Info
	 * <p>
	 * {@code http://schema.org/prescribingInfo}.
	 * <p>
	 * Link to prescribing information for the drug.
	 *
	 * @see <a href="http://schema.org/prescribingInfo">prescribingInfo</a>
	 */
	public static final URI prescribingInfo;

	/**
	 * Prescription Status
	 * <p>
	 * {@code http://schema.org/prescriptionStatus}.
	 * <p>
	 * Indicates whether this drug is available by prescription or
	 * over-the-counter.
	 *
	 * @see <a href="http://schema.org/prescriptionStatus">prescriptionStatus</a>
	 */
	public static final URI prescriptionStatus;

	/**
	 * Prevention Indication
	 * <p>
	 * {@code http://schema.org/PreventionIndication}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PreventionIndication">PreventionIndication</a>
	 */
	public static final URI PreventionIndication;

	/**
	 * Previous Start Date
	 * <p>
	 * {@code http://schema.org/previousStartDate}.
	 * <p>
	 * Used in conjunction with eventStatus for rescheduled or cancelled
	 * events. This property contains the previously scheduled start date.
	 * For rescheduled events, the startDate property should be used for the
	 * newly scheduled start date. In the (rare) case of an event that has
	 * been postponed and rescheduled multiple times, this field may be
	 * repeated.
	 *
	 * @see <a href="http://schema.org/previousStartDate">previousStartDate</a>
	 */
	public static final URI previousStartDate;

	/**
	 * Price
	 * <p>
	 * {@code http://schema.org/price}.
	 * <p>
	 * The offer price of a product, or of a price component when attached to
	 * PriceSpecification and its subtypes.
	 *
	 * @see <a href="http://schema.org/price">price</a>
	 */
	public static final URI price;

	/**
	 * Price Currency
	 * <p>
	 * {@code http://schema.org/priceCurrency}.
	 * <p>
	 * The currency (in 3-letter ISO 4217 format) of the offer price or a
	 * price component, when attached to PriceSpecification and its subtypes.
	 *
	 * @see <a href="http://schema.org/priceCurrency">priceCurrency</a>
	 */
	public static final URI priceCurrency;

	/**
	 * Price Range
	 * <p>
	 * {@code http://schema.org/priceRange}.
	 * <p>
	 * The price range of the business, for example $$$.
	 *
	 * @see <a href="http://schema.org/priceRange">priceRange</a>
	 */
	public static final URI priceRange;

	/**
	 * Price Specification
	 * <p>
	 * {@code http://schema.org/priceSpecification}.
	 * <p>
	 * One or more detailed price specifications, indicating the unit price
	 * and delivery or payment charges.
	 *
	 * @see <a href="http://schema.org/priceSpecification">priceSpecification</a>
	 */
	public static final URI priceSpecification;

	/**
	 * Price Specification
	 * <p>
	 * {@code http://schema.org/PriceSpecification}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PriceSpecification">PriceSpecification</a>
	 */
	public static final URI PriceSpecification;

	/**
	 * Price Type
	 * <p>
	 * {@code http://schema.org/priceType}.
	 * <p>
	 * A short text or acronym indicating multiple price specifications for
	 * the same offer, e.g. SRP for the suggested retail price or INVOICE for
	 * the invoice price, mostly used in the car industry.
	 *
	 * @see <a href="http://schema.org/priceType">priceType</a>
	 */
	public static final URI priceType;

	/**
	 * Price Valid Until
	 * <p>
	 * {@code http://schema.org/priceValidUntil}.
	 * <p>
	 * The date after which the price is no longer available.
	 *
	 * @see <a href="http://schema.org/priceValidUntil">priceValidUntil</a>
	 */
	public static final URI priceValidUntil;

	/**
	 * Primary Image of Page
	 * <p>
	 * {@code http://schema.org/primaryImageOfPage}.
	 * <p>
	 * Indicates the main image on the page
	 *
	 * @see <a href="http://schema.org/primaryImageOfPage">primaryImageOfPage</a>
	 */
	public static final URI primaryImageOfPage;

	/**
	 * Primary Prevention
	 * <p>
	 * {@code http://schema.org/primaryPrevention}.
	 * <p>
	 * A preventative therapy used to prevent an initial occurrence of the
	 * medical condition, such as vaccination.
	 *
	 * @see <a href="http://schema.org/primaryPrevention">primaryPrevention</a>
	 */
	public static final URI primaryPrevention;

	/**
	 * Print Column
	 * <p>
	 * {@code http://schema.org/printColumn}.
	 * <p>
	 * The number of the column in which the NewsArticle appears in the print
	 * edition.
	 *
	 * @see <a href="http://schema.org/printColumn">printColumn</a>
	 */
	public static final URI printColumn;

	/**
	 * Print Edition
	 * <p>
	 * {@code http://schema.org/printEdition}.
	 * <p>
	 * The edition of the print product in which the NewsArticle appears.
	 *
	 * @see <a href="http://schema.org/printEdition">printEdition</a>
	 */
	public static final URI printEdition;

	/**
	 * Print Page
	 * <p>
	 * {@code http://schema.org/printPage}.
	 * <p>
	 * If this NewsArticle appears in print, this field indicates the name of
	 * the page on which the article is found. Please note that this field is
	 * intended for the exact page name (e.g. A5, B18).
	 *
	 * @see <a href="http://schema.org/printPage">printPage</a>
	 */
	public static final URI printPage;

	/**
	 * Print Section
	 * <p>
	 * {@code http://schema.org/printSection}.
	 * <p>
	 * If this NewsArticle appears in print, this field indicates the print
	 * section in which the article appeared.
	 *
	 * @see <a href="http://schema.org/printSection">printSection</a>
	 */
	public static final URI printSection;

	/**
	 * Procedure
	 * <p>
	 * {@code http://schema.org/procedure}.
	 * <p>
	 * A description of the procedure involved in setting up, using, and/or
	 * installing the device.
	 *
	 * @see <a href="http://schema.org/procedure">procedure</a>
	 */
	public static final URI procedure;

	/**
	 * Procedure Type
	 * <p>
	 * {@code http://schema.org/procedureType}.
	 * <p>
	 * The type of procedure, for example Surgical, Noninvasive, or
	 * Percutaneous.
	 *
	 * @see <a href="http://schema.org/procedureType">procedureType</a>
	 */
	public static final URI procedureType;

	/**
	 * Processing Time
	 * <p>
	 * {@code http://schema.org/processingTime}.
	 * <p>
	 * Estimated processing time for the service using this channel.
	 *
	 * @see <a href="http://schema.org/processingTime">processingTime</a>
	 */
	public static final URI processingTime;

	/**
	 * Processor Requirements
	 * <p>
	 * {@code http://schema.org/processorRequirements}.
	 * <p>
	 * Processor architecture required to run the application (e.g. IA64).
	 *
	 * @see <a href="http://schema.org/processorRequirements">processorRequirements</a>
	 */
	public static final URI processorRequirements;

	/**
	 * Producer
	 * <p>
	 * {@code http://schema.org/producer}.
	 * <p>
	 * The producer of the movie, tv/radio series, season, or episode, or
	 * video.
	 *
	 * @see <a href="http://schema.org/producer">producer</a>
	 */
	public static final URI producer;

	/**
	 * Produces
	 * <p>
	 * {@code http://schema.org/produces}.
	 * <p>
	 * The tangible thing generated by the service, e.g. a passport, permit,
	 * etc.
	 *
	 * @see <a href="http://schema.org/produces">produces</a>
	 */
	public static final URI produces;

	/**
	 * Product
	 * <p>
	 * {@code http://schema.org/Product}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Product">Product</a>
	 */
	public static final URI Product;

	/**
	 * Product ID
	 * <p>
	 * {@code http://schema.org/productID}.
	 * <p>
	 * The product identifier, such as ISBN. For example: <meta
	 * itemprop='productID' content='isbn:123-456-789'/>.
	 *
	 * @see <a href="http://schema.org/productID">productID</a>
	 */
	public static final URI productID;

	/**
	 * Production Company
	 * <p>
	 * {@code http://schema.org/productionCompany}.
	 * <p>
	 * The production company or studio that made the movie, tv/radio series,
	 * season, or episode, or media object.
	 *
	 * @see <a href="http://schema.org/productionCompany">productionCompany</a>
	 */
	public static final URI productionCompany;

	/**
	 * Product Model
	 * <p>
	 * {@code http://schema.org/ProductModel}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ProductModel">ProductModel</a>
	 */
	public static final URI ProductModel;

	/**
	 * Product Supported
	 * <p>
	 * {@code http://schema.org/productSupported}.
	 * <p>
	 * The product or service this support contact point is related to (such
	 * as product support for a particular product line). This can be a
	 * specific product or product line (e.g. "iPhone") or a general category
	 * of products or services (e.g. "smartphones").
	 *
	 * @see <a href="http://schema.org/productSupported">productSupported</a>
	 */
	public static final URI productSupported;

	/**
	 * Professional Service
	 * <p>
	 * {@code http://schema.org/ProfessionalService}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ProfessionalService">ProfessionalService</a>
	 */
	public static final URI ProfessionalService;

	/**
	 * Proficiency Level
	 * <p>
	 * {@code http://schema.org/proficiencyLevel}.
	 * <p>
	 * Proficiency needed for this content; expected values: 'Beginner',
	 * 'Expert'.
	 *
	 * @see <a href="http://schema.org/proficiencyLevel">proficiencyLevel</a>
	 */
	public static final URI proficiencyLevel;

	/**
	 * Profile Page
	 * <p>
	 * {@code http://schema.org/ProfilePage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ProfilePage">ProfilePage</a>
	 */
	public static final URI ProfilePage;

	/**
	 * Programming Language
	 * <p>
	 * {@code http://schema.org/programmingLanguage}.
	 * <p>
	 * The computer programming language.
	 *
	 * @see <a href="http://schema.org/programmingLanguage">programmingLanguage</a>
	 */
	public static final URI programmingLanguage;

	/**
	 * Programming Model
	 * <p>
	 * {@code http://schema.org/programmingModel}.
	 * <p>
	 * Indicates whether API is managed or unmanaged.
	 *
	 * @see <a href="http://schema.org/programmingModel">programmingModel</a>
	 */
	public static final URI programmingModel;

	/**
	 * Property
	 * <p>
	 * {@code http://schema.org/Property}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Property">Property</a>
	 */
	public static final URI Property;

	/**
	 * Proprietary Name
	 * <p>
	 * {@code http://schema.org/proprietaryName}.
	 * <p>
	 * Proprietary name given to the diet plan, typically by its originator
	 * or creator.
	 *
	 * @see <a href="http://schema.org/proprietaryName">proprietaryName</a>
	 */
	public static final URI proprietaryName;

	/**
	 * Protein Content
	 * <p>
	 * {@code http://schema.org/proteinContent}.
	 * <p>
	 * The number of grams of protein.
	 *
	 * @see <a href="http://schema.org/proteinContent">proteinContent</a>
	 */
	public static final URI proteinContent;

	/**
	 * Provider
	 * <p>
	 * {@code http://schema.org/provider}.
	 * <p>
	 * The organization or agency that is providing the service.
	 *
	 * @see <a href="http://schema.org/provider">provider</a>
	 */
	public static final URI provider;

	/**
	 * Provides Service
	 * <p>
	 * {@code http://schema.org/providesService}.
	 * <p>
	 * The service provided by this channel.
	 *
	 * @see <a href="http://schema.org/providesService">providesService</a>
	 */
	public static final URI providesService;

	/**
	 * Psychological Treatment
	 * <p>
	 * {@code http://schema.org/PsychologicalTreatment}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PsychologicalTreatment">PsychologicalTreatment</a>
	 */
	public static final URI PsychologicalTreatment;

	/**
	 * Publication
	 * <p>
	 * {@code http://schema.org/publication}.
	 * <p>
	 * A publication event associated with the episode, clip or media object.
	 *
	 * @see <a href="http://schema.org/publication">publication</a>
	 */
	public static final URI publication;

	/**
	 * Publication Event
	 * <p>
	 * {@code http://schema.org/PublicationEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PublicationEvent">PublicationEvent</a>
	 */
	public static final URI PublicationEvent;

	/**
	 * Publication Type
	 * <p>
	 * {@code http://schema.org/publicationType}.
	 * <p>
	 * The type of the medical article, taken from the US NLM MeSH
	 * publication type catalog.
	 *
	 * @see <a href="http://schema.org/publicationType">publicationType</a>
	 */
	public static final URI publicationType;

	/**
	 * Public Swimming Pool
	 * <p>
	 * {@code http://schema.org/PublicSwimmingPool}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/PublicSwimmingPool">PublicSwimmingPool</a>
	 */
	public static final URI PublicSwimmingPool;

	/**
	 * Published On
	 * <p>
	 * {@code http://schema.org/publishedOn}.
	 * <p>
	 * A broadcast service associated with the publication event
	 *
	 * @see <a href="http://schema.org/publishedOn">publishedOn</a>
	 */
	public static final URI publishedOn;

	/**
	 * Publisher
	 * <p>
	 * {@code http://schema.org/publisher}.
	 * <p>
	 * The publisher of the creative work.
	 *
	 * @see <a href="http://schema.org/publisher">publisher</a>
	 */
	public static final URI publisher;

	/**
	 * Publishing Principles
	 * <p>
	 * {@code http://schema.org/publishingPrinciples}.
	 * <p>
	 * Link to page describing the editorial principles of the organization
	 * primarily responsible for the creation of the CreativeWork.
	 *
	 * @see <a href="http://schema.org/publishingPrinciples">publishingPrinciples</a>
	 */
	public static final URI publishingPrinciples;

	/**
	 * Purpose
	 * <p>
	 * {@code http://schema.org/purpose}.
	 * <p>
	 * A goal towards an action is taken. Can be concrete or abstract.
	 *
	 * @see <a href="http://schema.org/purpose">purpose</a>
	 */
	public static final URI purpose;

	/**
	 * Qualifications
	 * <p>
	 * {@code http://schema.org/qualifications}.
	 * <p>
	 * Specific qualifications required for this role.
	 *
	 * @see <a href="http://schema.org/qualifications">qualifications</a>
	 */
	public static final URI qualifications;

	/**
	 * Qualitative Value
	 * <p>
	 * {@code http://schema.org/QualitativeValue}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/QualitativeValue">QualitativeValue</a>
	 */
	public static final URI QualitativeValue;

	/**
	 * Quantitative Value
	 * <p>
	 * {@code http://schema.org/QuantitativeValue}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/QuantitativeValue">QuantitativeValue</a>
	 */
	public static final URI QuantitativeValue;

	/**
	 * Quantity
	 * <p>
	 * {@code http://schema.org/Quantity}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Quantity">Quantity</a>
	 */
	public static final URI Quantity;

	/**
	 * Query
	 * <p>
	 * {@code http://schema.org/query}.
	 * <p>
	 * A sub property of instrument. The query used on this action.
	 *
	 * @see <a href="http://schema.org/query">query</a>
	 */
	public static final URI query;

	/**
	 * Question
	 * <p>
	 * {@code http://schema.org/question}.
	 * <p>
	 * A sub property of object. A question.
	 *
	 * @see <a href="http://schema.org/question">question</a>
	 */
	public static final URI question;

	/**
	 * Quote Action
	 * <p>
	 * {@code http://schema.org/QuoteAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/QuoteAction">QuoteAction</a>
	 */
	public static final URI QuoteAction;

	/**
	 * Radiation Therapy
	 * <p>
	 * {@code http://schema.org/RadiationTherapy}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RadiationTherapy">RadiationTherapy</a>
	 */
	public static final URI RadiationTherapy;

	/**
	 * Radio Clip
	 * <p>
	 * {@code http://schema.org/RadioClip}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RadioClip">RadioClip</a>
	 */
	public static final URI RadioClip;

	/**
	 * Radio Episode
	 * <p>
	 * {@code http://schema.org/RadioEpisode}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RadioEpisode">RadioEpisode</a>
	 */
	public static final URI RadioEpisode;

	/**
	 * Radio Season
	 * <p>
	 * {@code http://schema.org/RadioSeason}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RadioSeason">RadioSeason</a>
	 */
	public static final URI RadioSeason;

	/**
	 * Radio Series
	 * <p>
	 * {@code http://schema.org/RadioSeries}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RadioSeries">RadioSeries</a>
	 */
	public static final URI RadioSeries;

	/**
	 * Radio Station
	 * <p>
	 * {@code http://schema.org/RadioStation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RadioStation">RadioStation</a>
	 */
	public static final URI RadioStation;

	/**
	 * Range Includes
	 * <p>
	 * {@code http://schema.org/rangeIncludes}.
	 * <p>
	 * Relates a property to a class that constitutes (one of) the expected
	 * type(s) for values of the property.
	 *
	 * @see <a href="http://schema.org/rangeIncludes">rangeIncludes</a>
	 */
	public static final URI rangeIncludes;

	/**
	 * Rating
	 * <p>
	 * {@code http://schema.org/Rating}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Rating">Rating</a>
	 */
	public static final URI Rating;

	/**
	 * Rating Count
	 * <p>
	 * {@code http://schema.org/ratingCount}.
	 * <p>
	 * The count of total number of ratings.
	 *
	 * @see <a href="http://schema.org/ratingCount">ratingCount</a>
	 */
	public static final URI ratingCount;

	/**
	 * Rating Value
	 * <p>
	 * {@code http://schema.org/ratingValue}.
	 * <p>
	 * The rating for the content.
	 *
	 * @see <a href="http://schema.org/ratingValue">ratingValue</a>
	 */
	public static final URI ratingValue;

	/**
	 * React Action
	 * <p>
	 * {@code http://schema.org/ReactAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ReactAction">ReactAction</a>
	 */
	public static final URI ReactAction;

	/**
	 * Read Action
	 * <p>
	 * {@code http://schema.org/ReadAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ReadAction">ReadAction</a>
	 */
	public static final URI ReadAction;

	/**
	 * Real Estate Agent
	 * <p>
	 * {@code http://schema.org/RealEstateAgent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RealEstateAgent">RealEstateAgent</a>
	 */
	public static final URI RealEstateAgent;

	/**
	 * Real Estate Agent
	 * <p>
	 * {@code http://schema.org/realEstateAgent}.
	 * <p>
	 * A sub property of participant. The real estate agent involved in the
	 * action.
	 *
	 * @see <a href="http://schema.org/realEstateAgent">realEstateAgent</a>
	 */
	public static final URI realEstateAgent;

	/**
	 * Receive Action
	 * <p>
	 * {@code http://schema.org/ReceiveAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ReceiveAction">ReceiveAction</a>
	 */
	public static final URI ReceiveAction;

	/**
	 * Recipe
	 * <p>
	 * {@code http://schema.org/Recipe}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Recipe">Recipe</a>
	 */
	public static final URI Recipe;

	/**
	 * Recipe
	 * <p>
	 * {@code http://schema.org/recipe}.
	 * <p>
	 * A sub property of instrument. The recipe/instructions used to perform
	 * the action.
	 *
	 * @see <a href="http://schema.org/recipe">recipe</a>
	 */
	public static final URI recipe;

	/**
	 * Recipe Category
	 * <p>
	 * {@code http://schema.org/recipeCategory}.
	 * <p>
	 * The category of the recipe—for example, appetizer, entree, etc.
	 *
	 * @see <a href="http://schema.org/recipeCategory">recipeCategory</a>
	 */
	public static final URI recipeCategory;

	/**
	 * Recipe Cuisine
	 * <p>
	 * {@code http://schema.org/recipeCuisine}.
	 * <p>
	 * The cuisine of the recipe (for example, French or Ethopian).
	 *
	 * @see <a href="http://schema.org/recipeCuisine">recipeCuisine</a>
	 */
	public static final URI recipeCuisine;

	/**
	 * Recipe Instructions
	 * <p>
	 * {@code http://schema.org/recipeInstructions}.
	 * <p>
	 * The steps to make the dish.
	 *
	 * @see <a href="http://schema.org/recipeInstructions">recipeInstructions</a>
	 */
	public static final URI recipeInstructions;

	/**
	 * Recipe Yield
	 * <p>
	 * {@code http://schema.org/recipeYield}.
	 * <p>
	 * The quantity produced by the recipe (for example, number of people
	 * served, number of servings, etc).
	 *
	 * @see <a href="http://schema.org/recipeYield">recipeYield</a>
	 */
	public static final URI recipeYield;

	/**
	 * Recipient
	 * <p>
	 * {@code http://schema.org/recipient}.
	 * <p>
	 * A sub property of participant. The participant who is at the receiving
	 * end of the action.
	 *
	 * @see <a href="http://schema.org/recipient">recipient</a>
	 */
	public static final URI recipient;

	/**
	 * Recognizing Authority
	 * <p>
	 * {@code http://schema.org/recognizingAuthority}.
	 * <p>
	 * If applicable, the organization that officially recognizes this entity
	 * as part of its endorsed system of medicine.
	 *
	 * @see <a href="http://schema.org/recognizingAuthority">recognizingAuthority</a>
	 */
	public static final URI recognizingAuthority;

	/**
	 * Recommendation Strength
	 * <p>
	 * {@code http://schema.org/recommendationStrength}.
	 * <p>
	 * Strength of the guideline's recommendation (e.g. 'class I').
	 *
	 * @see <a href="http://schema.org/recommendationStrength">recommendationStrength</a>
	 */
	public static final URI recommendationStrength;

	/**
	 * Recommended Dose Schedule
	 * <p>
	 * {@code http://schema.org/RecommendedDoseSchedule}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RecommendedDoseSchedule">RecommendedDoseSchedule</a>
	 */
	public static final URI RecommendedDoseSchedule;

	/**
	 * Recommended Intake
	 * <p>
	 * {@code http://schema.org/recommendedIntake}.
	 * <p>
	 * Recommended intake of this supplement for a given population as
	 * defined by a specific recommending authority.
	 *
	 * @see <a href="http://schema.org/recommendedIntake">recommendedIntake</a>
	 */
	public static final URI recommendedIntake;

	/**
	 * Recycling Center
	 * <p>
	 * {@code http://schema.org/RecyclingCenter}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RecyclingCenter">RecyclingCenter</a>
	 */
	public static final URI RecyclingCenter;

	/**
	 * Region Drained
	 * <p>
	 * {@code http://schema.org/regionDrained}.
	 * <p>
	 * The anatomical or organ system drained by this vessel; generally
	 * refers to a specific part of an organ.
	 *
	 * @see <a href="http://schema.org/regionDrained">regionDrained</a>
	 */
	public static final URI regionDrained;

	/**
	 * Regions Allowed
	 * <p>
	 * {@code http://schema.org/regionsAllowed}.
	 * <p>
	 * The regions where the media is allowed. If not specified, then it's
	 * assumed to be allowed everywhere. Specify the countries in ISO 3166
	 * format.
	 *
	 * @see <a href="http://schema.org/regionsAllowed">regionsAllowed</a>
	 */
	public static final URI regionsAllowed;

	/**
	 * Register Action
	 * <p>
	 * {@code http://schema.org/RegisterAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RegisterAction">RegisterAction</a>
	 */
	public static final URI RegisterAction;

	/**
	 * Reject Action
	 * <p>
	 * {@code http://schema.org/RejectAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RejectAction">RejectAction</a>
	 */
	public static final URI RejectAction;

	/**
	 * Related Anatomy
	 * <p>
	 * {@code http://schema.org/relatedAnatomy}.
	 * <p>
	 * Anatomical systems or structures that relate to the superficial
	 * anatomy.
	 *
	 * @see <a href="http://schema.org/relatedAnatomy">relatedAnatomy</a>
	 */
	public static final URI relatedAnatomy;

	/**
	 * Related Condition
	 * <p>
	 * {@code http://schema.org/relatedCondition}.
	 * <p>
	 * A medical condition associated with this anatomy.
	 *
	 * @see <a href="http://schema.org/relatedCondition">relatedCondition</a>
	 */
	public static final URI relatedCondition;

	/**
	 * Related Drug
	 * <p>
	 * {@code http://schema.org/relatedDrug}.
	 * <p>
	 * Any other drug related to this one, for example commonly-prescribed
	 * alternatives.
	 *
	 * @see <a href="http://schema.org/relatedDrug">relatedDrug</a>
	 */
	public static final URI relatedDrug;

	/**
	 * Related Link
	 * <p>
	 * {@code http://schema.org/relatedLink}.
	 * <p>
	 * A link related to this web page, for example to other related web
	 * pages.
	 *
	 * @see <a href="http://schema.org/relatedLink">relatedLink</a>
	 */
	public static final URI relatedLink;

	/**
	 * Related Structure
	 * <p>
	 * {@code http://schema.org/relatedStructure}.
	 * <p>
	 * Related anatomical structure(s) that are not part of the system but
	 * relate or connect to it, such as vascular bundles associated with an
	 * organ system.
	 *
	 * @see <a href="http://schema.org/relatedStructure">relatedStructure</a>
	 */
	public static final URI relatedStructure;

	/**
	 * Related Therapy
	 * <p>
	 * {@code http://schema.org/relatedTherapy}.
	 * <p>
	 * A medical therapy related to this anatomy.
	 *
	 * @see <a href="http://schema.org/relatedTherapy">relatedTherapy</a>
	 */
	public static final URI relatedTherapy;

	/**
	 * Related to
	 * <p>
	 * {@code http://schema.org/relatedTo}.
	 * <p>
	 * The most generic familial relation.
	 *
	 * @see <a href="http://schema.org/relatedTo">relatedTo</a>
	 */
	public static final URI relatedTo;

	/**
	 * Release Date
	 * <p>
	 * {@code http://schema.org/releaseDate}.
	 * <p>
	 * The release date of a product or product model. This can be used to
	 * distinguish the exact variant of a product.
	 *
	 * @see <a href="http://schema.org/releaseDate">releaseDate</a>
	 */
	public static final URI releaseDate;

	/**
	 * Release Notes
	 * <p>
	 * {@code http://schema.org/releaseNotes}.
	 * <p>
	 * Description of what changed in this version.
	 *
	 * @see <a href="http://schema.org/releaseNotes">releaseNotes</a>
	 */
	public static final URI releaseNotes;

	/**
	 * Relevant Specialty
	 * <p>
	 * {@code http://schema.org/relevantSpecialty}.
	 * <p>
	 * If applicable, a medical specialty in which this entity is relevant.
	 *
	 * @see <a href="http://schema.org/relevantSpecialty">relevantSpecialty</a>
	 */
	public static final URI relevantSpecialty;

	/**
	 * Rent Action
	 * <p>
	 * {@code http://schema.org/RentAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RentAction">RentAction</a>
	 */
	public static final URI RentAction;

	/**
	 * Repetitions
	 * <p>
	 * {@code http://schema.org/repetitions}.
	 * <p>
	 * Number of times one should repeat the activity.
	 *
	 * @see <a href="http://schema.org/repetitions">repetitions</a>
	 */
	public static final URI repetitions;

	/**
	 * Replace Action
	 * <p>
	 * {@code http://schema.org/ReplaceAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ReplaceAction">ReplaceAction</a>
	 */
	public static final URI ReplaceAction;

	/**
	 * Replacee
	 * <p>
	 * {@code http://schema.org/replacee}.
	 * <p>
	 * A sub property of object. The object that is being replaced.
	 *
	 * @see <a href="http://schema.org/replacee">replacee</a>
	 */
	public static final URI replacee;

	/**
	 * Replacer
	 * <p>
	 * {@code http://schema.org/replacer}.
	 * <p>
	 * A sub property of object. The object that replaces.
	 *
	 * @see <a href="http://schema.org/replacer">replacer</a>
	 */
	public static final URI replacer;

	/**
	 * Reply Action
	 * <p>
	 * {@code http://schema.org/ReplyAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ReplyAction">ReplyAction</a>
	 */
	public static final URI ReplyAction;

	/**
	 * Reply to Url
	 * <p>
	 * {@code http://schema.org/replyToUrl}.
	 * <p>
	 * The URL at which a reply may be posted to the specified UserComment.
	 *
	 * @see <a href="http://schema.org/replyToUrl">replyToUrl</a>
	 */
	public static final URI replyToUrl;

	/**
	 * Reported Dose Schedule
	 * <p>
	 * {@code http://schema.org/ReportedDoseSchedule}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ReportedDoseSchedule">ReportedDoseSchedule</a>
	 */
	public static final URI ReportedDoseSchedule;

	/**
	 * Representative of Page
	 * <p>
	 * {@code http://schema.org/representativeOfPage}.
	 * <p>
	 * Indicates whether this image is representative of the content of the
	 * page.
	 *
	 * @see <a href="http://schema.org/representativeOfPage">representativeOfPage</a>
	 */
	public static final URI representativeOfPage;

	/**
	 * Required Gender
	 * <p>
	 * {@code http://schema.org/requiredGender}.
	 * <p>
	 * Audiences defined by a person's gender.
	 *
	 * @see <a href="http://schema.org/requiredGender">requiredGender</a>
	 */
	public static final URI requiredGender;

	/**
	 * Required Max Age
	 * <p>
	 * {@code http://schema.org/requiredMaxAge}.
	 * <p>
	 * Audiences defined by a person's maximum age.
	 *
	 * @see <a href="http://schema.org/requiredMaxAge">requiredMaxAge</a>
	 */
	public static final URI requiredMaxAge;

	/**
	 * Required Min Age
	 * <p>
	 * {@code http://schema.org/requiredMinAge}.
	 * <p>
	 * Audiences defined by a person's minimum age.
	 *
	 * @see <a href="http://schema.org/requiredMinAge">requiredMinAge</a>
	 */
	public static final URI requiredMinAge;

	/**
	 * Requirements
	 * <p>
	 * {@code http://schema.org/requirements}.
	 * <p>
	 * Component dependency requirements for application. This includes
	 * runtime environments and shared libraries that are not included in the
	 * application distribution package, but required to run the application
	 * (Examples: DirectX, Java or .NET runtime).
	 *
	 * @see <a href="http://schema.org/requirements">requirements</a>
	 */
	public static final URI requirements;

	/**
	 * Requires Subscription
	 * <p>
	 * {@code http://schema.org/requiresSubscription}.
	 * <p>
	 * Indicates if use of the media require a subscription (either paid or
	 * free). Allowed values are true or false (note that an earlier version
	 * had 'yes', 'no').
	 *
	 * @see <a href="http://schema.org/requiresSubscription">requiresSubscription</a>
	 */
	public static final URI requiresSubscription;

	/**
	 * Reserve Action
	 * <p>
	 * {@code http://schema.org/ReserveAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ReserveAction">ReserveAction</a>
	 */
	public static final URI ReserveAction;

	/**
	 * Reservoir
	 * <p>
	 * {@code http://schema.org/Reservoir}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Reservoir">Reservoir</a>
	 */
	public static final URI Reservoir;

	/**
	 * Residence
	 * <p>
	 * {@code http://schema.org/Residence}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Residence">Residence</a>
	 */
	public static final URI Residence;

	/**
	 * Responsibilities
	 * <p>
	 * {@code http://schema.org/responsibilities}.
	 * <p>
	 * Responsibilities associated with this role.
	 *
	 * @see <a href="http://schema.org/responsibilities">responsibilities</a>
	 */
	public static final URI responsibilities;

	/**
	 * Restaurant
	 * <p>
	 * {@code http://schema.org/Restaurant}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Restaurant">Restaurant</a>
	 */
	public static final URI Restaurant;

	/**
	 * Rest Periods
	 * <p>
	 * {@code http://schema.org/restPeriods}.
	 * <p>
	 * How often one should break from the activity.
	 *
	 * @see <a href="http://schema.org/restPeriods">restPeriods</a>
	 */
	public static final URI restPeriods;

	/**
	 * Result
	 * <p>
	 * {@code http://schema.org/result}.
	 * <p>
	 * The result produced in the action. e.g. John wrote *a book*.
	 *
	 * @see <a href="http://schema.org/result">result</a>
	 */
	public static final URI result;

	/**
	 * Result Review
	 * <p>
	 * {@code http://schema.org/resultReview}.
	 * <p>
	 * A sub property of result. The review that resulted in the performing
	 * of the action.
	 *
	 * @see <a href="http://schema.org/resultReview">resultReview</a>
	 */
	public static final URI resultReview;

	/**
	 * Return Action
	 * <p>
	 * {@code http://schema.org/ReturnAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ReturnAction">ReturnAction</a>
	 */
	public static final URI ReturnAction;

	/**
	 * Review
	 * <p>
	 * {@code http://schema.org/Review}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Review">Review</a>
	 */
	public static final URI Review;

	/**
	 * Review
	 * <p>
	 * {@code http://schema.org/review}.
	 * <p>
	 * A review of the item.
	 *
	 * @see <a href="http://schema.org/review">review</a>
	 */
	public static final URI review;

	/**
	 * Review Action
	 * <p>
	 * {@code http://schema.org/ReviewAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ReviewAction">ReviewAction</a>
	 */
	public static final URI ReviewAction;

	/**
	 * Review Body
	 * <p>
	 * {@code http://schema.org/reviewBody}.
	 * <p>
	 * The actual body of the review
	 *
	 * @see <a href="http://schema.org/reviewBody">reviewBody</a>
	 */
	public static final URI reviewBody;

	/**
	 * Review Count
	 * <p>
	 * {@code http://schema.org/reviewCount}.
	 * <p>
	 * The count of total number of reviews.
	 *
	 * @see <a href="http://schema.org/reviewCount">reviewCount</a>
	 */
	public static final URI reviewCount;

	/**
	 * Reviewed by
	 * <p>
	 * {@code http://schema.org/reviewedBy}.
	 * <p>
	 * People or organizations that have reviewed the content on this web
	 * page for accuracy and/or completeness.
	 *
	 * @see <a href="http://schema.org/reviewedBy">reviewedBy</a>
	 */
	public static final URI reviewedBy;

	/**
	 * Review Rating
	 * <p>
	 * {@code http://schema.org/reviewRating}.
	 * <p>
	 * The rating given in this review. Note that reviews can themselves be
	 * rated. The reviewRating applies to rating given by the review. The
	 * aggregateRating property applies to the review itself, as a creative
	 * work.
	 *
	 * @see <a href="http://schema.org/reviewRating">reviewRating</a>
	 */
	public static final URI reviewRating;

	/**
	 * Reviews
	 * <p>
	 * {@code http://schema.org/reviews}.
	 * <p>
	 * Review of the item (legacy spelling; see singular form, review).
	 *
	 * @see <a href="http://schema.org/reviews">reviews</a>
	 */
	public static final URI reviews;

	/**
	 * Risk Factor
	 * <p>
	 * {@code http://schema.org/riskFactor}.
	 * <p>
	 * A modifiable or non-modifiable factor that increases the risk of a
	 * patient contracting this condition, e.g. age, coexisting condition.
	 *
	 * @see <a href="http://schema.org/riskFactor">riskFactor</a>
	 */
	public static final URI riskFactor;

	/**
	 * Risks
	 * <p>
	 * {@code http://schema.org/risks}.
	 * <p>
	 * Specific physiologic risks associated to the plan.
	 *
	 * @see <a href="http://schema.org/risks">risks</a>
	 */
	public static final URI risks;

	/**
	 * River Body of Water
	 * <p>
	 * {@code http://schema.org/RiverBodyOfWater}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RiverBodyOfWater">RiverBodyOfWater</a>
	 */
	public static final URI RiverBodyOfWater;

	/**
	 * Roofing Contractor
	 * <p>
	 * {@code http://schema.org/RoofingContractor}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RoofingContractor">RoofingContractor</a>
	 */
	public static final URI RoofingContractor;

	/**
	 * Rsvp Action
	 * <p>
	 * {@code http://schema.org/RsvpAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RsvpAction">RsvpAction</a>
	 */
	public static final URI RsvpAction;

	/**
	 * Runs to
	 * <p>
	 * {@code http://schema.org/runsTo}.
	 * <p>
	 * The vasculature the lymphatic structure runs, or efferents, to.
	 *
	 * @see <a href="http://schema.org/runsTo">runsTo</a>
	 */
	public static final URI runsTo;

	/**
	 * Runtime
	 * <p>
	 * {@code http://schema.org/runtime}.
	 * <p>
	 * Runtime platform or script interpreter dependencies (Example - Java
	 * v1, Python2.3, .Net Framework 3.0)
	 *
	 * @see <a href="http://schema.org/runtime">runtime</a>
	 */
	public static final URI runtime;

	/**
	 * RV Park
	 * <p>
	 * {@code http://schema.org/RVPark}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/RVPark">RVPark</a>
	 */
	public static final URI RVPark;

	/**
	 * Safety Consideration
	 * <p>
	 * {@code http://schema.org/safetyConsideration}.
	 * <p>
	 * Any potential safety concern associated with the supplement. May
	 * include interactions with other drugs and foods, pregnancy,
	 * breastfeeding, known adverse reactions, and documented efficacy of the
	 * supplement.
	 *
	 * @see <a href="http://schema.org/safetyConsideration">safetyConsideration</a>
	 */
	public static final URI safetyConsideration;

	/**
	 * Salary Currency
	 * <p>
	 * {@code http://schema.org/salaryCurrency}.
	 * <p>
	 * The currency (coded using ISO 4217,
	 * http://en.wikipedia.org/wiki/ISO_4217 used for the main salary
	 * information in this job posting.
	 *
	 * @see <a href="http://schema.org/salaryCurrency">salaryCurrency</a>
	 */
	public static final URI salaryCurrency;

	/**
	 * Sale Event
	 * <p>
	 * {@code http://schema.org/SaleEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SaleEvent">SaleEvent</a>
	 */
	public static final URI SaleEvent;

	/**
	 * Same As
	 * <p>
	 * {@code http://schema.org/sameAs}.
	 * <p>
	 * URL of a reference Web page that unambiguously indicates the item's
	 * identity. E.g. the URL of the item's Wikipedia page, Freebase page, or
	 * official website.
	 *
	 * @see <a href="http://schema.org/sameAs">sameAs</a>
	 */
	public static final URI sameAs;

	/**
	 * Sample Type
	 * <p>
	 * {@code http://schema.org/sampleType}.
	 * <p>
	 * Full (compile ready) solution, code snippet, inline code, scripts,
	 * template.
	 *
	 * @see <a href="http://schema.org/sampleType">sampleType</a>
	 */
	public static final URI sampleType;

	/**
	 * Saturated Fat Content
	 * <p>
	 * {@code http://schema.org/saturatedFatContent}.
	 * <p>
	 * The number of grams of saturated fat.
	 *
	 * @see <a href="http://schema.org/saturatedFatContent">saturatedFatContent</a>
	 */
	public static final URI saturatedFatContent;

	/**
	 * Schedule Action
	 * <p>
	 * {@code http://schema.org/ScheduleAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ScheduleAction">ScheduleAction</a>
	 */
	public static final URI ScheduleAction;

	/**
	 * Scheduled Time
	 * <p>
	 * {@code http://schema.org/scheduledTime}.
	 * <p>
	 * The time the object is scheduled to.
	 *
	 * @see <a href="http://schema.org/scheduledTime">scheduledTime</a>
	 */
	public static final URI scheduledTime;

	/**
	 * Scholarly Article
	 * <p>
	 * {@code http://schema.org/ScholarlyArticle}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ScholarlyArticle">ScholarlyArticle</a>
	 */
	public static final URI ScholarlyArticle;

	/**
	 * School
	 * <p>
	 * {@code http://schema.org/School}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/School">School</a>
	 */
	public static final URI School;

	/**
	 * Screenshot
	 * <p>
	 * {@code http://schema.org/screenshot}.
	 * <p>
	 * A link to a screenshot image of the app.
	 *
	 * @see <a href="http://schema.org/screenshot">screenshot</a>
	 */
	public static final URI screenshot;

	/**
	 * Sculpture
	 * <p>
	 * {@code http://schema.org/Sculpture}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Sculpture">Sculpture</a>
	 */
	public static final URI Sculpture;

	/**
	 * Sea Body of Water
	 * <p>
	 * {@code http://schema.org/SeaBodyOfWater}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SeaBodyOfWater">SeaBodyOfWater</a>
	 */
	public static final URI SeaBodyOfWater;

	/**
	 * Search Action
	 * <p>
	 * {@code http://schema.org/SearchAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SearchAction">SearchAction</a>
	 */
	public static final URI SearchAction;

	/**
	 * Search Results Page
	 * <p>
	 * {@code http://schema.org/SearchResultsPage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SearchResultsPage">SearchResultsPage</a>
	 */
	public static final URI SearchResultsPage;

	/**
	 * Season
	 * <p>
	 * {@code http://schema.org/season}.
	 * <p>
	 * A season in a tv/radio series.
	 *
	 * @see <a href="http://schema.org/season">season</a>
	 */
	public static final URI season;

	/**
	 * Season
	 * <p>
	 * {@code http://schema.org/Season}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Season">Season</a>
	 */
	public static final URI Season;

	/**
	 * Season Number
	 * <p>
	 * {@code http://schema.org/seasonNumber}.
	 * <p>
	 * Position of the season within an ordered group of seasons.
	 *
	 * @see <a href="http://schema.org/seasonNumber">seasonNumber</a>
	 */
	public static final URI seasonNumber;

	/**
	 * Seasons
	 * <p>
	 * {@code http://schema.org/seasons}.
	 * <p>
	 * A season in a tv/radio series. (legacy spelling; see singular form,
	 * season)
	 *
	 * @see <a href="http://schema.org/seasons">seasons</a>
	 */
	public static final URI seasons;

	/**
	 * Secondary Prevention
	 * <p>
	 * {@code http://schema.org/secondaryPrevention}.
	 * <p>
	 * A preventative therapy used to prevent reoccurrence of the medical
	 * condition after an initial episode of the condition.
	 *
	 * @see <a href="http://schema.org/secondaryPrevention">secondaryPrevention</a>
	 */
	public static final URI secondaryPrevention;

	/**
	 * Seeks
	 * <p>
	 * {@code http://schema.org/seeks}.
	 * <p>
	 * A pointer to products or services sought by the organization or person
	 * (demand).
	 *
	 * @see <a href="http://schema.org/seeks">seeks</a>
	 */
	public static final URI seeks;

	/**
	 * Self Storage
	 * <p>
	 * {@code http://schema.org/SelfStorage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SelfStorage">SelfStorage</a>
	 */
	public static final URI SelfStorage;

	/**
	 * Sell Action
	 * <p>
	 * {@code http://schema.org/SellAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SellAction">SellAction</a>
	 */
	public static final URI SellAction;

	/**
	 * Seller
	 * <p>
	 * {@code http://schema.org/seller}.
	 * <p>
	 * The organization or person making the offer.
	 *
	 * @see <a href="http://schema.org/seller">seller</a>
	 */
	public static final URI seller;

	/**
	 * Send Action
	 * <p>
	 * {@code http://schema.org/SendAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SendAction">SendAction</a>
	 */
	public static final URI SendAction;

	/**
	 * Sender
	 * <p>
	 * {@code http://schema.org/sender}.
	 * <p>
	 * A sub property of participant. The participant who is at the sending
	 * end of the action.
	 *
	 * @see <a href="http://schema.org/sender">sender</a>
	 */
	public static final URI sender;

	/**
	 * Sensory Unit
	 * <p>
	 * {@code http://schema.org/sensoryUnit}.
	 * <p>
	 * The neurological pathway extension that inputs and sends information
	 * to the brain or spinal cord.
	 *
	 * @see <a href="http://schema.org/sensoryUnit">sensoryUnit</a>
	 */
	public static final URI sensoryUnit;

	/**
	 * Serial Number
	 * <p>
	 * {@code http://schema.org/serialNumber}.
	 * <p>
	 * The serial number or any alphanumeric identifier of a particular
	 * product. When attached to an offer, it is a shortcut for the serial
	 * number of the product included in the offer.
	 *
	 * @see <a href="http://schema.org/serialNumber">serialNumber</a>
	 */
	public static final URI serialNumber;

	/**
	 * Series
	 * <p>
	 * {@code http://schema.org/Series}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Series">Series</a>
	 */
	public static final URI Series;

	/**
	 * Serious Adverse Outcome
	 * <p>
	 * {@code http://schema.org/seriousAdverseOutcome}.
	 * <p>
	 * A possible serious complication and/or serious side effect of this
	 * therapy. Serious adverse outcomes include those that are
	 * life-threatening; result in death, disability, or permanent damage;
	 * require hospitalization or prolong existing hospitalization; cause
	 * congenital anomalies or birth defects; or jeopardize the patient and
	 * may require medical or surgical intervention to prevent one of the
	 * outcomes in this definition.
	 *
	 * @see <a href="http://schema.org/seriousAdverseOutcome">seriousAdverseOutcome</a>
	 */
	public static final URI seriousAdverseOutcome;

	/**
	 * Serves Cuisine
	 * <p>
	 * {@code http://schema.org/servesCuisine}.
	 * <p>
	 * The cuisine of the restaurant.
	 *
	 * @see <a href="http://schema.org/servesCuisine">servesCuisine</a>
	 */
	public static final URI servesCuisine;

	/**
	 * Service
	 * <p>
	 * {@code http://schema.org/Service}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Service">Service</a>
	 */
	public static final URI Service;

	/**
	 * Service Area
	 * <p>
	 * {@code http://schema.org/serviceArea}.
	 * <p>
	 * The geographic area where the service is provided.
	 *
	 * @see <a href="http://schema.org/serviceArea">serviceArea</a>
	 */
	public static final URI serviceArea;

	/**
	 * Service Audience
	 * <p>
	 * {@code http://schema.org/serviceAudience}.
	 * <p>
	 * The audience eligible for this service.
	 *
	 * @see <a href="http://schema.org/serviceAudience">serviceAudience</a>
	 */
	public static final URI serviceAudience;

	/**
	 * Service Channel
	 * <p>
	 * {@code http://schema.org/ServiceChannel}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ServiceChannel">ServiceChannel</a>
	 */
	public static final URI ServiceChannel;

	/**
	 * Service Location
	 * <p>
	 * {@code http://schema.org/serviceLocation}.
	 * <p>
	 * The location (e.g. civic structure, local business, etc.) where a
	 * person can go to access the service.
	 *
	 * @see <a href="http://schema.org/serviceLocation">serviceLocation</a>
	 */
	public static final URI serviceLocation;

	/**
	 * Service Operator
	 * <p>
	 * {@code http://schema.org/serviceOperator}.
	 * <p>
	 * The operating organization, if different from the provider. This
	 * enables the representation of services that are provided by an
	 * organization, but operated by another organization like a
	 * subcontractor.
	 *
	 * @see <a href="http://schema.org/serviceOperator">serviceOperator</a>
	 */
	public static final URI serviceOperator;

	/**
	 * Service Phone
	 * <p>
	 * {@code http://schema.org/servicePhone}.
	 * <p>
	 * The phone number to use to access the service.
	 *
	 * @see <a href="http://schema.org/servicePhone">servicePhone</a>
	 */
	public static final URI servicePhone;

	/**
	 * Service Postal Address
	 * <p>
	 * {@code http://schema.org/servicePostalAddress}.
	 * <p>
	 * The address for accessing the service by mail.
	 *
	 * @see <a href="http://schema.org/servicePostalAddress">servicePostalAddress</a>
	 */
	public static final URI servicePostalAddress;

	/**
	 * Service Sms Number
	 * <p>
	 * {@code http://schema.org/serviceSmsNumber}.
	 * <p>
	 * The number to access the service by text message.
	 *
	 * @see <a href="http://schema.org/serviceSmsNumber">serviceSmsNumber</a>
	 */
	public static final URI serviceSmsNumber;

	/**
	 * Service Type
	 * <p>
	 * {@code http://schema.org/serviceType}.
	 * <p>
	 * The type of service being offered, e.g. veterans' benefits, emergency
	 * relief, etc.
	 *
	 * @see <a href="http://schema.org/serviceType">serviceType</a>
	 */
	public static final URI serviceType;

	/**
	 * Service Url
	 * <p>
	 * {@code http://schema.org/serviceUrl}.
	 * <p>
	 * The website to access the service.
	 *
	 * @see <a href="http://schema.org/serviceUrl">serviceUrl</a>
	 */
	public static final URI serviceUrl;

	/**
	 * Serving Size
	 * <p>
	 * {@code http://schema.org/servingSize}.
	 * <p>
	 * The serving size, in terms of the number of volume or mass
	 *
	 * @see <a href="http://schema.org/servingSize">servingSize</a>
	 */
	public static final URI servingSize;

	/**
	 * Share Action
	 * <p>
	 * {@code http://schema.org/ShareAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ShareAction">ShareAction</a>
	 */
	public static final URI ShareAction;

	/**
	 * Shoe Store
	 * <p>
	 * {@code http://schema.org/ShoeStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ShoeStore">ShoeStore</a>
	 */
	public static final URI ShoeStore;

	/**
	 * Shopping Center
	 * <p>
	 * {@code http://schema.org/ShoppingCenter}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ShoppingCenter">ShoppingCenter</a>
	 */
	public static final URI ShoppingCenter;

	/**
	 * Sibling
	 * <p>
	 * {@code http://schema.org/sibling}.
	 * <p>
	 * A sibling of the person.
	 *
	 * @see <a href="http://schema.org/sibling">sibling</a>
	 */
	public static final URI sibling;

	/**
	 * Siblings
	 * <p>
	 * {@code http://schema.org/siblings}.
	 * <p>
	 * A sibling of the person (legacy spelling; see singular form, sibling).
	 *
	 * @see <a href="http://schema.org/siblings">siblings</a>
	 */
	public static final URI siblings;

	/**
	 * Sign Detected
	 * <p>
	 * {@code http://schema.org/signDetected}.
	 * <p>
	 * A sign detected by the test.
	 *
	 * @see <a href="http://schema.org/signDetected">signDetected</a>
	 */
	public static final URI signDetected;

	/**
	 * Significance
	 * <p>
	 * {@code http://schema.org/significance}.
	 * <p>
	 * The significance associated with the superficial anatomy; as an
	 * example, how characteristics of the superficial anatomy can suggest
	 * underlying medical conditions or courses of treatment.
	 *
	 * @see <a href="http://schema.org/significance">significance</a>
	 */
	public static final URI significance;

	/**
	 * Significant Link
	 * <p>
	 * {@code http://schema.org/significantLink}.
	 * <p>
	 * One of the more significant URLs on the page. Typically, these are the
	 * non-navigation links that are clicked on the most.
	 *
	 * @see <a href="http://schema.org/significantLink">significantLink</a>
	 */
	public static final URI significantLink;

	/**
	 * Significant Links
	 * <p>
	 * {@code http://schema.org/significantLinks}.
	 * <p>
	 * The most significant URLs on the page. Typically, these are the
	 * non-navigation links that are clicked on the most (legacy spelling;
	 * see singular form, significantLink).
	 *
	 * @see <a href="http://schema.org/significantLinks">significantLinks</a>
	 */
	public static final URI significantLinks;

	/**
	 * Sign or Symptom
	 * <p>
	 * {@code http://schema.org/signOrSymptom}.
	 * <p>
	 * A sign or symptom of this condition. Signs are objective or physically
	 * observable manifestations of the medical condition while symptoms are
	 * the subjective experienceof the medical condition.
	 *
	 * @see <a href="http://schema.org/signOrSymptom">signOrSymptom</a>
	 */
	public static final URI signOrSymptom;

	/**
	 * Single Family Residence
	 * <p>
	 * {@code http://schema.org/SingleFamilyResidence}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SingleFamilyResidence">SingleFamilyResidence</a>
	 */
	public static final URI SingleFamilyResidence;

	/**
	 * Site Navigation Element
	 * <p>
	 * {@code http://schema.org/SiteNavigationElement}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SiteNavigationElement">SiteNavigationElement</a>
	 */
	public static final URI SiteNavigationElement;

	/**
	 * Skills
	 * <p>
	 * {@code http://schema.org/skills}.
	 * <p>
	 * Skills required to fulfill this role.
	 *
	 * @see <a href="http://schema.org/skills">skills</a>
	 */
	public static final URI skills;

	/**
	 * Ski Resort
	 * <p>
	 * {@code http://schema.org/SkiResort}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SkiResort">SkiResort</a>
	 */
	public static final URI SkiResort;

	/**
	 * Sku
	 * <p>
	 * {@code http://schema.org/sku}.
	 * <p>
	 * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for
	 * a product or service, or the product to which the offer refers.
	 *
	 * @see <a href="http://schema.org/sku">sku</a>
	 */
	public static final URI sku;

	/**
	 * Social Event
	 * <p>
	 * {@code http://schema.org/SocialEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SocialEvent">SocialEvent</a>
	 */
	public static final URI SocialEvent;

	/**
	 * Sodium Content
	 * <p>
	 * {@code http://schema.org/sodiumContent}.
	 * <p>
	 * The number of milligrams of sodium.
	 *
	 * @see <a href="http://schema.org/sodiumContent">sodiumContent</a>
	 */
	public static final URI sodiumContent;

	/**
	 * Software Application
	 * <p>
	 * {@code http://schema.org/SoftwareApplication}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SoftwareApplication">SoftwareApplication</a>
	 */
	public static final URI SoftwareApplication;

	/**
	 * Software Version
	 * <p>
	 * {@code http://schema.org/softwareVersion}.
	 * <p>
	 * Version of the software instance.
	 *
	 * @see <a href="http://schema.org/softwareVersion">softwareVersion</a>
	 */
	public static final URI softwareVersion;

	/**
	 * Some Products
	 * <p>
	 * {@code http://schema.org/SomeProducts}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SomeProducts">SomeProducts</a>
	 */
	public static final URI SomeProducts;

	/**
	 * Source
	 * <p>
	 * {@code http://schema.org/source}.
	 * <p>
	 * The anatomical or organ system that the artery originates from.
	 *
	 * @see <a href="http://schema.org/source">source</a>
	 */
	public static final URI source;

	/**
	 * Sourced From
	 * <p>
	 * {@code http://schema.org/sourcedFrom}.
	 * <p>
	 * The neurological pathway that originates the neurons.
	 *
	 * @see <a href="http://schema.org/sourcedFrom">sourcedFrom</a>
	 */
	public static final URI sourcedFrom;

	/**
	 * Source Organization
	 * <p>
	 * {@code http://schema.org/sourceOrganization}.
	 * <p>
	 * The Organization on whose behalf the creator was working.
	 *
	 * @see <a href="http://schema.org/sourceOrganization">sourceOrganization</a>
	 */
	public static final URI sourceOrganization;

	/**
	 * Spatial
	 * <p>
	 * {@code http://schema.org/spatial}.
	 * <p>
	 * The range of spatial applicability of a dataset, e.g. for a dataset of
	 * New York weather, the state of New York.
	 *
	 * @see <a href="http://schema.org/spatial">spatial</a>
	 */
	public static final URI spatial;

	/**
	 * Special Commitments
	 * <p>
	 * {@code http://schema.org/specialCommitments}.
	 * <p>
	 * Any special commitments associated with this job posting. Valid
	 * entries include VeteranCommit, MilitarySpouseCommit, etc.
	 *
	 * @see <a href="http://schema.org/specialCommitments">specialCommitments</a>
	 */
	public static final URI specialCommitments;

	/**
	 * Specialty
	 * <p>
	 * {@code http://schema.org/specialty}.
	 * <p>
	 * One of the domain specialities to which this web page's content
	 * applies.
	 *
	 * @see <a href="http://schema.org/specialty">specialty</a>
	 */
	public static final URI specialty;

	/**
	 * Specialty
	 * <p>
	 * {@code http://schema.org/Specialty}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Specialty">Specialty</a>
	 */
	public static final URI Specialty;

	/**
	 * Sponsor
	 * <p>
	 * {@code http://schema.org/sponsor}.
	 * <p>
	 * Sponsor of the study.
	 *
	 * @see <a href="http://schema.org/sponsor">sponsor</a>
	 */
	public static final URI sponsor;

	/**
	 * Sporting Goods Store
	 * <p>
	 * {@code http://schema.org/SportingGoodsStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SportingGoodsStore">SportingGoodsStore</a>
	 */
	public static final URI SportingGoodsStore;

	/**
	 * Sports Activity Location
	 * <p>
	 * {@code http://schema.org/sportsActivityLocation}.
	 * <p>
	 * A sub property of location. The sports activity location where this
	 * action occurred.
	 *
	 * @see <a href="http://schema.org/sportsActivityLocation">sportsActivityLocation</a>
	 */
	public static final URI sportsActivityLocation;

	/**
	 * Sports Activity Location
	 * <p>
	 * {@code http://schema.org/SportsActivityLocation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SportsActivityLocation">SportsActivityLocation</a>
	 */
	public static final URI SportsActivityLocation;

	/**
	 * Sports Club
	 * <p>
	 * {@code http://schema.org/SportsClub}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SportsClub">SportsClub</a>
	 */
	public static final URI SportsClub;

	/**
	 * Sports Event
	 * <p>
	 * {@code http://schema.org/SportsEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SportsEvent">SportsEvent</a>
	 */
	public static final URI SportsEvent;

	/**
	 * Sports Event
	 * <p>
	 * {@code http://schema.org/sportsEvent}.
	 * <p>
	 * A sub property of location. The sports event where this action
	 * occurred.
	 *
	 * @see <a href="http://schema.org/sportsEvent">sportsEvent</a>
	 */
	public static final URI sportsEvent;

	/**
	 * Sports Team
	 * <p>
	 * {@code http://schema.org/SportsTeam}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SportsTeam">SportsTeam</a>
	 */
	public static final URI SportsTeam;

	/**
	 * Sports Team
	 * <p>
	 * {@code http://schema.org/sportsTeam}.
	 * <p>
	 * A sub property of participant. The sports team that participated on
	 * this action.
	 *
	 * @see <a href="http://schema.org/sportsTeam">sportsTeam</a>
	 */
	public static final URI sportsTeam;

	/**
	 * Spouse
	 * <p>
	 * {@code http://schema.org/spouse}.
	 * <p>
	 * The person's spouse.
	 *
	 * @see <a href="http://schema.org/spouse">spouse</a>
	 */
	public static final URI spouse;

	/**
	 * Stadium or Arena
	 * <p>
	 * {@code http://schema.org/StadiumOrArena}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/StadiumOrArena">StadiumOrArena</a>
	 */
	public static final URI StadiumOrArena;

	/**
	 * Stage
	 * <p>
	 * {@code http://schema.org/stage}.
	 * <p>
	 * The stage of the condition, if applicable.
	 *
	 * @see <a href="http://schema.org/stage">stage</a>
	 */
	public static final URI stage;

	/**
	 * Stage As Number
	 * <p>
	 * {@code http://schema.org/stageAsNumber}.
	 * <p>
	 * The stage represented as a number, e.g. 3.
	 *
	 * @see <a href="http://schema.org/stageAsNumber">stageAsNumber</a>
	 */
	public static final URI stageAsNumber;

	/**
	 * Start Date
	 * <p>
	 * {@code http://schema.org/startDate}.
	 * <p>
	 * The start date and time of the event or item (in ISO 8601 date
	 * format).
	 *
	 * @see <a href="http://schema.org/startDate">startDate</a>
	 */
	public static final URI startDate;

	/**
	 * Start Time
	 * <p>
	 * {@code http://schema.org/startTime}.
	 * <p>
	 * When the Action was performed: start time. This is for actions that
	 * span a period of time. e.g. John wrote a book from *January* to
	 * December.
	 *
	 * @see <a href="http://schema.org/startTime">startTime</a>
	 */
	public static final URI startTime;

	/**
	 * State
	 * <p>
	 * {@code http://schema.org/State}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/State">State</a>
	 */
	public static final URI State;

	/**
	 * Status
	 * <p>
	 * {@code http://schema.org/status}.
	 * <p>
	 * The status of the study (enumerated).
	 *
	 * @see <a href="http://schema.org/status">status</a>
	 */
	public static final URI status;

	/**
	 * Storage Requirements
	 * <p>
	 * {@code http://schema.org/storageRequirements}.
	 * <p>
	 * Storage requirements (free space required).
	 *
	 * @see <a href="http://schema.org/storageRequirements">storageRequirements</a>
	 */
	public static final URI storageRequirements;

	/**
	 * Store
	 * <p>
	 * {@code http://schema.org/Store}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Store">Store</a>
	 */
	public static final URI Store;

	/**
	 * Street Address
	 * <p>
	 * {@code http://schema.org/streetAddress}.
	 * <p>
	 * The street address. For example, 1600 Amphitheatre Pkwy.
	 *
	 * @see <a href="http://schema.org/streetAddress">streetAddress</a>
	 */
	public static final URI streetAddress;

	/**
	 * Strength Unit
	 * <p>
	 * {@code http://schema.org/strengthUnit}.
	 * <p>
	 * The units of an active ingredient's strength, e.g. mg.
	 *
	 * @see <a href="http://schema.org/strengthUnit">strengthUnit</a>
	 */
	public static final URI strengthUnit;

	/**
	 * Strength Value
	 * <p>
	 * {@code http://schema.org/strengthValue}.
	 * <p>
	 * The value of an active ingredient's strength, e.g. 325.
	 *
	 * @see <a href="http://schema.org/strengthValue">strengthValue</a>
	 */
	public static final URI strengthValue;

	/**
	 * Structural Class
	 * <p>
	 * {@code http://schema.org/structuralClass}.
	 * <p>
	 * The name given to how bone physically connects to each other.
	 *
	 * @see <a href="http://schema.org/structuralClass">structuralClass</a>
	 */
	public static final URI structuralClass;

	/**
	 * Structured Value
	 * <p>
	 * {@code http://schema.org/StructuredValue}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/StructuredValue">StructuredValue</a>
	 */
	public static final URI StructuredValue;

	/**
	 * Study
	 * <p>
	 * {@code http://schema.org/study}.
	 * <p>
	 * A medical study or trial related to this entity.
	 *
	 * @see <a href="http://schema.org/study">study</a>
	 */
	public static final URI study;

	/**
	 * Study Design
	 * <p>
	 * {@code http://schema.org/studyDesign}.
	 * <p>
	 * Specifics about the observational study design (enumerated).
	 *
	 * @see <a href="http://schema.org/studyDesign">studyDesign</a>
	 */
	public static final URI studyDesign;

	/**
	 * Study Location
	 * <p>
	 * {@code http://schema.org/studyLocation}.
	 * <p>
	 * The location in which the study is taking/took place.
	 *
	 * @see <a href="http://schema.org/studyLocation">studyLocation</a>
	 */
	public static final URI studyLocation;

	/**
	 * Study Subject
	 * <p>
	 * {@code http://schema.org/studySubject}.
	 * <p>
	 * A subject of the study, i.e. one of the medical conditions, therapies,
	 * devices, drugs, etc. investigated by the study.
	 *
	 * @see <a href="http://schema.org/studySubject">studySubject</a>
	 */
	public static final URI studySubject;

	/**
	 * Sub Event
	 * <p>
	 * {@code http://schema.org/subEvent}.
	 * <p>
	 * An Event that is part of this event. For example, a conference event
	 * includes many presentations, each are a subEvent of the conference.
	 *
	 * @see <a href="http://schema.org/subEvent">subEvent</a>
	 */
	public static final URI subEvent;

	/**
	 * Sub Events
	 * <p>
	 * {@code http://schema.org/subEvents}.
	 * <p>
	 * Events that are a part of this event. For example, a conference event
	 * includes many presentations, each are subEvents of the conference
	 * (legacy spelling; see singular form, subEvent).
	 *
	 * @see <a href="http://schema.org/subEvents">subEvents</a>
	 */
	public static final URI subEvents;

	/**
	 * Sub Organization
	 * <p>
	 * {@code http://schema.org/subOrganization}.
	 * <p>
	 * A relationship between two organizations where the first includes the
	 * second, e.g., as a subsidiary. See also: the more specific
	 * 'department' property.
	 *
	 * @see <a href="http://schema.org/subOrganization">subOrganization</a>
	 */
	public static final URI subOrganization;

	/**
	 * Subscribe Action
	 * <p>
	 * {@code http://schema.org/SubscribeAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SubscribeAction">SubscribeAction</a>
	 */
	public static final URI SubscribeAction;

	/**
	 * Sub Stage Suffix
	 * <p>
	 * {@code http://schema.org/subStageSuffix}.
	 * <p>
	 * The substage, e.g. 'a' for Stage IIIa.
	 *
	 * @see <a href="http://schema.org/subStageSuffix">subStageSuffix</a>
	 */
	public static final URI subStageSuffix;

	/**
	 * Sub Structure
	 * <p>
	 * {@code http://schema.org/subStructure}.
	 * <p>
	 * Component (sub-)structure(s) that comprise this anatomical structure.
	 *
	 * @see <a href="http://schema.org/subStructure">subStructure</a>
	 */
	public static final URI subStructure;

	/**
	 * Sub Test
	 * <p>
	 * {@code http://schema.org/subTest}.
	 * <p>
	 * A component test of the panel.
	 *
	 * @see <a href="http://schema.org/subTest">subTest</a>
	 */
	public static final URI subTest;

	/**
	 * Subtype
	 * <p>
	 * {@code http://schema.org/subtype}.
	 * <p>
	 * A more specific type of the condition, where applicable, for example
	 * 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for
	 * Diabetes.
	 *
	 * @see <a href="http://schema.org/subtype">subtype</a>
	 */
	public static final URI subtype;

	/**
	 * Subway Station
	 * <p>
	 * {@code http://schema.org/SubwayStation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SubwayStation">SubwayStation</a>
	 */
	public static final URI SubwayStation;

	/**
	 * Successor of
	 * <p>
	 * {@code http://schema.org/successorOf}.
	 * <p>
	 * A pointer from a newer variant of a product to its previous, often
	 * discontinued predecessor.
	 *
	 * @see <a href="http://schema.org/successorOf">successorOf</a>
	 */
	public static final URI successorOf;

	/**
	 * Sugar Content
	 * <p>
	 * {@code http://schema.org/sugarContent}.
	 * <p>
	 * The number of grams of sugar.
	 *
	 * @see <a href="http://schema.org/sugarContent">sugarContent</a>
	 */
	public static final URI sugarContent;

	/**
	 * Suggested Gender
	 * <p>
	 * {@code http://schema.org/suggestedGender}.
	 * <p>
	 * The gender of the person or audience.
	 *
	 * @see <a href="http://schema.org/suggestedGender">suggestedGender</a>
	 */
	public static final URI suggestedGender;

	/**
	 * Suggested Max Age
	 * <p>
	 * {@code http://schema.org/suggestedMaxAge}.
	 * <p>
	 * Maximal age recommended for viewing content
	 *
	 * @see <a href="http://schema.org/suggestedMaxAge">suggestedMaxAge</a>
	 */
	public static final URI suggestedMaxAge;

	/**
	 * Suggested Min Age
	 * <p>
	 * {@code http://schema.org/suggestedMinAge}.
	 * <p>
	 * Minimal age recommended for viewing content
	 *
	 * @see <a href="http://schema.org/suggestedMinAge">suggestedMinAge</a>
	 */
	public static final URI suggestedMinAge;

	/**
	 * Super Event
	 * <p>
	 * {@code http://schema.org/superEvent}.
	 * <p>
	 * An event that this event is a part of. For example, a collection of
	 * individual music performances might each have a music festival as
	 * their superEvent.
	 *
	 * @see <a href="http://schema.org/superEvent">superEvent</a>
	 */
	public static final URI superEvent;

	/**
	 * Superficial Anatomy
	 * <p>
	 * {@code http://schema.org/SuperficialAnatomy}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/SuperficialAnatomy">SuperficialAnatomy</a>
	 */
	public static final URI SuperficialAnatomy;

	/**
	 * Supply to
	 * <p>
	 * {@code http://schema.org/supplyTo}.
	 * <p>
	 * The area to which the artery supplies blood to.
	 *
	 * @see <a href="http://schema.org/supplyTo">supplyTo</a>
	 */
	public static final URI supplyTo;

	/**
	 * Synagogue
	 * <p>
	 * {@code http://schema.org/Synagogue}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Synagogue">Synagogue</a>
	 */
	public static final URI Synagogue;

	/**
	 * Table
	 * <p>
	 * {@code http://schema.org/Table}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Table">Table</a>
	 */
	public static final URI Table;

	/**
	 * Take Action
	 * <p>
	 * {@code http://schema.org/TakeAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TakeAction">TakeAction</a>
	 */
	public static final URI TakeAction;

	/**
	 * Target Description
	 * <p>
	 * {@code http://schema.org/targetDescription}.
	 * <p>
	 * The description of a node in an established educational framework.
	 *
	 * @see <a href="http://schema.org/targetDescription">targetDescription</a>
	 */
	public static final URI targetDescription;

	/**
	 * Target Name
	 * <p>
	 * {@code http://schema.org/targetName}.
	 * <p>
	 * The name of a node in an established educational framework.
	 *
	 * @see <a href="http://schema.org/targetName">targetName</a>
	 */
	public static final URI targetName;

	/**
	 * Target Platform
	 * <p>
	 * {@code http://schema.org/targetPlatform}.
	 * <p>
	 * Type of app development: phone, Metro style, desktop, XBox, etc.
	 *
	 * @see <a href="http://schema.org/targetPlatform">targetPlatform</a>
	 */
	public static final URI targetPlatform;

	/**
	 * Target Population
	 * <p>
	 * {@code http://schema.org/targetPopulation}.
	 * <p>
	 * Characteristics of the population for which this is intended, or which
	 * typically uses it, e.g. 'adults'.
	 *
	 * @see <a href="http://schema.org/targetPopulation">targetPopulation</a>
	 */
	public static final URI targetPopulation;

	/**
	 * Target Product
	 * <p>
	 * {@code http://schema.org/targetProduct}.
	 * <p>
	 * Target Operating System / Product to which the code applies. If
	 * applies to several versions, just the product name can be used.
	 *
	 * @see <a href="http://schema.org/targetProduct">targetProduct</a>
	 */
	public static final URI targetProduct;

	/**
	 * Target Url
	 * <p>
	 * {@code http://schema.org/targetUrl}.
	 * <p>
	 * The URL of a node in an established educational framework.
	 *
	 * @see <a href="http://schema.org/targetUrl">targetUrl</a>
	 */
	public static final URI targetUrl;

	/**
	 * Tattoo Parlor
	 * <p>
	 * {@code http://schema.org/TattooParlor}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TattooParlor">TattooParlor</a>
	 */
	public static final URI TattooParlor;

	/**
	 * Tax ID
	 * <p>
	 * {@code http://schema.org/taxID}.
	 * <p>
	 * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the
	 * US or the CIF/NIF in Spain.
	 *
	 * @see <a href="http://schema.org/taxID">taxID</a>
	 */
	public static final URI taxID;

	/**
	 * Taxi Stand
	 * <p>
	 * {@code http://schema.org/TaxiStand}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TaxiStand">TaxiStand</a>
	 */
	public static final URI TaxiStand;

	/**
	 * Tech Article
	 * <p>
	 * {@code http://schema.org/TechArticle}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TechArticle">TechArticle</a>
	 */
	public static final URI TechArticle;

	/**
	 * Telephone
	 * <p>
	 * {@code http://schema.org/telephone}.
	 * <p>
	 * The telephone number.
	 *
	 * @see <a href="http://schema.org/telephone">telephone</a>
	 */
	public static final URI telephone;

	/**
	 * Television Station
	 * <p>
	 * {@code http://schema.org/TelevisionStation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TelevisionStation">TelevisionStation</a>
	 */
	public static final URI TelevisionStation;

	/**
	 * Temporal
	 * <p>
	 * {@code http://schema.org/temporal}.
	 * <p>
	 * The range of temporal applicability of a dataset, e.g. for a 2011
	 * census dataset, the year 2011 (in ISO 8601 time interval format).
	 *
	 * @see <a href="http://schema.org/temporal">temporal</a>
	 */
	public static final URI temporal;

	/**
	 * Tennis Complex
	 * <p>
	 * {@code http://schema.org/TennisComplex}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TennisComplex">TennisComplex</a>
	 */
	public static final URI TennisComplex;

	/**
	 * Text
	 * <p>
	 * {@code http://schema.org/text}.
	 * <p>
	 * The textual content of this CreativeWork.
	 *
	 * @see <a href="http://schema.org/text">text</a>
	 */
	public static final URI text;

	/**
	 * Theater Event
	 * <p>
	 * {@code http://schema.org/TheaterEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TheaterEvent">TheaterEvent</a>
	 */
	public static final URI TheaterEvent;

	/**
	 * Theater Group
	 * <p>
	 * {@code http://schema.org/TheaterGroup}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TheaterGroup">TheaterGroup</a>
	 */
	public static final URI TheaterGroup;

	/**
	 * Therapeutic Procedure
	 * <p>
	 * {@code http://schema.org/TherapeuticProcedure}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TherapeuticProcedure">TherapeuticProcedure</a>
	 */
	public static final URI TherapeuticProcedure;

	/**
	 * Thing
	 * <p>
	 * {@code http://schema.org/Thing}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Thing">Thing</a>
	 */
	public static final URI Thing;

	/**
	 * Thumbnail
	 * <p>
	 * {@code http://schema.org/thumbnail}.
	 * <p>
	 * Thumbnail image for an image or video.
	 *
	 * @see <a href="http://schema.org/thumbnail">thumbnail</a>
	 */
	public static final URI thumbnail;

	/**
	 * Thumbnail Url
	 * <p>
	 * {@code http://schema.org/thumbnailUrl}.
	 * <p>
	 * A thumbnail image relevant to the Thing.
	 *
	 * @see <a href="http://schema.org/thumbnailUrl">thumbnailUrl</a>
	 */
	public static final URI thumbnailUrl;

	/**
	 * Ticker Symbol
	 * <p>
	 * {@code http://schema.org/tickerSymbol}.
	 * <p>
	 * The exchange traded instrument associated with a Corporation object.
	 * The tickerSymbol is expressed as an exchange and an instrument name
	 * separated by a space character. For the exchange component of the
	 * tickerSymbol attribute, we reccommend using the controlled vocaulary
	 * of Market Identifier Codes (MIC) specified in ISO15022.
	 *
	 * @see <a href="http://schema.org/tickerSymbol">tickerSymbol</a>
	 */
	public static final URI tickerSymbol;

	/**
	 * Tie Action
	 * <p>
	 * {@code http://schema.org/TieAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TieAction">TieAction</a>
	 */
	public static final URI TieAction;

	/**
	 * Time Required
	 * <p>
	 * {@code http://schema.org/timeRequired}.
	 * <p>
	 * Approximate or typical time it takes to work with or through this
	 * learning resource for the typical intended target audience, e.g.
	 * 'P30M', 'P1H25M'.
	 *
	 * @see <a href="http://schema.org/timeRequired">timeRequired</a>
	 */
	public static final URI timeRequired;

	/**
	 * Tip Action
	 * <p>
	 * {@code http://schema.org/TipAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TipAction">TipAction</a>
	 */
	public static final URI TipAction;

	/**
	 * Tire Shop
	 * <p>
	 * {@code http://schema.org/TireShop}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TireShop">TireShop</a>
	 */
	public static final URI TireShop;

	/**
	 * Tissue Sample
	 * <p>
	 * {@code http://schema.org/tissueSample}.
	 * <p>
	 * The type of tissue sample required for the test.
	 *
	 * @see <a href="http://schema.org/tissueSample">tissueSample</a>
	 */
	public static final URI tissueSample;

	/**
	 * Title
	 * <p>
	 * {@code http://schema.org/title}.
	 * <p>
	 * The title of the job.
	 *
	 * @see <a href="http://schema.org/title">title</a>
	 */
	public static final URI title;

	/**
	 * To Location
	 * <p>
	 * {@code http://schema.org/toLocation}.
	 * <p>
	 * A sub property of location. The final location of the object or the
	 * agent after the action.
	 *
	 * @see <a href="http://schema.org/toLocation">toLocation</a>
	 */
	public static final URI toLocation;

	/**
	 * Total Time
	 * <p>
	 * {@code http://schema.org/totalTime}.
	 * <p>
	 * The total time it takes to prepare and cook the recipe, in ISO 8601
	 * duration format.
	 *
	 * @see <a href="http://schema.org/totalTime">totalTime</a>
	 */
	public static final URI totalTime;

	/**
	 * Tourist Attraction
	 * <p>
	 * {@code http://schema.org/TouristAttraction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TouristAttraction">TouristAttraction</a>
	 */
	public static final URI TouristAttraction;

	/**
	 * Tourist Information Center
	 * <p>
	 * {@code http://schema.org/TouristInformationCenter}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TouristInformationCenter">TouristInformationCenter</a>
	 */
	public static final URI TouristInformationCenter;

	/**
	 * Toy Store
	 * <p>
	 * {@code http://schema.org/ToyStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ToyStore">ToyStore</a>
	 */
	public static final URI ToyStore;

	/**
	 * Track
	 * <p>
	 * {@code http://schema.org/track}.
	 * <p>
	 * A music recording (track)—usually a single song.
	 *
	 * @see <a href="http://schema.org/track">track</a>
	 */
	public static final URI track;

	/**
	 * Track Action
	 * <p>
	 * {@code http://schema.org/TrackAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TrackAction">TrackAction</a>
	 */
	public static final URI TrackAction;

	/**
	 * Tracking Number
	 * <p>
	 * {@code http://schema.org/trackingNumber}.
	 * <p>
	 * Shipper tracking number.
	 *
	 * @see <a href="http://schema.org/trackingNumber">trackingNumber</a>
	 */
	public static final URI trackingNumber;

	/**
	 * Tracking Url
	 * <p>
	 * {@code http://schema.org/trackingUrl}.
	 * <p>
	 * Tracking url for the parcel delivery.
	 *
	 * @see <a href="http://schema.org/trackingUrl">trackingUrl</a>
	 */
	public static final URI trackingUrl;

	/**
	 * Tracks
	 * <p>
	 * {@code http://schema.org/tracks}.
	 * <p>
	 * A music recording (track)—usually a single song (legacy spelling; see
	 * singular form, track).
	 *
	 * @see <a href="http://schema.org/tracks">tracks</a>
	 */
	public static final URI tracks;

	/**
	 * Trade Action
	 * <p>
	 * {@code http://schema.org/TradeAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TradeAction">TradeAction</a>
	 */
	public static final URI TradeAction;

	/**
	 * Trailer
	 * <p>
	 * {@code http://schema.org/trailer}.
	 * <p>
	 * The trailer of a movie or tv/radio series, season, or episode.
	 *
	 * @see <a href="http://schema.org/trailer">trailer</a>
	 */
	public static final URI trailer;

	/**
	 * Train Station
	 * <p>
	 * {@code http://schema.org/TrainStation}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TrainStation">TrainStation</a>
	 */
	public static final URI TrainStation;

	/**
	 * Transcript
	 * <p>
	 * {@code http://schema.org/transcript}.
	 * <p>
	 * If this MediaObject is an AudioObject or VideoObject, the transcript
	 * of that object.
	 *
	 * @see <a href="http://schema.org/transcript">transcript</a>
	 */
	public static final URI transcript;

	/**
	 * Trans Fat Content
	 * <p>
	 * {@code http://schema.org/transFatContent}.
	 * <p>
	 * The number of grams of trans fat.
	 *
	 * @see <a href="http://schema.org/transFatContent">transFatContent</a>
	 */
	public static final URI transFatContent;

	/**
	 * Transfer Action
	 * <p>
	 * {@code http://schema.org/TransferAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TransferAction">TransferAction</a>
	 */
	public static final URI TransferAction;

	/**
	 * Transmission Method
	 * <p>
	 * {@code http://schema.org/transmissionMethod}.
	 * <p>
	 * How the disease spreads, either as a route or vector, for example
	 * 'direct contact', 'Aedes aegypti', etc.
	 *
	 * @see <a href="http://schema.org/transmissionMethod">transmissionMethod</a>
	 */
	public static final URI transmissionMethod;

	/**
	 * Travel Action
	 * <p>
	 * {@code http://schema.org/TravelAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TravelAction">TravelAction</a>
	 */
	public static final URI TravelAction;

	/**
	 * Travel Agency
	 * <p>
	 * {@code http://schema.org/TravelAgency}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TravelAgency">TravelAgency</a>
	 */
	public static final URI TravelAgency;

	/**
	 * Treatment Indication
	 * <p>
	 * {@code http://schema.org/TreatmentIndication}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TreatmentIndication">TreatmentIndication</a>
	 */
	public static final URI TreatmentIndication;

	/**
	 * Trial Design
	 * <p>
	 * {@code http://schema.org/trialDesign}.
	 * <p>
	 * Specifics about the trial design (enumerated).
	 *
	 * @see <a href="http://schema.org/trialDesign">trialDesign</a>
	 */
	public static final URI trialDesign;

	/**
	 * Tributary
	 * <p>
	 * {@code http://schema.org/tributary}.
	 * <p>
	 * The anatomical or organ system that the vein flows into; a larger
	 * structure that the vein connects to.
	 *
	 * @see <a href="http://schema.org/tributary">tributary</a>
	 */
	public static final URI tributary;

	/**
	 * TV Clip
	 * <p>
	 * {@code http://schema.org/TVClip}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TVClip">TVClip</a>
	 */
	public static final URI TVClip;

	/**
	 * TV Episode
	 * <p>
	 * {@code http://schema.org/TVEpisode}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TVEpisode">TVEpisode</a>
	 */
	public static final URI TVEpisode;

	/**
	 * TV Season
	 * <p>
	 * {@code http://schema.org/TVSeason}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TVSeason">TVSeason</a>
	 */
	public static final URI TVSeason;

	/**
	 * TV Series
	 * <p>
	 * {@code http://schema.org/TVSeries}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TVSeries">TVSeries</a>
	 */
	public static final URI TVSeries;

	/**
	 * Type And Quantity Node
	 * <p>
	 * {@code http://schema.org/TypeAndQuantityNode}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/TypeAndQuantityNode">TypeAndQuantityNode</a>
	 */
	public static final URI TypeAndQuantityNode;

	/**
	 * Type of Good
	 * <p>
	 * {@code http://schema.org/typeOfGood}.
	 * <p>
	 * The product that this structured value is referring to.
	 *
	 * @see <a href="http://schema.org/typeOfGood">typeOfGood</a>
	 */
	public static final URI typeOfGood;

	/**
	 * Typical Age Range
	 * <p>
	 * {@code http://schema.org/typicalAgeRange}.
	 * <p>
	 * The typical expected age range, e.g. '7-9', '11-'.
	 *
	 * @see <a href="http://schema.org/typicalAgeRange">typicalAgeRange</a>
	 */
	public static final URI typicalAgeRange;

	/**
	 * Typical Test
	 * <p>
	 * {@code http://schema.org/typicalTest}.
	 * <p>
	 * A medical test typically performed given this condition.
	 *
	 * @see <a href="http://schema.org/typicalTest">typicalTest</a>
	 */
	public static final URI typicalTest;

	/**
	 * Unit Code
	 * <p>
	 * {@code http://schema.org/unitCode}.
	 * <p>
	 * The unit of measurement given using the UN/CEFACT Common Code (3
	 * characters).
	 *
	 * @see <a href="http://schema.org/unitCode">unitCode</a>
	 */
	public static final URI unitCode;

	/**
	 * Unit Price Specification
	 * <p>
	 * {@code http://schema.org/UnitPriceSpecification}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UnitPriceSpecification">UnitPriceSpecification</a>
	 */
	public static final URI UnitPriceSpecification;

	/**
	 * Un Register Action
	 * <p>
	 * {@code http://schema.org/UnRegisterAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UnRegisterAction">UnRegisterAction</a>
	 */
	public static final URI UnRegisterAction;

	/**
	 * Unsaturated Fat Content
	 * <p>
	 * {@code http://schema.org/unsaturatedFatContent}.
	 * <p>
	 * The number of grams of unsaturated fat.
	 *
	 * @see <a href="http://schema.org/unsaturatedFatContent">unsaturatedFatContent</a>
	 */
	public static final URI unsaturatedFatContent;

	/**
	 * Update Action
	 * <p>
	 * {@code http://schema.org/UpdateAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UpdateAction">UpdateAction</a>
	 */
	public static final URI UpdateAction;

	/**
	 * Upload Date
	 * <p>
	 * {@code http://schema.org/uploadDate}.
	 * <p>
	 * Date when this media object was uploaded to this site.
	 *
	 * @see <a href="http://schema.org/uploadDate">uploadDate</a>
	 */
	public static final URI uploadDate;

	/**
	 * URL
	 * <p>
	 * {@code http://schema.org/url}.
	 * <p>
	 * URL of the item.
	 *
	 * @see <a href="http://schema.org/url">url</a>
	 */
	public static final URI url;

	/**
	 * Use Action
	 * <p>
	 * {@code http://schema.org/UseAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UseAction">UseAction</a>
	 */
	public static final URI UseAction;

	/**
	 * Used to Diagnose
	 * <p>
	 * {@code http://schema.org/usedToDiagnose}.
	 * <p>
	 * A condition the test is used to diagnose.
	 *
	 * @see <a href="http://schema.org/usedToDiagnose">usedToDiagnose</a>
	 */
	public static final URI usedToDiagnose;

	/**
	 * User Blocks
	 * <p>
	 * {@code http://schema.org/UserBlocks}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UserBlocks">UserBlocks</a>
	 */
	public static final URI UserBlocks;

	/**
	 * User Checkins
	 * <p>
	 * {@code http://schema.org/UserCheckins}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UserCheckins">UserCheckins</a>
	 */
	public static final URI UserCheckins;

	/**
	 * User Comments
	 * <p>
	 * {@code http://schema.org/UserComments}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UserComments">UserComments</a>
	 */
	public static final URI UserComments;

	/**
	 * User Downloads
	 * <p>
	 * {@code http://schema.org/UserDownloads}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UserDownloads">UserDownloads</a>
	 */
	public static final URI UserDownloads;

	/**
	 * User Interaction
	 * <p>
	 * {@code http://schema.org/UserInteraction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UserInteraction">UserInteraction</a>
	 */
	public static final URI UserInteraction;

	/**
	 * User Likes
	 * <p>
	 * {@code http://schema.org/UserLikes}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UserLikes">UserLikes</a>
	 */
	public static final URI UserLikes;

	/**
	 * User Page Visits
	 * <p>
	 * {@code http://schema.org/UserPageVisits}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UserPageVisits">UserPageVisits</a>
	 */
	public static final URI UserPageVisits;

	/**
	 * User Plays
	 * <p>
	 * {@code http://schema.org/UserPlays}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UserPlays">UserPlays</a>
	 */
	public static final URI UserPlays;

	/**
	 * User Plus Ones
	 * <p>
	 * {@code http://schema.org/UserPlusOnes}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UserPlusOnes">UserPlusOnes</a>
	 */
	public static final URI UserPlusOnes;

	/**
	 * User Tweets
	 * <p>
	 * {@code http://schema.org/UserTweets}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/UserTweets">UserTweets</a>
	 */
	public static final URI UserTweets;

	/**
	 * Uses Device
	 * <p>
	 * {@code http://schema.org/usesDevice}.
	 * <p>
	 * Device used to perform the test.
	 *
	 * @see <a href="http://schema.org/usesDevice">usesDevice</a>
	 */
	public static final URI usesDevice;

	/**
	 * Valid for
	 * <p>
	 * {@code http://schema.org/validFor}.
	 * <p>
	 * The time validity of the permit.
	 *
	 * @see <a href="http://schema.org/validFor">validFor</a>
	 */
	public static final URI validFor;

	/**
	 * Valid From
	 * <p>
	 * {@code http://schema.org/validFrom}.
	 * <p>
	 * The date when the item becomes valid.
	 *
	 * @see <a href="http://schema.org/validFrom">validFrom</a>
	 */
	public static final URI validFrom;

	/**
	 * Valid in
	 * <p>
	 * {@code http://schema.org/validIn}.
	 * <p>
	 * The geographic area where the permit is valid.
	 *
	 * @see <a href="http://schema.org/validIn">validIn</a>
	 */
	public static final URI validIn;

	/**
	 * Valid Through
	 * <p>
	 * {@code http://schema.org/validThrough}.
	 * <p>
	 * The end of the validity of offer, price specification, or opening
	 * hours data.
	 *
	 * @see <a href="http://schema.org/validThrough">validThrough</a>
	 */
	public static final URI validThrough;

	/**
	 * Valid Until
	 * <p>
	 * {@code http://schema.org/validUntil}.
	 * <p>
	 * The date when the item is no longer valid.
	 *
	 * @see <a href="http://schema.org/validUntil">validUntil</a>
	 */
	public static final URI validUntil;

	/**
	 * Value
	 * <p>
	 * {@code http://schema.org/value}.
	 * <p>
	 * The value of the product characteristic.
	 *
	 * @see <a href="http://schema.org/value">value</a>
	 */
	public static final URI value;

	/**
	 * Value Added Tax Included
	 * <p>
	 * {@code http://schema.org/valueAddedTaxIncluded}.
	 * <p>
	 * Specifies whether the applicable value-added tax (VAT) is included in
	 * the price specification or not.
	 *
	 * @see <a href="http://schema.org/valueAddedTaxIncluded">valueAddedTaxIncluded</a>
	 */
	public static final URI valueAddedTaxIncluded;

	/**
	 * Value Reference
	 * <p>
	 * {@code http://schema.org/valueReference}.
	 * <p>
	 * A pointer to a secondary value that provides additional information on
	 * the original value, e.g. a reference temperature.
	 *
	 * @see <a href="http://schema.org/valueReference">valueReference</a>
	 */
	public static final URI valueReference;

	/**
	 * Vat ID
	 * <p>
	 * {@code http://schema.org/vatID}.
	 * <p>
	 * The Value-added Tax ID of the organisation or person.
	 *
	 * @see <a href="http://schema.org/vatID">vatID</a>
	 */
	public static final URI vatID;

	/**
	 * Vein
	 * <p>
	 * {@code http://schema.org/Vein}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Vein">Vein</a>
	 */
	public static final URI Vein;

	/**
	 * Vendor
	 * <p>
	 * {@code http://schema.org/vendor}.
	 * <p>
	 * A sub property of participant. The seller.The
	 * participant/person/organization that sold the object.
	 *
	 * @see <a href="http://schema.org/vendor">vendor</a>
	 */
	public static final URI vendor;

	/**
	 * Version
	 * <p>
	 * {@code http://schema.org/version}.
	 * <p>
	 * The version of the CreativeWork embodied by a specified resource.
	 *
	 * @see <a href="http://schema.org/version">version</a>
	 */
	public static final URI version;

	/**
	 * Vessel
	 * <p>
	 * {@code http://schema.org/Vessel}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Vessel">Vessel</a>
	 */
	public static final URI Vessel;

	/**
	 * Veterinary Care
	 * <p>
	 * {@code http://schema.org/VeterinaryCare}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/VeterinaryCare">VeterinaryCare</a>
	 */
	public static final URI VeterinaryCare;

	/**
	 * Video
	 * <p>
	 * {@code http://schema.org/video}.
	 * <p>
	 * An embedded video object.
	 *
	 * @see <a href="http://schema.org/video">video</a>
	 */
	public static final URI video;

	/**
	 * Video Frame Size
	 * <p>
	 * {@code http://schema.org/videoFrameSize}.
	 * <p>
	 * The frame size of the video.
	 *
	 * @see <a href="http://schema.org/videoFrameSize">videoFrameSize</a>
	 */
	public static final URI videoFrameSize;

	/**
	 * Video Gallery
	 * <p>
	 * {@code http://schema.org/VideoGallery}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/VideoGallery">VideoGallery</a>
	 */
	public static final URI VideoGallery;

	/**
	 * Video Object
	 * <p>
	 * {@code http://schema.org/VideoObject}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/VideoObject">VideoObject</a>
	 */
	public static final URI VideoObject;

	/**
	 * Video Quality
	 * <p>
	 * {@code http://schema.org/videoQuality}.
	 * <p>
	 * The quality of the video.
	 *
	 * @see <a href="http://schema.org/videoQuality">videoQuality</a>
	 */
	public static final URI videoQuality;

	/**
	 * View Action
	 * <p>
	 * {@code http://schema.org/ViewAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/ViewAction">ViewAction</a>
	 */
	public static final URI ViewAction;

	/**
	 * Visual Arts Event
	 * <p>
	 * {@code http://schema.org/VisualArtsEvent}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/VisualArtsEvent">VisualArtsEvent</a>
	 */
	public static final URI VisualArtsEvent;

	/**
	 * Volcano
	 * <p>
	 * {@code http://schema.org/Volcano}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Volcano">Volcano</a>
	 */
	public static final URI Volcano;

	/**
	 * Vote Action
	 * <p>
	 * {@code http://schema.org/VoteAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/VoteAction">VoteAction</a>
	 */
	public static final URI VoteAction;

	/**
	 * Want Action
	 * <p>
	 * {@code http://schema.org/WantAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WantAction">WantAction</a>
	 */
	public static final URI WantAction;

	/**
	 * Warning
	 * <p>
	 * {@code http://schema.org/warning}.
	 * <p>
	 * Any FDA or other warnings about the drug (text or URL).
	 *
	 * @see <a href="http://schema.org/warning">warning</a>
	 */
	public static final URI warning;

	/**
	 * Warranty
	 * <p>
	 * {@code http://schema.org/warranty}.
	 * <p>
	 * The warranty promise(s) included in the offer.
	 *
	 * @see <a href="http://schema.org/warranty">warranty</a>
	 */
	public static final URI warranty;

	/**
	 * Warranty Promise
	 * <p>
	 * {@code http://schema.org/WarrantyPromise}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WarrantyPromise">WarrantyPromise</a>
	 */
	public static final URI WarrantyPromise;

	/**
	 * Warranty Promise
	 * <p>
	 * {@code http://schema.org/warrantyPromise}.
	 * <p>
	 * The warranty promise(s) included in the offer.
	 *
	 * @see <a href="http://schema.org/warrantyPromise">warrantyPromise</a>
	 */
	public static final URI warrantyPromise;

	/**
	 * Warranty Scope
	 * <p>
	 * {@code http://schema.org/WarrantyScope}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WarrantyScope">WarrantyScope</a>
	 */
	public static final URI WarrantyScope;

	/**
	 * Warranty Scope
	 * <p>
	 * {@code http://schema.org/warrantyScope}.
	 * <p>
	 * The scope of the warranty promise.
	 *
	 * @see <a href="http://schema.org/warrantyScope">warrantyScope</a>
	 */
	public static final URI warrantyScope;

	/**
	 * Watch Action
	 * <p>
	 * {@code http://schema.org/WatchAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WatchAction">WatchAction</a>
	 */
	public static final URI WatchAction;

	/**
	 * Waterfall
	 * <p>
	 * {@code http://schema.org/Waterfall}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Waterfall">Waterfall</a>
	 */
	public static final URI Waterfall;

	/**
	 * Wear Action
	 * <p>
	 * {@code http://schema.org/WearAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WearAction">WearAction</a>
	 */
	public static final URI WearAction;

	/**
	 * Web Application
	 * <p>
	 * {@code http://schema.org/WebApplication}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WebApplication">WebApplication</a>
	 */
	public static final URI WebApplication;

	/**
	 * Web Page
	 * <p>
	 * {@code http://schema.org/WebPage}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WebPage">WebPage</a>
	 */
	public static final URI WebPage;

	/**
	 * Web Page Element
	 * <p>
	 * {@code http://schema.org/WebPageElement}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WebPageElement">WebPageElement</a>
	 */
	public static final URI WebPageElement;

	/**
	 * Weight
	 * <p>
	 * {@code http://schema.org/weight}.
	 * <p>
	 * The weight of the product.
	 *
	 * @see <a href="http://schema.org/weight">weight</a>
	 */
	public static final URI weight;

	/**
	 * Wholesale Store
	 * <p>
	 * {@code http://schema.org/WholesaleStore}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WholesaleStore">WholesaleStore</a>
	 */
	public static final URI WholesaleStore;

	/**
	 * Width
	 * <p>
	 * {@code http://schema.org/width}.
	 * <p>
	 * The width of the item.
	 *
	 * @see <a href="http://schema.org/width">width</a>
	 */
	public static final URI width;

	/**
	 * Win Action
	 * <p>
	 * {@code http://schema.org/WinAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WinAction">WinAction</a>
	 */
	public static final URI WinAction;

	/**
	 * Winery
	 * <p>
	 * {@code http://schema.org/Winery}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Winery">Winery</a>
	 */
	public static final URI Winery;

	/**
	 * Winner
	 * <p>
	 * {@code http://schema.org/winner}.
	 * <p>
	 * A sub property of participant. The winner of the action.
	 *
	 * @see <a href="http://schema.org/winner">winner</a>
	 */
	public static final URI winner;

	/**
	 * Word Count
	 * <p>
	 * {@code http://schema.org/wordCount}.
	 * <p>
	 * The number of words in the text of the Article.
	 *
	 * @see <a href="http://schema.org/wordCount">wordCount</a>
	 */
	public static final URI wordCount;

	/**
	 * Work Hours
	 * <p>
	 * {@code http://schema.org/workHours}.
	 * <p>
	 * The typical working hours for this job (e.g. 1st shift, night shift,
	 * 8am-5pm).
	 *
	 * @see <a href="http://schema.org/workHours">workHours</a>
	 */
	public static final URI workHours;

	/**
	 * Workload
	 * <p>
	 * {@code http://schema.org/workload}.
	 * <p>
	 * Quantitative measure of the physiologic output of the exercise; also
	 * referred to as energy expenditure.
	 *
	 * @see <a href="http://schema.org/workload">workload</a>
	 */
	public static final URI workload;

	/**
	 * Work Location
	 * <p>
	 * {@code http://schema.org/workLocation}.
	 * <p>
	 * A contact location for a person's place of work.
	 *
	 * @see <a href="http://schema.org/workLocation">workLocation</a>
	 */
	public static final URI workLocation;

	/**
	 * Works for
	 * <p>
	 * {@code http://schema.org/worksFor}.
	 * <p>
	 * Organizations that the person works for.
	 *
	 * @see <a href="http://schema.org/worksFor">worksFor</a>
	 */
	public static final URI worksFor;

	/**
	 * Worst Rating
	 * <p>
	 * {@code http://schema.org/worstRating}.
	 * <p>
	 * The lowest value allowed in this rating system. If worstRating is
	 * omitted, 1 is assumed.
	 *
	 * @see <a href="http://schema.org/worstRating">worstRating</a>
	 */
	public static final URI worstRating;

	/**
	 * WP Ad Block
	 * <p>
	 * {@code http://schema.org/WPAdBlock}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WPAdBlock">WPAdBlock</a>
	 */
	public static final URI WPAdBlock;

	/**
	 * WP Footer
	 * <p>
	 * {@code http://schema.org/WPFooter}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WPFooter">WPFooter</a>
	 */
	public static final URI WPFooter;

	/**
	 * WP Header
	 * <p>
	 * {@code http://schema.org/WPHeader}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WPHeader">WPHeader</a>
	 */
	public static final URI WPHeader;

	/**
	 * WP Side Bar
	 * <p>
	 * {@code http://schema.org/WPSideBar}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WPSideBar">WPSideBar</a>
	 */
	public static final URI WPSideBar;

	/**
	 * Write Action
	 * <p>
	 * {@code http://schema.org/WriteAction}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/WriteAction">WriteAction</a>
	 */
	public static final URI WriteAction;

	/**
	 * Yearly Revenue
	 * <p>
	 * {@code http://schema.org/yearlyRevenue}.
	 * <p>
	 * The size of the business in annual revenue.
	 *
	 * @see <a href="http://schema.org/yearlyRevenue">yearlyRevenue</a>
	 */
	public static final URI yearlyRevenue;

	/**
	 * Years in Operation
	 * <p>
	 * {@code http://schema.org/yearsInOperation}.
	 * <p>
	 * The age of the business.
	 *
	 * @see <a href="http://schema.org/yearsInOperation">yearsInOperation</a>
	 */
	public static final URI yearsInOperation;

	/**
	 * Zoo
	 * <p>
	 * {@code http://schema.org/Zoo}.
	 * <p>
	 * 
	 *
	 * @see <a href="http://schema.org/Zoo">Zoo</a>
	 */
	public static final URI Zoo;

	static {
		ValueFactory factory = ValueFactoryImpl.getInstance();

		about = factory.createURI(SCHEMA.NAMESPACE, "about");
		AboutPage = factory.createURI(SCHEMA.NAMESPACE, "AboutPage");
		AcceptAction = factory.createURI(SCHEMA.NAMESPACE, "AcceptAction");
		acceptedOffer = factory.createURI(SCHEMA.NAMESPACE, "acceptedOffer");
		acceptedPaymentMethod = factory.createURI(SCHEMA.NAMESPACE, "acceptedPaymentMethod");
		acceptsReservations = factory.createURI(SCHEMA.NAMESPACE, "acceptsReservations");
		accessCode = factory.createURI(SCHEMA.NAMESPACE, "accessCode");
		accessibilityAPI = factory.createURI(SCHEMA.NAMESPACE, "accessibilityAPI");
		accessibilityControl = factory.createURI(SCHEMA.NAMESPACE, "accessibilityControl");
		accessibilityFeature = factory.createURI(SCHEMA.NAMESPACE, "accessibilityFeature");
		accessibilityHazard = factory.createURI(SCHEMA.NAMESPACE, "accessibilityHazard");
		accountablePerson = factory.createURI(SCHEMA.NAMESPACE, "accountablePerson");
		AccountingService = factory.createURI(SCHEMA.NAMESPACE, "AccountingService");
		AchieveAction = factory.createURI(SCHEMA.NAMESPACE, "AchieveAction");
		acquiredFrom = factory.createURI(SCHEMA.NAMESPACE, "acquiredFrom");
		action = factory.createURI(SCHEMA.NAMESPACE, "action");
		Action = factory.createURI(SCHEMA.NAMESPACE, "Action");
		activeIngredient = factory.createURI(SCHEMA.NAMESPACE, "activeIngredient");
		activityDuration = factory.createURI(SCHEMA.NAMESPACE, "activityDuration");
		activityFrequency = factory.createURI(SCHEMA.NAMESPACE, "activityFrequency");
		actor = factory.createURI(SCHEMA.NAMESPACE, "actor");
		actors = factory.createURI(SCHEMA.NAMESPACE, "actors");
		AddAction = factory.createURI(SCHEMA.NAMESPACE, "AddAction");
		additionalName = factory.createURI(SCHEMA.NAMESPACE, "additionalName");
		additionalType = factory.createURI(SCHEMA.NAMESPACE, "additionalType");
		additionalVariable = factory.createURI(SCHEMA.NAMESPACE, "additionalVariable");
		addOn = factory.createURI(SCHEMA.NAMESPACE, "addOn");
		address = factory.createURI(SCHEMA.NAMESPACE, "address");
		addressCountry = factory.createURI(SCHEMA.NAMESPACE, "addressCountry");
		addressLocality = factory.createURI(SCHEMA.NAMESPACE, "addressLocality");
		addressRegion = factory.createURI(SCHEMA.NAMESPACE, "addressRegion");
		administrationRoute = factory.createURI(SCHEMA.NAMESPACE, "administrationRoute");
		AdministrativeArea = factory.createURI(SCHEMA.NAMESPACE, "AdministrativeArea");
		AdultEntertainment = factory.createURI(SCHEMA.NAMESPACE, "AdultEntertainment");
		advanceBookingRequirement = factory.createURI(SCHEMA.NAMESPACE, "advanceBookingRequirement");
		adverseOutcome = factory.createURI(SCHEMA.NAMESPACE, "adverseOutcome");
		affectedBy = factory.createURI(SCHEMA.NAMESPACE, "affectedBy");
		affiliation = factory.createURI(SCHEMA.NAMESPACE, "affiliation");
		agent = factory.createURI(SCHEMA.NAMESPACE, "agent");
		AggregateOffer = factory.createURI(SCHEMA.NAMESPACE, "AggregateOffer");
		aggregateRating = factory.createURI(SCHEMA.NAMESPACE, "aggregateRating");
		AggregateRating = factory.createURI(SCHEMA.NAMESPACE, "AggregateRating");
		AgreeAction = factory.createURI(SCHEMA.NAMESPACE, "AgreeAction");
		Airport = factory.createURI(SCHEMA.NAMESPACE, "Airport");
		album = factory.createURI(SCHEMA.NAMESPACE, "album");
		albums = factory.createURI(SCHEMA.NAMESPACE, "albums");
		alcoholWarning = factory.createURI(SCHEMA.NAMESPACE, "alcoholWarning");
		algorithm = factory.createURI(SCHEMA.NAMESPACE, "algorithm");
		AlignmentObject = factory.createURI(SCHEMA.NAMESPACE, "AlignmentObject");
		alignmentType = factory.createURI(SCHEMA.NAMESPACE, "alignmentType");
		AllocateAction = factory.createURI(SCHEMA.NAMESPACE, "AllocateAction");
		alternateName = factory.createURI(SCHEMA.NAMESPACE, "alternateName");
		alternativeHeadline = factory.createURI(SCHEMA.NAMESPACE, "alternativeHeadline");
		alumni = factory.createURI(SCHEMA.NAMESPACE, "alumni");
		alumniOf = factory.createURI(SCHEMA.NAMESPACE, "alumniOf");
		amountOfThisGood = factory.createURI(SCHEMA.NAMESPACE, "amountOfThisGood");
		AmusementPark = factory.createURI(SCHEMA.NAMESPACE, "AmusementPark");
		AnatomicalStructure = factory.createURI(SCHEMA.NAMESPACE, "AnatomicalStructure");
		AnatomicalSystem = factory.createURI(SCHEMA.NAMESPACE, "AnatomicalSystem");
		AnimalShelter = factory.createURI(SCHEMA.NAMESPACE, "AnimalShelter");
		antagonist = factory.createURI(SCHEMA.NAMESPACE, "antagonist");
		ApartmentComplex = factory.createURI(SCHEMA.NAMESPACE, "ApartmentComplex");
		APIReference = factory.createURI(SCHEMA.NAMESPACE, "APIReference");
		AppendAction = factory.createURI(SCHEMA.NAMESPACE, "AppendAction");
		applicableLocation = factory.createURI(SCHEMA.NAMESPACE, "applicableLocation");
		applicationCategory = factory.createURI(SCHEMA.NAMESPACE, "applicationCategory");
		applicationSubCategory = factory.createURI(SCHEMA.NAMESPACE, "applicationSubCategory");
		applicationSuite = factory.createURI(SCHEMA.NAMESPACE, "applicationSuite");
		appliesToDeliveryMethod = factory.createURI(SCHEMA.NAMESPACE, "appliesToDeliveryMethod");
		appliesToPaymentMethod = factory.createURI(SCHEMA.NAMESPACE, "appliesToPaymentMethod");
		ApplyAction = factory.createURI(SCHEMA.NAMESPACE, "ApplyAction");
		ApprovedIndication = factory.createURI(SCHEMA.NAMESPACE, "ApprovedIndication");
		Aquarium = factory.createURI(SCHEMA.NAMESPACE, "Aquarium");
		area = factory.createURI(SCHEMA.NAMESPACE, "area");
		areaServed = factory.createURI(SCHEMA.NAMESPACE, "areaServed");
		ArriveAction = factory.createURI(SCHEMA.NAMESPACE, "ArriveAction");
		arterialBranch = factory.createURI(SCHEMA.NAMESPACE, "arterialBranch");
		Artery = factory.createURI(SCHEMA.NAMESPACE, "Artery");
		ArtGallery = factory.createURI(SCHEMA.NAMESPACE, "ArtGallery");
		Article = factory.createURI(SCHEMA.NAMESPACE, "Article");
		articleBody = factory.createURI(SCHEMA.NAMESPACE, "articleBody");
		articleSection = factory.createURI(SCHEMA.NAMESPACE, "articleSection");
		AskAction = factory.createURI(SCHEMA.NAMESPACE, "AskAction");
		aspect = factory.createURI(SCHEMA.NAMESPACE, "aspect");
		assembly = factory.createURI(SCHEMA.NAMESPACE, "assembly");
		assemblyVersion = factory.createURI(SCHEMA.NAMESPACE, "assemblyVersion");
		AssessAction = factory.createURI(SCHEMA.NAMESPACE, "AssessAction");
		AssignAction = factory.createURI(SCHEMA.NAMESPACE, "AssignAction");
		associatedAnatomy = factory.createURI(SCHEMA.NAMESPACE, "associatedAnatomy");
		associatedArticle = factory.createURI(SCHEMA.NAMESPACE, "associatedArticle");
		associatedMedia = factory.createURI(SCHEMA.NAMESPACE, "associatedMedia");
		associatedPathophysiology = factory.createURI(SCHEMA.NAMESPACE, "associatedPathophysiology");
		attendee = factory.createURI(SCHEMA.NAMESPACE, "attendee");
		attendees = factory.createURI(SCHEMA.NAMESPACE, "attendees");
		Attorney = factory.createURI(SCHEMA.NAMESPACE, "Attorney");
		audience = factory.createURI(SCHEMA.NAMESPACE, "audience");
		Audience = factory.createURI(SCHEMA.NAMESPACE, "Audience");
		audienceType = factory.createURI(SCHEMA.NAMESPACE, "audienceType");
		audio = factory.createURI(SCHEMA.NAMESPACE, "audio");
		AudioObject = factory.createURI(SCHEMA.NAMESPACE, "AudioObject");
		author = factory.createURI(SCHEMA.NAMESPACE, "author");
		AuthorizeAction = factory.createURI(SCHEMA.NAMESPACE, "AuthorizeAction");
		AutoBodyShop = factory.createURI(SCHEMA.NAMESPACE, "AutoBodyShop");
		AutoDealer = factory.createURI(SCHEMA.NAMESPACE, "AutoDealer");
		AutomatedTeller = factory.createURI(SCHEMA.NAMESPACE, "AutomatedTeller");
		AutomotiveBusiness = factory.createURI(SCHEMA.NAMESPACE, "AutomotiveBusiness");
		AutoPartsStore = factory.createURI(SCHEMA.NAMESPACE, "AutoPartsStore");
		AutoRental = factory.createURI(SCHEMA.NAMESPACE, "AutoRental");
		AutoRepair = factory.createURI(SCHEMA.NAMESPACE, "AutoRepair");
		AutoWash = factory.createURI(SCHEMA.NAMESPACE, "AutoWash");
		availability = factory.createURI(SCHEMA.NAMESPACE, "availability");
		availabilityEnds = factory.createURI(SCHEMA.NAMESPACE, "availabilityEnds");
		availabilityStarts = factory.createURI(SCHEMA.NAMESPACE, "availabilityStarts");
		availableAtOrFrom = factory.createURI(SCHEMA.NAMESPACE, "availableAtOrFrom");
		availableChannel = factory.createURI(SCHEMA.NAMESPACE, "availableChannel");
		availableDeliveryMethod = factory.createURI(SCHEMA.NAMESPACE, "availableDeliveryMethod");
		availableFrom = factory.createURI(SCHEMA.NAMESPACE, "availableFrom");
		availableIn = factory.createURI(SCHEMA.NAMESPACE, "availableIn");
		availableLanguage = factory.createURI(SCHEMA.NAMESPACE, "availableLanguage");
		availableService = factory.createURI(SCHEMA.NAMESPACE, "availableService");
		availableStrength = factory.createURI(SCHEMA.NAMESPACE, "availableStrength");
		availableTest = factory.createURI(SCHEMA.NAMESPACE, "availableTest");
		availableThrough = factory.createURI(SCHEMA.NAMESPACE, "availableThrough");
		award = factory.createURI(SCHEMA.NAMESPACE, "award");
		awards = factory.createURI(SCHEMA.NAMESPACE, "awards");
		background = factory.createURI(SCHEMA.NAMESPACE, "background");
		Bakery = factory.createURI(SCHEMA.NAMESPACE, "Bakery");
		BankOrCreditUnion = factory.createURI(SCHEMA.NAMESPACE, "BankOrCreditUnion");
		BarOrPub = factory.createURI(SCHEMA.NAMESPACE, "BarOrPub");
		baseSalary = factory.createURI(SCHEMA.NAMESPACE, "baseSalary");
		Beach = factory.createURI(SCHEMA.NAMESPACE, "Beach");
		BeautySalon = factory.createURI(SCHEMA.NAMESPACE, "BeautySalon");
		BedAndBreakfast = factory.createURI(SCHEMA.NAMESPACE, "BedAndBreakfast");
		BefriendAction = factory.createURI(SCHEMA.NAMESPACE, "BefriendAction");
		benefits = factory.createURI(SCHEMA.NAMESPACE, "benefits");
		bestRating = factory.createURI(SCHEMA.NAMESPACE, "bestRating");
		BikeStore = factory.createURI(SCHEMA.NAMESPACE, "BikeStore");
		billingAddress = factory.createURI(SCHEMA.NAMESPACE, "billingAddress");
		billingIncrement = factory.createURI(SCHEMA.NAMESPACE, "billingIncrement");
		biomechnicalClass = factory.createURI(SCHEMA.NAMESPACE, "biomechnicalClass");
		birthDate = factory.createURI(SCHEMA.NAMESPACE, "birthDate");
		bitrate = factory.createURI(SCHEMA.NAMESPACE, "bitrate");
		Blog = factory.createURI(SCHEMA.NAMESPACE, "Blog");
		blogPost = factory.createURI(SCHEMA.NAMESPACE, "blogPost");
		BlogPosting = factory.createURI(SCHEMA.NAMESPACE, "BlogPosting");
		blogPosts = factory.createURI(SCHEMA.NAMESPACE, "blogPosts");
		bloodSupply = factory.createURI(SCHEMA.NAMESPACE, "bloodSupply");
		BloodTest = factory.createURI(SCHEMA.NAMESPACE, "BloodTest");
		bodyLocation = factory.createURI(SCHEMA.NAMESPACE, "bodyLocation");
		BodyOfWater = factory.createURI(SCHEMA.NAMESPACE, "BodyOfWater");
		Bone = factory.createURI(SCHEMA.NAMESPACE, "Bone");
		Book = factory.createURI(SCHEMA.NAMESPACE, "Book");
		bookEdition = factory.createURI(SCHEMA.NAMESPACE, "bookEdition");
		bookFormat = factory.createURI(SCHEMA.NAMESPACE, "bookFormat");
		BookFormatType = factory.createURI(SCHEMA.NAMESPACE, "BookFormatType");
		BookmarkAction = factory.createURI(SCHEMA.NAMESPACE, "BookmarkAction");
		BookStore = factory.createURI(SCHEMA.NAMESPACE, "BookStore");
		BorrowAction = factory.createURI(SCHEMA.NAMESPACE, "BorrowAction");
		borrower = factory.createURI(SCHEMA.NAMESPACE, "borrower");
		BowlingAlley = factory.createURI(SCHEMA.NAMESPACE, "BowlingAlley");
		box = factory.createURI(SCHEMA.NAMESPACE, "box");
		BrainStructure = factory.createURI(SCHEMA.NAMESPACE, "BrainStructure");
		branch = factory.createURI(SCHEMA.NAMESPACE, "branch");
		branchOf = factory.createURI(SCHEMA.NAMESPACE, "branchOf");
		Brand = factory.createURI(SCHEMA.NAMESPACE, "Brand");
		brand = factory.createURI(SCHEMA.NAMESPACE, "brand");
		breadcrumb = factory.createURI(SCHEMA.NAMESPACE, "breadcrumb");
		breastfeedingWarning = factory.createURI(SCHEMA.NAMESPACE, "breastfeedingWarning");
		Brewery = factory.createURI(SCHEMA.NAMESPACE, "Brewery");
		broadcaster = factory.createURI(SCHEMA.NAMESPACE, "broadcaster");
		BroadcastEvent = factory.createURI(SCHEMA.NAMESPACE, "BroadcastEvent");
		BroadcastService = factory.createURI(SCHEMA.NAMESPACE, "BroadcastService");
		browserRequirements = factory.createURI(SCHEMA.NAMESPACE, "browserRequirements");
		BuddhistTemple = factory.createURI(SCHEMA.NAMESPACE, "BuddhistTemple");
		BusinessAudience = factory.createURI(SCHEMA.NAMESPACE, "BusinessAudience");
		BusinessEntityType = factory.createURI(SCHEMA.NAMESPACE, "BusinessEntityType");
		BusinessEvent = factory.createURI(SCHEMA.NAMESPACE, "BusinessEvent");
		businessFunction = factory.createURI(SCHEMA.NAMESPACE, "businessFunction");
		BusinessFunction = factory.createURI(SCHEMA.NAMESPACE, "BusinessFunction");
		BusStation = factory.createURI(SCHEMA.NAMESPACE, "BusStation");
		BusStop = factory.createURI(SCHEMA.NAMESPACE, "BusStop");
		BuyAction = factory.createURI(SCHEMA.NAMESPACE, "BuyAction");
		buyer = factory.createURI(SCHEMA.NAMESPACE, "buyer");
		byArtist = factory.createURI(SCHEMA.NAMESPACE, "byArtist");
		CafeOrCoffeeShop = factory.createURI(SCHEMA.NAMESPACE, "CafeOrCoffeeShop");
		calories = factory.createURI(SCHEMA.NAMESPACE, "calories");
		Campground = factory.createURI(SCHEMA.NAMESPACE, "Campground");
		Canal = factory.createURI(SCHEMA.NAMESPACE, "Canal");
		CancelAction = factory.createURI(SCHEMA.NAMESPACE, "CancelAction");
		candidate = factory.createURI(SCHEMA.NAMESPACE, "candidate");
		caption = factory.createURI(SCHEMA.NAMESPACE, "caption");
		carbohydrateContent = factory.createURI(SCHEMA.NAMESPACE, "carbohydrateContent");
		carrier = factory.createURI(SCHEMA.NAMESPACE, "carrier");
		carrierRequirements = factory.createURI(SCHEMA.NAMESPACE, "carrierRequirements");
		Casino = factory.createURI(SCHEMA.NAMESPACE, "Casino");
		catalog = factory.createURI(SCHEMA.NAMESPACE, "catalog");
		category = factory.createURI(SCHEMA.NAMESPACE, "category");
		CatholicChurch = factory.createURI(SCHEMA.NAMESPACE, "CatholicChurch");
		cause = factory.createURI(SCHEMA.NAMESPACE, "cause");
		causeOf = factory.createURI(SCHEMA.NAMESPACE, "causeOf");
		Cemetery = factory.createURI(SCHEMA.NAMESPACE, "Cemetery");
		CheckAction = factory.createURI(SCHEMA.NAMESPACE, "CheckAction");
		CheckInAction = factory.createURI(SCHEMA.NAMESPACE, "CheckInAction");
		CheckOutAction = factory.createURI(SCHEMA.NAMESPACE, "CheckOutAction");
		CheckoutPage = factory.createURI(SCHEMA.NAMESPACE, "CheckoutPage");
		ChildCare = factory.createURI(SCHEMA.NAMESPACE, "ChildCare");
		childMaxAge = factory.createURI(SCHEMA.NAMESPACE, "childMaxAge");
		childMinAge = factory.createURI(SCHEMA.NAMESPACE, "childMinAge");
		children = factory.createURI(SCHEMA.NAMESPACE, "children");
		ChildrensEvent = factory.createURI(SCHEMA.NAMESPACE, "ChildrensEvent");
		cholesterolContent = factory.createURI(SCHEMA.NAMESPACE, "cholesterolContent");
		ChooseAction = factory.createURI(SCHEMA.NAMESPACE, "ChooseAction");
		Church = factory.createURI(SCHEMA.NAMESPACE, "Church");
		circle = factory.createURI(SCHEMA.NAMESPACE, "circle");
		citation = factory.createURI(SCHEMA.NAMESPACE, "citation");
		City = factory.createURI(SCHEMA.NAMESPACE, "City");
		CityHall = factory.createURI(SCHEMA.NAMESPACE, "CityHall");
		CivicStructure = factory.createURI(SCHEMA.NAMESPACE, "CivicStructure");
		Class = factory.createURI(SCHEMA.NAMESPACE, "Class");
		clincalPharmacology = factory.createURI(SCHEMA.NAMESPACE, "clincalPharmacology");
		Clip = factory.createURI(SCHEMA.NAMESPACE, "Clip");
		clipNumber = factory.createURI(SCHEMA.NAMESPACE, "clipNumber");
		closes = factory.createURI(SCHEMA.NAMESPACE, "closes");
		ClothingStore = factory.createURI(SCHEMA.NAMESPACE, "ClothingStore");
		Code = factory.createURI(SCHEMA.NAMESPACE, "Code");
		code = factory.createURI(SCHEMA.NAMESPACE, "code");
		codeRepository = factory.createURI(SCHEMA.NAMESPACE, "codeRepository");
		codeValue = factory.createURI(SCHEMA.NAMESPACE, "codeValue");
		codingSystem = factory.createURI(SCHEMA.NAMESPACE, "codingSystem");
		colleague = factory.createURI(SCHEMA.NAMESPACE, "colleague");
		colleagues = factory.createURI(SCHEMA.NAMESPACE, "colleagues");
		collection = factory.createURI(SCHEMA.NAMESPACE, "collection");
		CollectionPage = factory.createURI(SCHEMA.NAMESPACE, "CollectionPage");
		CollegeOrUniversity = factory.createURI(SCHEMA.NAMESPACE, "CollegeOrUniversity");
		color = factory.createURI(SCHEMA.NAMESPACE, "color");
		ComedyClub = factory.createURI(SCHEMA.NAMESPACE, "ComedyClub");
		ComedyEvent = factory.createURI(SCHEMA.NAMESPACE, "ComedyEvent");
		Comment = factory.createURI(SCHEMA.NAMESPACE, "Comment");
		comment = factory.createURI(SCHEMA.NAMESPACE, "comment");
		CommentAction = factory.createURI(SCHEMA.NAMESPACE, "CommentAction");
		commentText = factory.createURI(SCHEMA.NAMESPACE, "commentText");
		commentTime = factory.createURI(SCHEMA.NAMESPACE, "commentTime");
		CommunicateAction = factory.createURI(SCHEMA.NAMESPACE, "CommunicateAction");
		comprisedOf = factory.createURI(SCHEMA.NAMESPACE, "comprisedOf");
		ComputerStore = factory.createURI(SCHEMA.NAMESPACE, "ComputerStore");
		ConfirmAction = factory.createURI(SCHEMA.NAMESPACE, "ConfirmAction");
		confirmationNumber = factory.createURI(SCHEMA.NAMESPACE, "confirmationNumber");
		connectedTo = factory.createURI(SCHEMA.NAMESPACE, "connectedTo");
		ConsumeAction = factory.createURI(SCHEMA.NAMESPACE, "ConsumeAction");
		contactOption = factory.createURI(SCHEMA.NAMESPACE, "contactOption");
		ContactPage = factory.createURI(SCHEMA.NAMESPACE, "ContactPage");
		ContactPoint = factory.createURI(SCHEMA.NAMESPACE, "ContactPoint");
		contactPoint = factory.createURI(SCHEMA.NAMESPACE, "contactPoint");
		ContactPointOption = factory.createURI(SCHEMA.NAMESPACE, "ContactPointOption");
		contactPoints = factory.createURI(SCHEMA.NAMESPACE, "contactPoints");
		contactType = factory.createURI(SCHEMA.NAMESPACE, "contactType");
		containedIn = factory.createURI(SCHEMA.NAMESPACE, "containedIn");
		contentLocation = factory.createURI(SCHEMA.NAMESPACE, "contentLocation");
		contentRating = factory.createURI(SCHEMA.NAMESPACE, "contentRating");
		contentSize = factory.createURI(SCHEMA.NAMESPACE, "contentSize");
		contentUrl = factory.createURI(SCHEMA.NAMESPACE, "contentUrl");
		Continent = factory.createURI(SCHEMA.NAMESPACE, "Continent");
		contraindication = factory.createURI(SCHEMA.NAMESPACE, "contraindication");
		contributor = factory.createURI(SCHEMA.NAMESPACE, "contributor");
		ConvenienceStore = factory.createURI(SCHEMA.NAMESPACE, "ConvenienceStore");
		CookAction = factory.createURI(SCHEMA.NAMESPACE, "CookAction");
		cookingMethod = factory.createURI(SCHEMA.NAMESPACE, "cookingMethod");
		cookTime = factory.createURI(SCHEMA.NAMESPACE, "cookTime");
		copyrightHolder = factory.createURI(SCHEMA.NAMESPACE, "copyrightHolder");
		copyrightYear = factory.createURI(SCHEMA.NAMESPACE, "copyrightYear");
		Corporation = factory.createURI(SCHEMA.NAMESPACE, "Corporation");
		cost = factory.createURI(SCHEMA.NAMESPACE, "cost");
		costCategory = factory.createURI(SCHEMA.NAMESPACE, "costCategory");
		costCurrency = factory.createURI(SCHEMA.NAMESPACE, "costCurrency");
		costOrigin = factory.createURI(SCHEMA.NAMESPACE, "costOrigin");
		costPerUnit = factory.createURI(SCHEMA.NAMESPACE, "costPerUnit");
		countriesNotSupported = factory.createURI(SCHEMA.NAMESPACE, "countriesNotSupported");
		countriesSupported = factory.createURI(SCHEMA.NAMESPACE, "countriesSupported");
		Country = factory.createURI(SCHEMA.NAMESPACE, "Country");
		course = factory.createURI(SCHEMA.NAMESPACE, "course");
		Courthouse = factory.createURI(SCHEMA.NAMESPACE, "Courthouse");
		CreateAction = factory.createURI(SCHEMA.NAMESPACE, "CreateAction");
		CreativeWork = factory.createURI(SCHEMA.NAMESPACE, "CreativeWork");
		creator = factory.createURI(SCHEMA.NAMESPACE, "creator");
		CreditCard = factory.createURI(SCHEMA.NAMESPACE, "CreditCard");
		Crematorium = factory.createURI(SCHEMA.NAMESPACE, "Crematorium");
		currenciesAccepted = factory.createURI(SCHEMA.NAMESPACE, "currenciesAccepted");
		customer = factory.createURI(SCHEMA.NAMESPACE, "customer");
		DanceEvent = factory.createURI(SCHEMA.NAMESPACE, "DanceEvent");
		DanceGroup = factory.createURI(SCHEMA.NAMESPACE, "DanceGroup");
		DataCatalog = factory.createURI(SCHEMA.NAMESPACE, "DataCatalog");
		DataDownload = factory.createURI(SCHEMA.NAMESPACE, "DataDownload");
		dataset = factory.createURI(SCHEMA.NAMESPACE, "dataset");
		Dataset = factory.createURI(SCHEMA.NAMESPACE, "Dataset");
		dateCreated = factory.createURI(SCHEMA.NAMESPACE, "dateCreated");
		dateline = factory.createURI(SCHEMA.NAMESPACE, "dateline");
		dateModified = factory.createURI(SCHEMA.NAMESPACE, "dateModified");
		datePosted = factory.createURI(SCHEMA.NAMESPACE, "datePosted");
		datePublished = factory.createURI(SCHEMA.NAMESPACE, "datePublished");
		DayOfWeek = factory.createURI(SCHEMA.NAMESPACE, "DayOfWeek");
		dayOfWeek = factory.createURI(SCHEMA.NAMESPACE, "dayOfWeek");
		DaySpa = factory.createURI(SCHEMA.NAMESPACE, "DaySpa");
		DDxElement = factory.createURI(SCHEMA.NAMESPACE, "DDxElement");
		deathDate = factory.createURI(SCHEMA.NAMESPACE, "deathDate");
		DefenceEstablishment = factory.createURI(SCHEMA.NAMESPACE, "DefenceEstablishment");
		DeleteAction = factory.createURI(SCHEMA.NAMESPACE, "DeleteAction");
		deliveryAddress = factory.createURI(SCHEMA.NAMESPACE, "deliveryAddress");
		DeliveryChargeSpecification = factory.createURI(SCHEMA.NAMESPACE, "DeliveryChargeSpecification");
		DeliveryEvent = factory.createURI(SCHEMA.NAMESPACE, "DeliveryEvent");
		deliveryLeadTime = factory.createURI(SCHEMA.NAMESPACE, "deliveryLeadTime");
		DeliveryMethod = factory.createURI(SCHEMA.NAMESPACE, "DeliveryMethod");
		deliveryMethod = factory.createURI(SCHEMA.NAMESPACE, "deliveryMethod");
		deliveryStatus = factory.createURI(SCHEMA.NAMESPACE, "deliveryStatus");
		Demand = factory.createURI(SCHEMA.NAMESPACE, "Demand");
		Dentist = factory.createURI(SCHEMA.NAMESPACE, "Dentist");
		DepartAction = factory.createURI(SCHEMA.NAMESPACE, "DepartAction");
		department = factory.createURI(SCHEMA.NAMESPACE, "department");
		DepartmentStore = factory.createURI(SCHEMA.NAMESPACE, "DepartmentStore");
		dependencies = factory.createURI(SCHEMA.NAMESPACE, "dependencies");
		depth = factory.createURI(SCHEMA.NAMESPACE, "depth");
		description = factory.createURI(SCHEMA.NAMESPACE, "description");
		device = factory.createURI(SCHEMA.NAMESPACE, "device");
		diagnosis = factory.createURI(SCHEMA.NAMESPACE, "diagnosis");
		DiagnosticLab = factory.createURI(SCHEMA.NAMESPACE, "DiagnosticLab");
		DiagnosticProcedure = factory.createURI(SCHEMA.NAMESPACE, "DiagnosticProcedure");
		diagram = factory.createURI(SCHEMA.NAMESPACE, "diagram");
		Diet = factory.createURI(SCHEMA.NAMESPACE, "Diet");
		diet = factory.createURI(SCHEMA.NAMESPACE, "diet");
		DietarySupplement = factory.createURI(SCHEMA.NAMESPACE, "DietarySupplement");
		dietFeatures = factory.createURI(SCHEMA.NAMESPACE, "dietFeatures");
		differentialDiagnosis = factory.createURI(SCHEMA.NAMESPACE, "differentialDiagnosis");
		director = factory.createURI(SCHEMA.NAMESPACE, "director");
		directors = factory.createURI(SCHEMA.NAMESPACE, "directors");
		DisagreeAction = factory.createURI(SCHEMA.NAMESPACE, "DisagreeAction");
		discount = factory.createURI(SCHEMA.NAMESPACE, "discount");
		discountCode = factory.createURI(SCHEMA.NAMESPACE, "discountCode");
		discountCurrency = factory.createURI(SCHEMA.NAMESPACE, "discountCurrency");
		DiscoverAction = factory.createURI(SCHEMA.NAMESPACE, "DiscoverAction");
		discusses = factory.createURI(SCHEMA.NAMESPACE, "discusses");
		discussionUrl = factory.createURI(SCHEMA.NAMESPACE, "discussionUrl");
		DislikeAction = factory.createURI(SCHEMA.NAMESPACE, "DislikeAction");
		distance = factory.createURI(SCHEMA.NAMESPACE, "distance");
		Distance = factory.createURI(SCHEMA.NAMESPACE, "Distance");
		distinguishingSign = factory.createURI(SCHEMA.NAMESPACE, "distinguishingSign");
		distribution = factory.createURI(SCHEMA.NAMESPACE, "distribution");
		domainIncludes = factory.createURI(SCHEMA.NAMESPACE, "domainIncludes");
		DonateAction = factory.createURI(SCHEMA.NAMESPACE, "DonateAction");
		doorTime = factory.createURI(SCHEMA.NAMESPACE, "doorTime");
		dosageForm = factory.createURI(SCHEMA.NAMESPACE, "dosageForm");
		DoseSchedule = factory.createURI(SCHEMA.NAMESPACE, "DoseSchedule");
		doseSchedule = factory.createURI(SCHEMA.NAMESPACE, "doseSchedule");
		doseUnit = factory.createURI(SCHEMA.NAMESPACE, "doseUnit");
		doseValue = factory.createURI(SCHEMA.NAMESPACE, "doseValue");
		DownloadAction = factory.createURI(SCHEMA.NAMESPACE, "DownloadAction");
		downloadUrl = factory.createURI(SCHEMA.NAMESPACE, "downloadUrl");
		drainsTo = factory.createURI(SCHEMA.NAMESPACE, "drainsTo");
		DrawAction = factory.createURI(SCHEMA.NAMESPACE, "DrawAction");
		DrinkAction = factory.createURI(SCHEMA.NAMESPACE, "DrinkAction");
		Drug = factory.createURI(SCHEMA.NAMESPACE, "Drug");
		drug = factory.createURI(SCHEMA.NAMESPACE, "drug");
		drugClass = factory.createURI(SCHEMA.NAMESPACE, "drugClass");
		DrugClass = factory.createURI(SCHEMA.NAMESPACE, "DrugClass");
		DrugCost = factory.createURI(SCHEMA.NAMESPACE, "DrugCost");
		DrugCostCategory = factory.createURI(SCHEMA.NAMESPACE, "DrugCostCategory");
		DrugLegalStatus = factory.createURI(SCHEMA.NAMESPACE, "DrugLegalStatus");
		DrugPregnancyCategory = factory.createURI(SCHEMA.NAMESPACE, "DrugPregnancyCategory");
		DrugPrescriptionStatus = factory.createURI(SCHEMA.NAMESPACE, "DrugPrescriptionStatus");
		DrugStrength = factory.createURI(SCHEMA.NAMESPACE, "DrugStrength");
		drugUnit = factory.createURI(SCHEMA.NAMESPACE, "drugUnit");
		DryCleaningOrLaundry = factory.createURI(SCHEMA.NAMESPACE, "DryCleaningOrLaundry");
		duns = factory.createURI(SCHEMA.NAMESPACE, "duns");
		duplicateTherapy = factory.createURI(SCHEMA.NAMESPACE, "duplicateTherapy");
		Duration = factory.createURI(SCHEMA.NAMESPACE, "Duration");
		duration = factory.createURI(SCHEMA.NAMESPACE, "duration");
		durationOfWarranty = factory.createURI(SCHEMA.NAMESPACE, "durationOfWarranty");
		EatAction = factory.createURI(SCHEMA.NAMESPACE, "EatAction");
		editor = factory.createURI(SCHEMA.NAMESPACE, "editor");
		educationalAlignment = factory.createURI(SCHEMA.NAMESPACE, "educationalAlignment");
		EducationalAudience = factory.createURI(SCHEMA.NAMESPACE, "EducationalAudience");
		educationalFramework = factory.createURI(SCHEMA.NAMESPACE, "educationalFramework");
		EducationalOrganization = factory.createURI(SCHEMA.NAMESPACE, "EducationalOrganization");
		educationalRole = factory.createURI(SCHEMA.NAMESPACE, "educationalRole");
		educationalUse = factory.createURI(SCHEMA.NAMESPACE, "educationalUse");
		EducationEvent = factory.createURI(SCHEMA.NAMESPACE, "EducationEvent");
		educationRequirements = factory.createURI(SCHEMA.NAMESPACE, "educationRequirements");
		Electrician = factory.createURI(SCHEMA.NAMESPACE, "Electrician");
		ElectronicsStore = factory.createURI(SCHEMA.NAMESPACE, "ElectronicsStore");
		ElementarySchool = factory.createURI(SCHEMA.NAMESPACE, "ElementarySchool");
		elevation = factory.createURI(SCHEMA.NAMESPACE, "elevation");
		eligibleCustomerType = factory.createURI(SCHEMA.NAMESPACE, "eligibleCustomerType");
		eligibleDuration = factory.createURI(SCHEMA.NAMESPACE, "eligibleDuration");
		eligibleQuantity = factory.createURI(SCHEMA.NAMESPACE, "eligibleQuantity");
		eligibleRegion = factory.createURI(SCHEMA.NAMESPACE, "eligibleRegion");
		eligibleTransactionVolume = factory.createURI(SCHEMA.NAMESPACE, "eligibleTransactionVolume");
		email = factory.createURI(SCHEMA.NAMESPACE, "email");
		Embassy = factory.createURI(SCHEMA.NAMESPACE, "Embassy");
		embedUrl = factory.createURI(SCHEMA.NAMESPACE, "embedUrl");
		EmergencyService = factory.createURI(SCHEMA.NAMESPACE, "EmergencyService");
		employee = factory.createURI(SCHEMA.NAMESPACE, "employee");
		employees = factory.createURI(SCHEMA.NAMESPACE, "employees");
		EmploymentAgency = factory.createURI(SCHEMA.NAMESPACE, "EmploymentAgency");
		employmentType = factory.createURI(SCHEMA.NAMESPACE, "employmentType");
		encodesCreativeWork = factory.createURI(SCHEMA.NAMESPACE, "encodesCreativeWork");
		encoding = factory.createURI(SCHEMA.NAMESPACE, "encoding");
		encodingFormat = factory.createURI(SCHEMA.NAMESPACE, "encodingFormat");
		encodings = factory.createURI(SCHEMA.NAMESPACE, "encodings");
		endDate = factory.createURI(SCHEMA.NAMESPACE, "endDate");
		EndorseAction = factory.createURI(SCHEMA.NAMESPACE, "EndorseAction");
		endorsee = factory.createURI(SCHEMA.NAMESPACE, "endorsee");
		endorsers = factory.createURI(SCHEMA.NAMESPACE, "endorsers");
		endTime = factory.createURI(SCHEMA.NAMESPACE, "endTime");
		Energy = factory.createURI(SCHEMA.NAMESPACE, "Energy");
		entertainmentBusiness = factory.createURI(SCHEMA.NAMESPACE, "entertainmentBusiness");
		EntertainmentBusiness = factory.createURI(SCHEMA.NAMESPACE, "EntertainmentBusiness");
		Enumeration = factory.createURI(SCHEMA.NAMESPACE, "Enumeration");
		epidemiology = factory.createURI(SCHEMA.NAMESPACE, "epidemiology");
		Episode = factory.createURI(SCHEMA.NAMESPACE, "Episode");
		episode = factory.createURI(SCHEMA.NAMESPACE, "episode");
		episodeNumber = factory.createURI(SCHEMA.NAMESPACE, "episodeNumber");
		episodes = factory.createURI(SCHEMA.NAMESPACE, "episodes");
		equal = factory.createURI(SCHEMA.NAMESPACE, "equal");
		estimatesRiskOf = factory.createURI(SCHEMA.NAMESPACE, "estimatesRiskOf");
		Event = factory.createURI(SCHEMA.NAMESPACE, "Event");
		event = factory.createURI(SCHEMA.NAMESPACE, "event");
		events = factory.createURI(SCHEMA.NAMESPACE, "events");
		eventStatus = factory.createURI(SCHEMA.NAMESPACE, "eventStatus");
		EventStatusType = factory.createURI(SCHEMA.NAMESPACE, "EventStatusType");
		EventVenue = factory.createURI(SCHEMA.NAMESPACE, "EventVenue");
		evidenceLevel = factory.createURI(SCHEMA.NAMESPACE, "evidenceLevel");
		evidenceOrigin = factory.createURI(SCHEMA.NAMESPACE, "evidenceOrigin");
		ExerciseAction = factory.createURI(SCHEMA.NAMESPACE, "ExerciseAction");
		ExerciseGym = factory.createURI(SCHEMA.NAMESPACE, "ExerciseGym");
		exercisePlan = factory.createURI(SCHEMA.NAMESPACE, "exercisePlan");
		ExercisePlan = factory.createURI(SCHEMA.NAMESPACE, "ExercisePlan");
		exerciseType = factory.createURI(SCHEMA.NAMESPACE, "exerciseType");
		exifData = factory.createURI(SCHEMA.NAMESPACE, "exifData");
		expectedArrivalFrom = factory.createURI(SCHEMA.NAMESPACE, "expectedArrivalFrom");
		expectedArrivalUntil = factory.createURI(SCHEMA.NAMESPACE, "expectedArrivalUntil");
		expectedPrognosis = factory.createURI(SCHEMA.NAMESPACE, "expectedPrognosis");
		experienceRequirements = factory.createURI(SCHEMA.NAMESPACE, "experienceRequirements");
		expertConsiderations = factory.createURI(SCHEMA.NAMESPACE, "expertConsiderations");
		expires = factory.createURI(SCHEMA.NAMESPACE, "expires");
		familyName = factory.createURI(SCHEMA.NAMESPACE, "familyName");
		FastFoodRestaurant = factory.createURI(SCHEMA.NAMESPACE, "FastFoodRestaurant");
		fatContent = factory.createURI(SCHEMA.NAMESPACE, "fatContent");
		faxNumber = factory.createURI(SCHEMA.NAMESPACE, "faxNumber");
		featureList = factory.createURI(SCHEMA.NAMESPACE, "featureList");
		Festival = factory.createURI(SCHEMA.NAMESPACE, "Festival");
		fiberContent = factory.createURI(SCHEMA.NAMESPACE, "fiberContent");
		fileFormat = factory.createURI(SCHEMA.NAMESPACE, "fileFormat");
		fileSize = factory.createURI(SCHEMA.NAMESPACE, "fileSize");
		FilmAction = factory.createURI(SCHEMA.NAMESPACE, "FilmAction");
		FinancialService = factory.createURI(SCHEMA.NAMESPACE, "FinancialService");
		FindAction = factory.createURI(SCHEMA.NAMESPACE, "FindAction");
		FireStation = factory.createURI(SCHEMA.NAMESPACE, "FireStation");
		Florist = factory.createURI(SCHEMA.NAMESPACE, "Florist");
		FollowAction = factory.createURI(SCHEMA.NAMESPACE, "FollowAction");
		followee = factory.createURI(SCHEMA.NAMESPACE, "followee");
		follows = factory.createURI(SCHEMA.NAMESPACE, "follows");
		followup = factory.createURI(SCHEMA.NAMESPACE, "followup");
		FoodEstablishment = factory.createURI(SCHEMA.NAMESPACE, "FoodEstablishment");
		foodEstablishment = factory.createURI(SCHEMA.NAMESPACE, "foodEstablishment");
		FoodEvent = factory.createURI(SCHEMA.NAMESPACE, "FoodEvent");
		foodEvent = factory.createURI(SCHEMA.NAMESPACE, "foodEvent");
		foodWarning = factory.createURI(SCHEMA.NAMESPACE, "foodWarning");
		founder = factory.createURI(SCHEMA.NAMESPACE, "founder");
		founders = factory.createURI(SCHEMA.NAMESPACE, "founders");
		foundingDate = factory.createURI(SCHEMA.NAMESPACE, "foundingDate");
		free = factory.createURI(SCHEMA.NAMESPACE, "free");
		frequency = factory.createURI(SCHEMA.NAMESPACE, "frequency");
		fromLocation = factory.createURI(SCHEMA.NAMESPACE, "fromLocation");
		function = factory.createURI(SCHEMA.NAMESPACE, "function");
		functionalClass = factory.createURI(SCHEMA.NAMESPACE, "functionalClass");
		FurnitureStore = factory.createURI(SCHEMA.NAMESPACE, "FurnitureStore");
		GardenStore = factory.createURI(SCHEMA.NAMESPACE, "GardenStore");
		GasStation = factory.createURI(SCHEMA.NAMESPACE, "GasStation");
		GatedResidenceCommunity = factory.createURI(SCHEMA.NAMESPACE, "GatedResidenceCommunity");
		gender = factory.createURI(SCHEMA.NAMESPACE, "gender");
		GeneralContractor = factory.createURI(SCHEMA.NAMESPACE, "GeneralContractor");
		genre = factory.createURI(SCHEMA.NAMESPACE, "genre");
		geo = factory.createURI(SCHEMA.NAMESPACE, "geo");
		GeoCoordinates = factory.createURI(SCHEMA.NAMESPACE, "GeoCoordinates");
		geographicArea = factory.createURI(SCHEMA.NAMESPACE, "geographicArea");
		GeoShape = factory.createURI(SCHEMA.NAMESPACE, "GeoShape");
		GiveAction = factory.createURI(SCHEMA.NAMESPACE, "GiveAction");
		givenName = factory.createURI(SCHEMA.NAMESPACE, "givenName");
		globalLocationNumber = factory.createURI(SCHEMA.NAMESPACE, "globalLocationNumber");
		GolfCourse = factory.createURI(SCHEMA.NAMESPACE, "GolfCourse");
		GovernmentBuilding = factory.createURI(SCHEMA.NAMESPACE, "GovernmentBuilding");
		GovernmentOffice = factory.createURI(SCHEMA.NAMESPACE, "GovernmentOffice");
		GovernmentOrganization = factory.createURI(SCHEMA.NAMESPACE, "GovernmentOrganization");
		GovernmentPermit = factory.createURI(SCHEMA.NAMESPACE, "GovernmentPermit");
		GovernmentService = factory.createURI(SCHEMA.NAMESPACE, "GovernmentService");
		greater = factory.createURI(SCHEMA.NAMESPACE, "greater");
		greaterOrEqual = factory.createURI(SCHEMA.NAMESPACE, "greaterOrEqual");
		GroceryStore = factory.createURI(SCHEMA.NAMESPACE, "GroceryStore");
		gtin13 = factory.createURI(SCHEMA.NAMESPACE, "gtin13");
		gtin14 = factory.createURI(SCHEMA.NAMESPACE, "gtin14");
		gtin8 = factory.createURI(SCHEMA.NAMESPACE, "gtin8");
		guideline = factory.createURI(SCHEMA.NAMESPACE, "guideline");
		guidelineDate = factory.createURI(SCHEMA.NAMESPACE, "guidelineDate");
		guidelineSubject = factory.createURI(SCHEMA.NAMESPACE, "guidelineSubject");
		HairSalon = factory.createURI(SCHEMA.NAMESPACE, "HairSalon");
		HardwareStore = factory.createURI(SCHEMA.NAMESPACE, "HardwareStore");
		hasDeliveryMethod = factory.createURI(SCHEMA.NAMESPACE, "hasDeliveryMethod");
		hasPOS = factory.createURI(SCHEMA.NAMESPACE, "hasPOS");
		headline = factory.createURI(SCHEMA.NAMESPACE, "headline");
		HealthAndBeautyBusiness = factory.createURI(SCHEMA.NAMESPACE, "HealthAndBeautyBusiness");
		HealthClub = factory.createURI(SCHEMA.NAMESPACE, "HealthClub");
		healthCondition = factory.createURI(SCHEMA.NAMESPACE, "healthCondition");
		height = factory.createURI(SCHEMA.NAMESPACE, "height");
		highPrice = factory.createURI(SCHEMA.NAMESPACE, "highPrice");
		HighSchool = factory.createURI(SCHEMA.NAMESPACE, "HighSchool");
		HinduTemple = factory.createURI(SCHEMA.NAMESPACE, "HinduTemple");
		hiringOrganization = factory.createURI(SCHEMA.NAMESPACE, "hiringOrganization");
		HobbyShop = factory.createURI(SCHEMA.NAMESPACE, "HobbyShop");
		HomeAndConstructionBusiness = factory.createURI(SCHEMA.NAMESPACE, "HomeAndConstructionBusiness");
		HomeGoodsStore = factory.createURI(SCHEMA.NAMESPACE, "HomeGoodsStore");
		homeLocation = factory.createURI(SCHEMA.NAMESPACE, "homeLocation");
		honorificPrefix = factory.createURI(SCHEMA.NAMESPACE, "honorificPrefix");
		honorificSuffix = factory.createURI(SCHEMA.NAMESPACE, "honorificSuffix");
		Hospital = factory.createURI(SCHEMA.NAMESPACE, "Hospital");
		hospitalAffiliation = factory.createURI(SCHEMA.NAMESPACE, "hospitalAffiliation");
		Hostel = factory.createURI(SCHEMA.NAMESPACE, "Hostel");
		Hotel = factory.createURI(SCHEMA.NAMESPACE, "Hotel");
		hoursAvailable = factory.createURI(SCHEMA.NAMESPACE, "hoursAvailable");
		HousePainter = factory.createURI(SCHEMA.NAMESPACE, "HousePainter");
		howPerformed = factory.createURI(SCHEMA.NAMESPACE, "howPerformed");
		HVACBusiness = factory.createURI(SCHEMA.NAMESPACE, "HVACBusiness");
		IceCreamShop = factory.createURI(SCHEMA.NAMESPACE, "IceCreamShop");
		identifyingExam = factory.createURI(SCHEMA.NAMESPACE, "identifyingExam");
		identifyingTest = factory.createURI(SCHEMA.NAMESPACE, "identifyingTest");
		IgnoreAction = factory.createURI(SCHEMA.NAMESPACE, "IgnoreAction");
		illustrator = factory.createURI(SCHEMA.NAMESPACE, "illustrator");
		image = factory.createURI(SCHEMA.NAMESPACE, "image");
		ImageGallery = factory.createURI(SCHEMA.NAMESPACE, "ImageGallery");
		ImageObject = factory.createURI(SCHEMA.NAMESPACE, "ImageObject");
		imagingTechnique = factory.createURI(SCHEMA.NAMESPACE, "imagingTechnique");
		ImagingTest = factory.createURI(SCHEMA.NAMESPACE, "ImagingTest");
		inAlbum = factory.createURI(SCHEMA.NAMESPACE, "inAlbum");
		incentives = factory.createURI(SCHEMA.NAMESPACE, "incentives");
		includedRiskFactor = factory.createURI(SCHEMA.NAMESPACE, "includedRiskFactor");
		includesObject = factory.createURI(SCHEMA.NAMESPACE, "includesObject");
		increasesRiskOf = factory.createURI(SCHEMA.NAMESPACE, "increasesRiskOf");
		indication = factory.createURI(SCHEMA.NAMESPACE, "indication");
		IndividualProduct = factory.createURI(SCHEMA.NAMESPACE, "IndividualProduct");
		industry = factory.createURI(SCHEMA.NAMESPACE, "industry");
		infectiousAgent = factory.createURI(SCHEMA.NAMESPACE, "infectiousAgent");
		InfectiousAgentClass = factory.createURI(SCHEMA.NAMESPACE, "InfectiousAgentClass");
		infectiousAgentClass = factory.createURI(SCHEMA.NAMESPACE, "infectiousAgentClass");
		InfectiousDisease = factory.createURI(SCHEMA.NAMESPACE, "InfectiousDisease");
		InformAction = factory.createURI(SCHEMA.NAMESPACE, "InformAction");
		ingredients = factory.createURI(SCHEMA.NAMESPACE, "ingredients");
		inLanguage = factory.createURI(SCHEMA.NAMESPACE, "inLanguage");
		inPlaylist = factory.createURI(SCHEMA.NAMESPACE, "inPlaylist");
		InsertAction = factory.createURI(SCHEMA.NAMESPACE, "InsertAction");
		insertion = factory.createURI(SCHEMA.NAMESPACE, "insertion");
		InstallAction = factory.createURI(SCHEMA.NAMESPACE, "InstallAction");
		installUrl = factory.createURI(SCHEMA.NAMESPACE, "installUrl");
		instrument = factory.createURI(SCHEMA.NAMESPACE, "instrument");
		InsuranceAgency = factory.createURI(SCHEMA.NAMESPACE, "InsuranceAgency");
		Intangible = factory.createURI(SCHEMA.NAMESPACE, "Intangible");
		intensity = factory.createURI(SCHEMA.NAMESPACE, "intensity");
		InteractAction = factory.createURI(SCHEMA.NAMESPACE, "InteractAction");
		interactingDrug = factory.createURI(SCHEMA.NAMESPACE, "interactingDrug");
		interactionCount = factory.createURI(SCHEMA.NAMESPACE, "interactionCount");
		interactivityType = factory.createURI(SCHEMA.NAMESPACE, "interactivityType");
		InternetCafe = factory.createURI(SCHEMA.NAMESPACE, "InternetCafe");
		inventoryLevel = factory.createURI(SCHEMA.NAMESPACE, "inventoryLevel");
		InviteAction = factory.createURI(SCHEMA.NAMESPACE, "InviteAction");
		isAccessoryOrSparePartFor = factory.createURI(SCHEMA.NAMESPACE, "isAccessoryOrSparePartFor");
		isAvailableGenerically = factory.createURI(SCHEMA.NAMESPACE, "isAvailableGenerically");
		isBasedOnUrl = factory.createURI(SCHEMA.NAMESPACE, "isBasedOnUrl");
		isbn = factory.createURI(SCHEMA.NAMESPACE, "isbn");
		isConsumableFor = factory.createURI(SCHEMA.NAMESPACE, "isConsumableFor");
		isFamilyFriendly = factory.createURI(SCHEMA.NAMESPACE, "isFamilyFriendly");
		isGift = factory.createURI(SCHEMA.NAMESPACE, "isGift");
		isicV4 = factory.createURI(SCHEMA.NAMESPACE, "isicV4");
		isPartOf = factory.createURI(SCHEMA.NAMESPACE, "isPartOf");
		isProprietary = factory.createURI(SCHEMA.NAMESPACE, "isProprietary");
		isRelatedTo = factory.createURI(SCHEMA.NAMESPACE, "isRelatedTo");
		isSimilarTo = factory.createURI(SCHEMA.NAMESPACE, "isSimilarTo");
		issuedBy = factory.createURI(SCHEMA.NAMESPACE, "issuedBy");
		issuedThrough = factory.createURI(SCHEMA.NAMESPACE, "issuedThrough");
		isVariantOf = factory.createURI(SCHEMA.NAMESPACE, "isVariantOf");
		ItemAvailability = factory.createURI(SCHEMA.NAMESPACE, "ItemAvailability");
		itemCondition = factory.createURI(SCHEMA.NAMESPACE, "itemCondition");
		ItemList = factory.createURI(SCHEMA.NAMESPACE, "ItemList");
		itemListElement = factory.createURI(SCHEMA.NAMESPACE, "itemListElement");
		itemListOrder = factory.createURI(SCHEMA.NAMESPACE, "itemListOrder");
		itemOffered = factory.createURI(SCHEMA.NAMESPACE, "itemOffered");
		ItemPage = factory.createURI(SCHEMA.NAMESPACE, "ItemPage");
		itemReviewed = factory.createURI(SCHEMA.NAMESPACE, "itemReviewed");
		itemShipped = factory.createURI(SCHEMA.NAMESPACE, "itemShipped");
		JewelryStore = factory.createURI(SCHEMA.NAMESPACE, "JewelryStore");
		jobLocation = factory.createURI(SCHEMA.NAMESPACE, "jobLocation");
		JobPosting = factory.createURI(SCHEMA.NAMESPACE, "JobPosting");
		jobTitle = factory.createURI(SCHEMA.NAMESPACE, "jobTitle");
		JoinAction = factory.createURI(SCHEMA.NAMESPACE, "JoinAction");
		Joint = factory.createURI(SCHEMA.NAMESPACE, "Joint");
		keywords = factory.createURI(SCHEMA.NAMESPACE, "keywords");
		knows = factory.createURI(SCHEMA.NAMESPACE, "knows");
		labelDetails = factory.createURI(SCHEMA.NAMESPACE, "labelDetails");
		LakeBodyOfWater = factory.createURI(SCHEMA.NAMESPACE, "LakeBodyOfWater");
		Landform = factory.createURI(SCHEMA.NAMESPACE, "Landform");
		landlord = factory.createURI(SCHEMA.NAMESPACE, "landlord");
		LandmarksOrHistoricalBuildings = factory.createURI(SCHEMA.NAMESPACE, "LandmarksOrHistoricalBuildings");
		language = factory.createURI(SCHEMA.NAMESPACE, "language");
		Language = factory.createURI(SCHEMA.NAMESPACE, "Language");
		lastReviewed = factory.createURI(SCHEMA.NAMESPACE, "lastReviewed");
		latitude = factory.createURI(SCHEMA.NAMESPACE, "latitude");
		learningResourceType = factory.createURI(SCHEMA.NAMESPACE, "learningResourceType");
		LeaveAction = factory.createURI(SCHEMA.NAMESPACE, "LeaveAction");
		legalName = factory.createURI(SCHEMA.NAMESPACE, "legalName");
		legalStatus = factory.createURI(SCHEMA.NAMESPACE, "legalStatus");
		LegislativeBuilding = factory.createURI(SCHEMA.NAMESPACE, "LegislativeBuilding");
		LendAction = factory.createURI(SCHEMA.NAMESPACE, "LendAction");
		lender = factory.createURI(SCHEMA.NAMESPACE, "lender");
		lesser = factory.createURI(SCHEMA.NAMESPACE, "lesser");
		lesserOrEqual = factory.createURI(SCHEMA.NAMESPACE, "lesserOrEqual");
		Library = factory.createURI(SCHEMA.NAMESPACE, "Library");
		LifestyleModification = factory.createURI(SCHEMA.NAMESPACE, "LifestyleModification");
		Ligament = factory.createURI(SCHEMA.NAMESPACE, "Ligament");
		LikeAction = factory.createURI(SCHEMA.NAMESPACE, "LikeAction");
		line = factory.createURI(SCHEMA.NAMESPACE, "line");
		LiquorStore = factory.createURI(SCHEMA.NAMESPACE, "LiquorStore");
		ListenAction = factory.createURI(SCHEMA.NAMESPACE, "ListenAction");
		LiteraryEvent = factory.createURI(SCHEMA.NAMESPACE, "LiteraryEvent");
		LocalBusiness = factory.createURI(SCHEMA.NAMESPACE, "LocalBusiness");
		location = factory.createURI(SCHEMA.NAMESPACE, "location");
		LockerDelivery = factory.createURI(SCHEMA.NAMESPACE, "LockerDelivery");
		Locksmith = factory.createURI(SCHEMA.NAMESPACE, "Locksmith");
		LodgingBusiness = factory.createURI(SCHEMA.NAMESPACE, "LodgingBusiness");
		logo = factory.createURI(SCHEMA.NAMESPACE, "logo");
		longitude = factory.createURI(SCHEMA.NAMESPACE, "longitude");
		LoseAction = factory.createURI(SCHEMA.NAMESPACE, "LoseAction");
		loser = factory.createURI(SCHEMA.NAMESPACE, "loser");
		lowPrice = factory.createURI(SCHEMA.NAMESPACE, "lowPrice");
		LymphaticVessel = factory.createURI(SCHEMA.NAMESPACE, "LymphaticVessel");
		mainContentOfPage = factory.createURI(SCHEMA.NAMESPACE, "mainContentOfPage");
		makesOffer = factory.createURI(SCHEMA.NAMESPACE, "makesOffer");
		manufacturer = factory.createURI(SCHEMA.NAMESPACE, "manufacturer");
		Map = factory.createURI(SCHEMA.NAMESPACE, "Map");
		map = factory.createURI(SCHEMA.NAMESPACE, "map");
		maps = factory.createURI(SCHEMA.NAMESPACE, "maps");
		MarryAction = factory.createURI(SCHEMA.NAMESPACE, "MarryAction");
		Mass = factory.createURI(SCHEMA.NAMESPACE, "Mass");
		MaximumDoseSchedule = factory.createURI(SCHEMA.NAMESPACE, "MaximumDoseSchedule");
		maximumIntake = factory.createURI(SCHEMA.NAMESPACE, "maximumIntake");
		maxPrice = factory.createURI(SCHEMA.NAMESPACE, "maxPrice");
		maxValue = factory.createURI(SCHEMA.NAMESPACE, "maxValue");
		mechanismOfAction = factory.createURI(SCHEMA.NAMESPACE, "mechanismOfAction");
		MediaObject = factory.createURI(SCHEMA.NAMESPACE, "MediaObject");
		MedicalAudience = factory.createURI(SCHEMA.NAMESPACE, "MedicalAudience");
		MedicalCause = factory.createURI(SCHEMA.NAMESPACE, "MedicalCause");
		MedicalClinic = factory.createURI(SCHEMA.NAMESPACE, "MedicalClinic");
		MedicalCode = factory.createURI(SCHEMA.NAMESPACE, "MedicalCode");
		MedicalCondition = factory.createURI(SCHEMA.NAMESPACE, "MedicalCondition");
		MedicalConditionStage = factory.createURI(SCHEMA.NAMESPACE, "MedicalConditionStage");
		MedicalContraindication = factory.createURI(SCHEMA.NAMESPACE, "MedicalContraindication");
		MedicalDevice = factory.createURI(SCHEMA.NAMESPACE, "MedicalDevice");
		MedicalDevicePurpose = factory.createURI(SCHEMA.NAMESPACE, "MedicalDevicePurpose");
		MedicalEntity = factory.createURI(SCHEMA.NAMESPACE, "MedicalEntity");
		MedicalEnumeration = factory.createURI(SCHEMA.NAMESPACE, "MedicalEnumeration");
		MedicalEvidenceLevel = factory.createURI(SCHEMA.NAMESPACE, "MedicalEvidenceLevel");
		MedicalGuideline = factory.createURI(SCHEMA.NAMESPACE, "MedicalGuideline");
		MedicalGuidelineContraindication = factory.createURI(SCHEMA.NAMESPACE, "MedicalGuidelineContraindication");
		MedicalGuidelineRecommendation = factory.createURI(SCHEMA.NAMESPACE, "MedicalGuidelineRecommendation");
		MedicalImagingTechnique = factory.createURI(SCHEMA.NAMESPACE, "MedicalImagingTechnique");
		MedicalIndication = factory.createURI(SCHEMA.NAMESPACE, "MedicalIndication");
		MedicalIntangible = factory.createURI(SCHEMA.NAMESPACE, "MedicalIntangible");
		MedicalObservationalStudy = factory.createURI(SCHEMA.NAMESPACE, "MedicalObservationalStudy");
		MedicalObservationalStudyDesign = factory.createURI(SCHEMA.NAMESPACE, "MedicalObservationalStudyDesign");
		MedicalOrganization = factory.createURI(SCHEMA.NAMESPACE, "MedicalOrganization");
		MedicalProcedure = factory.createURI(SCHEMA.NAMESPACE, "MedicalProcedure");
		MedicalProcedureType = factory.createURI(SCHEMA.NAMESPACE, "MedicalProcedureType");
		MedicalRiskCalculator = factory.createURI(SCHEMA.NAMESPACE, "MedicalRiskCalculator");
		MedicalRiskEstimator = factory.createURI(SCHEMA.NAMESPACE, "MedicalRiskEstimator");
		MedicalRiskFactor = factory.createURI(SCHEMA.NAMESPACE, "MedicalRiskFactor");
		MedicalRiskScore = factory.createURI(SCHEMA.NAMESPACE, "MedicalRiskScore");
		MedicalScholarlyArticle = factory.createURI(SCHEMA.NAMESPACE, "MedicalScholarlyArticle");
		MedicalSign = factory.createURI(SCHEMA.NAMESPACE, "MedicalSign");
		MedicalSignOrSymptom = factory.createURI(SCHEMA.NAMESPACE, "MedicalSignOrSymptom");
		MedicalSpecialty = factory.createURI(SCHEMA.NAMESPACE, "MedicalSpecialty");
		medicalSpecialty = factory.createURI(SCHEMA.NAMESPACE, "medicalSpecialty");
		MedicalStudy = factory.createURI(SCHEMA.NAMESPACE, "MedicalStudy");
		MedicalStudyStatus = factory.createURI(SCHEMA.NAMESPACE, "MedicalStudyStatus");
		MedicalSymptom = factory.createURI(SCHEMA.NAMESPACE, "MedicalSymptom");
		MedicalTest = factory.createURI(SCHEMA.NAMESPACE, "MedicalTest");
		MedicalTestPanel = factory.createURI(SCHEMA.NAMESPACE, "MedicalTestPanel");
		MedicalTherapy = factory.createURI(SCHEMA.NAMESPACE, "MedicalTherapy");
		MedicalTrial = factory.createURI(SCHEMA.NAMESPACE, "MedicalTrial");
		MedicalTrialDesign = factory.createURI(SCHEMA.NAMESPACE, "MedicalTrialDesign");
		MedicalWebPage = factory.createURI(SCHEMA.NAMESPACE, "MedicalWebPage");
		MedicineSystem = factory.createURI(SCHEMA.NAMESPACE, "MedicineSystem");
		medicineSystem = factory.createURI(SCHEMA.NAMESPACE, "medicineSystem");
		member = factory.createURI(SCHEMA.NAMESPACE, "member");
		memberOf = factory.createURI(SCHEMA.NAMESPACE, "memberOf");
		members = factory.createURI(SCHEMA.NAMESPACE, "members");
		memoryRequirements = factory.createURI(SCHEMA.NAMESPACE, "memoryRequirements");
		MensClothingStore = factory.createURI(SCHEMA.NAMESPACE, "MensClothingStore");
		mentions = factory.createURI(SCHEMA.NAMESPACE, "mentions");
		menu = factory.createURI(SCHEMA.NAMESPACE, "menu");
		merchant = factory.createURI(SCHEMA.NAMESPACE, "merchant");
		MiddleSchool = factory.createURI(SCHEMA.NAMESPACE, "MiddleSchool");
		minPrice = factory.createURI(SCHEMA.NAMESPACE, "minPrice");
		minValue = factory.createURI(SCHEMA.NAMESPACE, "minValue");
		MobileApplication = factory.createURI(SCHEMA.NAMESPACE, "MobileApplication");
		MobilePhoneStore = factory.createURI(SCHEMA.NAMESPACE, "MobilePhoneStore");
		model = factory.createURI(SCHEMA.NAMESPACE, "model");
		Mosque = factory.createURI(SCHEMA.NAMESPACE, "Mosque");
		Motel = factory.createURI(SCHEMA.NAMESPACE, "Motel");
		MotorcycleDealer = factory.createURI(SCHEMA.NAMESPACE, "MotorcycleDealer");
		MotorcycleRepair = factory.createURI(SCHEMA.NAMESPACE, "MotorcycleRepair");
		Mountain = factory.createURI(SCHEMA.NAMESPACE, "Mountain");
		MoveAction = factory.createURI(SCHEMA.NAMESPACE, "MoveAction");
		Movie = factory.createURI(SCHEMA.NAMESPACE, "Movie");
		MovieRentalStore = factory.createURI(SCHEMA.NAMESPACE, "MovieRentalStore");
		MovieTheater = factory.createURI(SCHEMA.NAMESPACE, "MovieTheater");
		MovingCompany = factory.createURI(SCHEMA.NAMESPACE, "MovingCompany");
		mpn = factory.createURI(SCHEMA.NAMESPACE, "mpn");
		Muscle = factory.createURI(SCHEMA.NAMESPACE, "Muscle");
		Museum = factory.createURI(SCHEMA.NAMESPACE, "Museum");
		MusicAlbum = factory.createURI(SCHEMA.NAMESPACE, "MusicAlbum");
		musicBy = factory.createURI(SCHEMA.NAMESPACE, "musicBy");
		MusicEvent = factory.createURI(SCHEMA.NAMESPACE, "MusicEvent");
		MusicGroup = factory.createURI(SCHEMA.NAMESPACE, "MusicGroup");
		musicGroupMember = factory.createURI(SCHEMA.NAMESPACE, "musicGroupMember");
		MusicPlaylist = factory.createURI(SCHEMA.NAMESPACE, "MusicPlaylist");
		MusicRecording = factory.createURI(SCHEMA.NAMESPACE, "MusicRecording");
		MusicStore = factory.createURI(SCHEMA.NAMESPACE, "MusicStore");
		MusicVenue = factory.createURI(SCHEMA.NAMESPACE, "MusicVenue");
		MusicVideoObject = factory.createURI(SCHEMA.NAMESPACE, "MusicVideoObject");
		naics = factory.createURI(SCHEMA.NAMESPACE, "naics");
		NailSalon = factory.createURI(SCHEMA.NAMESPACE, "NailSalon");
		name = factory.createURI(SCHEMA.NAMESPACE, "name");
		nationality = factory.createURI(SCHEMA.NAMESPACE, "nationality");
		naturalProgression = factory.createURI(SCHEMA.NAMESPACE, "naturalProgression");
		Nerve = factory.createURI(SCHEMA.NAMESPACE, "Nerve");
		nerve = factory.createURI(SCHEMA.NAMESPACE, "nerve");
		nerveMotor = factory.createURI(SCHEMA.NAMESPACE, "nerveMotor");
		NewsArticle = factory.createURI(SCHEMA.NAMESPACE, "NewsArticle");
		NGO = factory.createURI(SCHEMA.NAMESPACE, "NGO");
		NightClub = factory.createURI(SCHEMA.NAMESPACE, "NightClub");
		nonEqual = factory.createURI(SCHEMA.NAMESPACE, "nonEqual");
		nonProprietaryName = factory.createURI(SCHEMA.NAMESPACE, "nonProprietaryName");
		normalRange = factory.createURI(SCHEMA.NAMESPACE, "normalRange");
		Notary = factory.createURI(SCHEMA.NAMESPACE, "Notary");
		numberofEmployees = factory.createURI(SCHEMA.NAMESPACE, "numberofEmployees");
		numberOfEpisodes = factory.createURI(SCHEMA.NAMESPACE, "numberOfEpisodes");
		numberOfPages = factory.createURI(SCHEMA.NAMESPACE, "numberOfPages");
		numberOfSeasons = factory.createURI(SCHEMA.NAMESPACE, "numberOfSeasons");
		numTracks = factory.createURI(SCHEMA.NAMESPACE, "numTracks");
		nutrition = factory.createURI(SCHEMA.NAMESPACE, "nutrition");
		NutritionInformation = factory.createURI(SCHEMA.NAMESPACE, "NutritionInformation");
		object = factory.createURI(SCHEMA.NAMESPACE, "object");
		occupationalCategory = factory.createURI(SCHEMA.NAMESPACE, "occupationalCategory");
		OceanBodyOfWater = factory.createURI(SCHEMA.NAMESPACE, "OceanBodyOfWater");
		Offer = factory.createURI(SCHEMA.NAMESPACE, "Offer");
		offerCount = factory.createURI(SCHEMA.NAMESPACE, "offerCount");
		OfferItemCondition = factory.createURI(SCHEMA.NAMESPACE, "OfferItemCondition");
		offers = factory.createURI(SCHEMA.NAMESPACE, "offers");
		OfficeEquipmentStore = factory.createURI(SCHEMA.NAMESPACE, "OfficeEquipmentStore");
		OnDemandEvent = factory.createURI(SCHEMA.NAMESPACE, "OnDemandEvent");
		OnSitePickup = factory.createURI(SCHEMA.NAMESPACE, "OnSitePickup");
		openingHours = factory.createURI(SCHEMA.NAMESPACE, "openingHours");
		openingHoursSpecification = factory.createURI(SCHEMA.NAMESPACE, "openingHoursSpecification");
		OpeningHoursSpecification = factory.createURI(SCHEMA.NAMESPACE, "OpeningHoursSpecification");
		opens = factory.createURI(SCHEMA.NAMESPACE, "opens");
		operatingSystem = factory.createURI(SCHEMA.NAMESPACE, "operatingSystem");
		oponent = factory.createURI(SCHEMA.NAMESPACE, "oponent");
		Optician = factory.createURI(SCHEMA.NAMESPACE, "Optician");
		option = factory.createURI(SCHEMA.NAMESPACE, "option");
		Order = factory.createURI(SCHEMA.NAMESPACE, "Order");
		OrderAction = factory.createURI(SCHEMA.NAMESPACE, "OrderAction");
		orderDate = factory.createURI(SCHEMA.NAMESPACE, "orderDate");
		orderedItem = factory.createURI(SCHEMA.NAMESPACE, "orderedItem");
		orderNumber = factory.createURI(SCHEMA.NAMESPACE, "orderNumber");
		orderStatus = factory.createURI(SCHEMA.NAMESPACE, "orderStatus");
		OrderStatus = factory.createURI(SCHEMA.NAMESPACE, "OrderStatus");
		Organization = factory.createURI(SCHEMA.NAMESPACE, "Organization");
		OrganizeAction = factory.createURI(SCHEMA.NAMESPACE, "OrganizeAction");
		origin = factory.createURI(SCHEMA.NAMESPACE, "origin");
		originAddress = factory.createURI(SCHEMA.NAMESPACE, "originAddress");
		originatesFrom = factory.createURI(SCHEMA.NAMESPACE, "originatesFrom");
		outcome = factory.createURI(SCHEMA.NAMESPACE, "outcome");
		OutletStore = factory.createURI(SCHEMA.NAMESPACE, "OutletStore");
		overdosage = factory.createURI(SCHEMA.NAMESPACE, "overdosage");
		overview = factory.createURI(SCHEMA.NAMESPACE, "overview");
		ownedFrom = factory.createURI(SCHEMA.NAMESPACE, "ownedFrom");
		ownedThrough = factory.createURI(SCHEMA.NAMESPACE, "ownedThrough");
		OwnershipInfo = factory.createURI(SCHEMA.NAMESPACE, "OwnershipInfo");
		owns = factory.createURI(SCHEMA.NAMESPACE, "owns");
		PaintAction = factory.createURI(SCHEMA.NAMESPACE, "PaintAction");
		Painting = factory.createURI(SCHEMA.NAMESPACE, "Painting");
		PalliativeProcedure = factory.createURI(SCHEMA.NAMESPACE, "PalliativeProcedure");
		ParcelDelivery = factory.createURI(SCHEMA.NAMESPACE, "ParcelDelivery");
		ParcelService = factory.createURI(SCHEMA.NAMESPACE, "ParcelService");
		parent = factory.createURI(SCHEMA.NAMESPACE, "parent");
		ParentAudience = factory.createURI(SCHEMA.NAMESPACE, "ParentAudience");
		parents = factory.createURI(SCHEMA.NAMESPACE, "parents");
		parentService = factory.createURI(SCHEMA.NAMESPACE, "parentService");
		Park = factory.createURI(SCHEMA.NAMESPACE, "Park");
		ParkingFacility = factory.createURI(SCHEMA.NAMESPACE, "ParkingFacility");
		participant = factory.createURI(SCHEMA.NAMESPACE, "participant");
		partOfEpisode = factory.createURI(SCHEMA.NAMESPACE, "partOfEpisode");
		partOfOrder = factory.createURI(SCHEMA.NAMESPACE, "partOfOrder");
		partOfSeason = factory.createURI(SCHEMA.NAMESPACE, "partOfSeason");
		partOfSeries = factory.createURI(SCHEMA.NAMESPACE, "partOfSeries");
		partOfSystem = factory.createURI(SCHEMA.NAMESPACE, "partOfSystem");
		partOfTVSeries = factory.createURI(SCHEMA.NAMESPACE, "partOfTVSeries");
		PathologyTest = factory.createURI(SCHEMA.NAMESPACE, "PathologyTest");
		pathophysiology = factory.createURI(SCHEMA.NAMESPACE, "pathophysiology");
		PawnShop = factory.createURI(SCHEMA.NAMESPACE, "PawnShop");
		PayAction = factory.createURI(SCHEMA.NAMESPACE, "PayAction");
		paymentAccepted = factory.createURI(SCHEMA.NAMESPACE, "paymentAccepted");
		PaymentChargeSpecification = factory.createURI(SCHEMA.NAMESPACE, "PaymentChargeSpecification");
		paymentDue = factory.createURI(SCHEMA.NAMESPACE, "paymentDue");
		paymentMethod = factory.createURI(SCHEMA.NAMESPACE, "paymentMethod");
		PaymentMethod = factory.createURI(SCHEMA.NAMESPACE, "PaymentMethod");
		paymentMethodId = factory.createURI(SCHEMA.NAMESPACE, "paymentMethodId");
		paymentUrl = factory.createURI(SCHEMA.NAMESPACE, "paymentUrl");
		PeopleAudience = factory.createURI(SCHEMA.NAMESPACE, "PeopleAudience");
		PerformAction = factory.createURI(SCHEMA.NAMESPACE, "PerformAction");
		performer = factory.createURI(SCHEMA.NAMESPACE, "performer");
		performerIn = factory.createURI(SCHEMA.NAMESPACE, "performerIn");
		performers = factory.createURI(SCHEMA.NAMESPACE, "performers");
		PerformingArtsTheater = factory.createURI(SCHEMA.NAMESPACE, "PerformingArtsTheater");
		PerformingGroup = factory.createURI(SCHEMA.NAMESPACE, "PerformingGroup");
		permissions = factory.createURI(SCHEMA.NAMESPACE, "permissions");
		Permit = factory.createURI(SCHEMA.NAMESPACE, "Permit");
		permitAudience = factory.createURI(SCHEMA.NAMESPACE, "permitAudience");
		Person = factory.createURI(SCHEMA.NAMESPACE, "Person");
		PetStore = factory.createURI(SCHEMA.NAMESPACE, "PetStore");
		Pharmacy = factory.createURI(SCHEMA.NAMESPACE, "Pharmacy");
		phase = factory.createURI(SCHEMA.NAMESPACE, "phase");
		photo = factory.createURI(SCHEMA.NAMESPACE, "photo");
		Photograph = factory.createURI(SCHEMA.NAMESPACE, "Photograph");
		PhotographAction = factory.createURI(SCHEMA.NAMESPACE, "PhotographAction");
		photos = factory.createURI(SCHEMA.NAMESPACE, "photos");
		PhysicalActivity = factory.createURI(SCHEMA.NAMESPACE, "PhysicalActivity");
		PhysicalActivityCategory = factory.createURI(SCHEMA.NAMESPACE, "PhysicalActivityCategory");
		PhysicalExam = factory.createURI(SCHEMA.NAMESPACE, "PhysicalExam");
		PhysicalTherapy = factory.createURI(SCHEMA.NAMESPACE, "PhysicalTherapy");
		Physician = factory.createURI(SCHEMA.NAMESPACE, "Physician");
		physiologicalBenefits = factory.createURI(SCHEMA.NAMESPACE, "physiologicalBenefits");
		Place = factory.createURI(SCHEMA.NAMESPACE, "Place");
		PlaceOfWorship = factory.createURI(SCHEMA.NAMESPACE, "PlaceOfWorship");
		PlanAction = factory.createURI(SCHEMA.NAMESPACE, "PlanAction");
		PlayAction = factory.createURI(SCHEMA.NAMESPACE, "PlayAction");
		playerType = factory.createURI(SCHEMA.NAMESPACE, "playerType");
		Playground = factory.createURI(SCHEMA.NAMESPACE, "Playground");
		Plumber = factory.createURI(SCHEMA.NAMESPACE, "Plumber");
		PoliceStation = factory.createURI(SCHEMA.NAMESPACE, "PoliceStation");
		polygon = factory.createURI(SCHEMA.NAMESPACE, "polygon");
		Pond = factory.createURI(SCHEMA.NAMESPACE, "Pond");
		population = factory.createURI(SCHEMA.NAMESPACE, "population");
		position = factory.createURI(SCHEMA.NAMESPACE, "position");
		possibleComplication = factory.createURI(SCHEMA.NAMESPACE, "possibleComplication");
		possibleTreatment = factory.createURI(SCHEMA.NAMESPACE, "possibleTreatment");
		PostalAddress = factory.createURI(SCHEMA.NAMESPACE, "PostalAddress");
		postalCode = factory.createURI(SCHEMA.NAMESPACE, "postalCode");
		PostOffice = factory.createURI(SCHEMA.NAMESPACE, "PostOffice");
		postOfficeBoxNumber = factory.createURI(SCHEMA.NAMESPACE, "postOfficeBoxNumber");
		postOp = factory.createURI(SCHEMA.NAMESPACE, "postOp");
		predecessorOf = factory.createURI(SCHEMA.NAMESPACE, "predecessorOf");
		pregnancyCategory = factory.createURI(SCHEMA.NAMESPACE, "pregnancyCategory");
		pregnancyWarning = factory.createURI(SCHEMA.NAMESPACE, "pregnancyWarning");
		preOp = factory.createURI(SCHEMA.NAMESPACE, "preOp");
		preparation = factory.createURI(SCHEMA.NAMESPACE, "preparation");
		PrependAction = factory.createURI(SCHEMA.NAMESPACE, "PrependAction");
		prepTime = factory.createURI(SCHEMA.NAMESPACE, "prepTime");
		Preschool = factory.createURI(SCHEMA.NAMESPACE, "Preschool");
		prescribingInfo = factory.createURI(SCHEMA.NAMESPACE, "prescribingInfo");
		prescriptionStatus = factory.createURI(SCHEMA.NAMESPACE, "prescriptionStatus");
		PreventionIndication = factory.createURI(SCHEMA.NAMESPACE, "PreventionIndication");
		previousStartDate = factory.createURI(SCHEMA.NAMESPACE, "previousStartDate");
		price = factory.createURI(SCHEMA.NAMESPACE, "price");
		priceCurrency = factory.createURI(SCHEMA.NAMESPACE, "priceCurrency");
		priceRange = factory.createURI(SCHEMA.NAMESPACE, "priceRange");
		priceSpecification = factory.createURI(SCHEMA.NAMESPACE, "priceSpecification");
		PriceSpecification = factory.createURI(SCHEMA.NAMESPACE, "PriceSpecification");
		priceType = factory.createURI(SCHEMA.NAMESPACE, "priceType");
		priceValidUntil = factory.createURI(SCHEMA.NAMESPACE, "priceValidUntil");
		primaryImageOfPage = factory.createURI(SCHEMA.NAMESPACE, "primaryImageOfPage");
		primaryPrevention = factory.createURI(SCHEMA.NAMESPACE, "primaryPrevention");
		printColumn = factory.createURI(SCHEMA.NAMESPACE, "printColumn");
		printEdition = factory.createURI(SCHEMA.NAMESPACE, "printEdition");
		printPage = factory.createURI(SCHEMA.NAMESPACE, "printPage");
		printSection = factory.createURI(SCHEMA.NAMESPACE, "printSection");
		procedure = factory.createURI(SCHEMA.NAMESPACE, "procedure");
		procedureType = factory.createURI(SCHEMA.NAMESPACE, "procedureType");
		processingTime = factory.createURI(SCHEMA.NAMESPACE, "processingTime");
		processorRequirements = factory.createURI(SCHEMA.NAMESPACE, "processorRequirements");
		producer = factory.createURI(SCHEMA.NAMESPACE, "producer");
		produces = factory.createURI(SCHEMA.NAMESPACE, "produces");
		Product = factory.createURI(SCHEMA.NAMESPACE, "Product");
		productID = factory.createURI(SCHEMA.NAMESPACE, "productID");
		productionCompany = factory.createURI(SCHEMA.NAMESPACE, "productionCompany");
		ProductModel = factory.createURI(SCHEMA.NAMESPACE, "ProductModel");
		productSupported = factory.createURI(SCHEMA.NAMESPACE, "productSupported");
		ProfessionalService = factory.createURI(SCHEMA.NAMESPACE, "ProfessionalService");
		proficiencyLevel = factory.createURI(SCHEMA.NAMESPACE, "proficiencyLevel");
		ProfilePage = factory.createURI(SCHEMA.NAMESPACE, "ProfilePage");
		programmingLanguage = factory.createURI(SCHEMA.NAMESPACE, "programmingLanguage");
		programmingModel = factory.createURI(SCHEMA.NAMESPACE, "programmingModel");
		Property = factory.createURI(SCHEMA.NAMESPACE, "Property");
		proprietaryName = factory.createURI(SCHEMA.NAMESPACE, "proprietaryName");
		proteinContent = factory.createURI(SCHEMA.NAMESPACE, "proteinContent");
		provider = factory.createURI(SCHEMA.NAMESPACE, "provider");
		providesService = factory.createURI(SCHEMA.NAMESPACE, "providesService");
		PsychologicalTreatment = factory.createURI(SCHEMA.NAMESPACE, "PsychologicalTreatment");
		publication = factory.createURI(SCHEMA.NAMESPACE, "publication");
		PublicationEvent = factory.createURI(SCHEMA.NAMESPACE, "PublicationEvent");
		publicationType = factory.createURI(SCHEMA.NAMESPACE, "publicationType");
		PublicSwimmingPool = factory.createURI(SCHEMA.NAMESPACE, "PublicSwimmingPool");
		publishedOn = factory.createURI(SCHEMA.NAMESPACE, "publishedOn");
		publisher = factory.createURI(SCHEMA.NAMESPACE, "publisher");
		publishingPrinciples = factory.createURI(SCHEMA.NAMESPACE, "publishingPrinciples");
		purpose = factory.createURI(SCHEMA.NAMESPACE, "purpose");
		qualifications = factory.createURI(SCHEMA.NAMESPACE, "qualifications");
		QualitativeValue = factory.createURI(SCHEMA.NAMESPACE, "QualitativeValue");
		QuantitativeValue = factory.createURI(SCHEMA.NAMESPACE, "QuantitativeValue");
		Quantity = factory.createURI(SCHEMA.NAMESPACE, "Quantity");
		query = factory.createURI(SCHEMA.NAMESPACE, "query");
		question = factory.createURI(SCHEMA.NAMESPACE, "question");
		QuoteAction = factory.createURI(SCHEMA.NAMESPACE, "QuoteAction");
		RadiationTherapy = factory.createURI(SCHEMA.NAMESPACE, "RadiationTherapy");
		RadioClip = factory.createURI(SCHEMA.NAMESPACE, "RadioClip");
		RadioEpisode = factory.createURI(SCHEMA.NAMESPACE, "RadioEpisode");
		RadioSeason = factory.createURI(SCHEMA.NAMESPACE, "RadioSeason");
		RadioSeries = factory.createURI(SCHEMA.NAMESPACE, "RadioSeries");
		RadioStation = factory.createURI(SCHEMA.NAMESPACE, "RadioStation");
		rangeIncludes = factory.createURI(SCHEMA.NAMESPACE, "rangeIncludes");
		Rating = factory.createURI(SCHEMA.NAMESPACE, "Rating");
		ratingCount = factory.createURI(SCHEMA.NAMESPACE, "ratingCount");
		ratingValue = factory.createURI(SCHEMA.NAMESPACE, "ratingValue");
		ReactAction = factory.createURI(SCHEMA.NAMESPACE, "ReactAction");
		ReadAction = factory.createURI(SCHEMA.NAMESPACE, "ReadAction");
		RealEstateAgent = factory.createURI(SCHEMA.NAMESPACE, "RealEstateAgent");
		realEstateAgent = factory.createURI(SCHEMA.NAMESPACE, "realEstateAgent");
		ReceiveAction = factory.createURI(SCHEMA.NAMESPACE, "ReceiveAction");
		Recipe = factory.createURI(SCHEMA.NAMESPACE, "Recipe");
		recipe = factory.createURI(SCHEMA.NAMESPACE, "recipe");
		recipeCategory = factory.createURI(SCHEMA.NAMESPACE, "recipeCategory");
		recipeCuisine = factory.createURI(SCHEMA.NAMESPACE, "recipeCuisine");
		recipeInstructions = factory.createURI(SCHEMA.NAMESPACE, "recipeInstructions");
		recipeYield = factory.createURI(SCHEMA.NAMESPACE, "recipeYield");
		recipient = factory.createURI(SCHEMA.NAMESPACE, "recipient");
		recognizingAuthority = factory.createURI(SCHEMA.NAMESPACE, "recognizingAuthority");
		recommendationStrength = factory.createURI(SCHEMA.NAMESPACE, "recommendationStrength");
		RecommendedDoseSchedule = factory.createURI(SCHEMA.NAMESPACE, "RecommendedDoseSchedule");
		recommendedIntake = factory.createURI(SCHEMA.NAMESPACE, "recommendedIntake");
		RecyclingCenter = factory.createURI(SCHEMA.NAMESPACE, "RecyclingCenter");
		regionDrained = factory.createURI(SCHEMA.NAMESPACE, "regionDrained");
		regionsAllowed = factory.createURI(SCHEMA.NAMESPACE, "regionsAllowed");
		RegisterAction = factory.createURI(SCHEMA.NAMESPACE, "RegisterAction");
		RejectAction = factory.createURI(SCHEMA.NAMESPACE, "RejectAction");
		relatedAnatomy = factory.createURI(SCHEMA.NAMESPACE, "relatedAnatomy");
		relatedCondition = factory.createURI(SCHEMA.NAMESPACE, "relatedCondition");
		relatedDrug = factory.createURI(SCHEMA.NAMESPACE, "relatedDrug");
		relatedLink = factory.createURI(SCHEMA.NAMESPACE, "relatedLink");
		relatedStructure = factory.createURI(SCHEMA.NAMESPACE, "relatedStructure");
		relatedTherapy = factory.createURI(SCHEMA.NAMESPACE, "relatedTherapy");
		relatedTo = factory.createURI(SCHEMA.NAMESPACE, "relatedTo");
		releaseDate = factory.createURI(SCHEMA.NAMESPACE, "releaseDate");
		releaseNotes = factory.createURI(SCHEMA.NAMESPACE, "releaseNotes");
		relevantSpecialty = factory.createURI(SCHEMA.NAMESPACE, "relevantSpecialty");
		RentAction = factory.createURI(SCHEMA.NAMESPACE, "RentAction");
		repetitions = factory.createURI(SCHEMA.NAMESPACE, "repetitions");
		ReplaceAction = factory.createURI(SCHEMA.NAMESPACE, "ReplaceAction");
		replacee = factory.createURI(SCHEMA.NAMESPACE, "replacee");
		replacer = factory.createURI(SCHEMA.NAMESPACE, "replacer");
		ReplyAction = factory.createURI(SCHEMA.NAMESPACE, "ReplyAction");
		replyToUrl = factory.createURI(SCHEMA.NAMESPACE, "replyToUrl");
		ReportedDoseSchedule = factory.createURI(SCHEMA.NAMESPACE, "ReportedDoseSchedule");
		representativeOfPage = factory.createURI(SCHEMA.NAMESPACE, "representativeOfPage");
		requiredGender = factory.createURI(SCHEMA.NAMESPACE, "requiredGender");
		requiredMaxAge = factory.createURI(SCHEMA.NAMESPACE, "requiredMaxAge");
		requiredMinAge = factory.createURI(SCHEMA.NAMESPACE, "requiredMinAge");
		requirements = factory.createURI(SCHEMA.NAMESPACE, "requirements");
		requiresSubscription = factory.createURI(SCHEMA.NAMESPACE, "requiresSubscription");
		ReserveAction = factory.createURI(SCHEMA.NAMESPACE, "ReserveAction");
		Reservoir = factory.createURI(SCHEMA.NAMESPACE, "Reservoir");
		Residence = factory.createURI(SCHEMA.NAMESPACE, "Residence");
		responsibilities = factory.createURI(SCHEMA.NAMESPACE, "responsibilities");
		Restaurant = factory.createURI(SCHEMA.NAMESPACE, "Restaurant");
		restPeriods = factory.createURI(SCHEMA.NAMESPACE, "restPeriods");
		result = factory.createURI(SCHEMA.NAMESPACE, "result");
		resultReview = factory.createURI(SCHEMA.NAMESPACE, "resultReview");
		ReturnAction = factory.createURI(SCHEMA.NAMESPACE, "ReturnAction");
		Review = factory.createURI(SCHEMA.NAMESPACE, "Review");
		review = factory.createURI(SCHEMA.NAMESPACE, "review");
		ReviewAction = factory.createURI(SCHEMA.NAMESPACE, "ReviewAction");
		reviewBody = factory.createURI(SCHEMA.NAMESPACE, "reviewBody");
		reviewCount = factory.createURI(SCHEMA.NAMESPACE, "reviewCount");
		reviewedBy = factory.createURI(SCHEMA.NAMESPACE, "reviewedBy");
		reviewRating = factory.createURI(SCHEMA.NAMESPACE, "reviewRating");
		reviews = factory.createURI(SCHEMA.NAMESPACE, "reviews");
		riskFactor = factory.createURI(SCHEMA.NAMESPACE, "riskFactor");
		risks = factory.createURI(SCHEMA.NAMESPACE, "risks");
		RiverBodyOfWater = factory.createURI(SCHEMA.NAMESPACE, "RiverBodyOfWater");
		RoofingContractor = factory.createURI(SCHEMA.NAMESPACE, "RoofingContractor");
		RsvpAction = factory.createURI(SCHEMA.NAMESPACE, "RsvpAction");
		runsTo = factory.createURI(SCHEMA.NAMESPACE, "runsTo");
		runtime = factory.createURI(SCHEMA.NAMESPACE, "runtime");
		RVPark = factory.createURI(SCHEMA.NAMESPACE, "RVPark");
		safetyConsideration = factory.createURI(SCHEMA.NAMESPACE, "safetyConsideration");
		salaryCurrency = factory.createURI(SCHEMA.NAMESPACE, "salaryCurrency");
		SaleEvent = factory.createURI(SCHEMA.NAMESPACE, "SaleEvent");
		sameAs = factory.createURI(SCHEMA.NAMESPACE, "sameAs");
		sampleType = factory.createURI(SCHEMA.NAMESPACE, "sampleType");
		saturatedFatContent = factory.createURI(SCHEMA.NAMESPACE, "saturatedFatContent");
		ScheduleAction = factory.createURI(SCHEMA.NAMESPACE, "ScheduleAction");
		scheduledTime = factory.createURI(SCHEMA.NAMESPACE, "scheduledTime");
		ScholarlyArticle = factory.createURI(SCHEMA.NAMESPACE, "ScholarlyArticle");
		School = factory.createURI(SCHEMA.NAMESPACE, "School");
		screenshot = factory.createURI(SCHEMA.NAMESPACE, "screenshot");
		Sculpture = factory.createURI(SCHEMA.NAMESPACE, "Sculpture");
		SeaBodyOfWater = factory.createURI(SCHEMA.NAMESPACE, "SeaBodyOfWater");
		SearchAction = factory.createURI(SCHEMA.NAMESPACE, "SearchAction");
		SearchResultsPage = factory.createURI(SCHEMA.NAMESPACE, "SearchResultsPage");
		season = factory.createURI(SCHEMA.NAMESPACE, "season");
		Season = factory.createURI(SCHEMA.NAMESPACE, "Season");
		seasonNumber = factory.createURI(SCHEMA.NAMESPACE, "seasonNumber");
		seasons = factory.createURI(SCHEMA.NAMESPACE, "seasons");
		secondaryPrevention = factory.createURI(SCHEMA.NAMESPACE, "secondaryPrevention");
		seeks = factory.createURI(SCHEMA.NAMESPACE, "seeks");
		SelfStorage = factory.createURI(SCHEMA.NAMESPACE, "SelfStorage");
		SellAction = factory.createURI(SCHEMA.NAMESPACE, "SellAction");
		seller = factory.createURI(SCHEMA.NAMESPACE, "seller");
		SendAction = factory.createURI(SCHEMA.NAMESPACE, "SendAction");
		sender = factory.createURI(SCHEMA.NAMESPACE, "sender");
		sensoryUnit = factory.createURI(SCHEMA.NAMESPACE, "sensoryUnit");
		serialNumber = factory.createURI(SCHEMA.NAMESPACE, "serialNumber");
		Series = factory.createURI(SCHEMA.NAMESPACE, "Series");
		seriousAdverseOutcome = factory.createURI(SCHEMA.NAMESPACE, "seriousAdverseOutcome");
		servesCuisine = factory.createURI(SCHEMA.NAMESPACE, "servesCuisine");
		Service = factory.createURI(SCHEMA.NAMESPACE, "Service");
		serviceArea = factory.createURI(SCHEMA.NAMESPACE, "serviceArea");
		serviceAudience = factory.createURI(SCHEMA.NAMESPACE, "serviceAudience");
		ServiceChannel = factory.createURI(SCHEMA.NAMESPACE, "ServiceChannel");
		serviceLocation = factory.createURI(SCHEMA.NAMESPACE, "serviceLocation");
		serviceOperator = factory.createURI(SCHEMA.NAMESPACE, "serviceOperator");
		servicePhone = factory.createURI(SCHEMA.NAMESPACE, "servicePhone");
		servicePostalAddress = factory.createURI(SCHEMA.NAMESPACE, "servicePostalAddress");
		serviceSmsNumber = factory.createURI(SCHEMA.NAMESPACE, "serviceSmsNumber");
		serviceType = factory.createURI(SCHEMA.NAMESPACE, "serviceType");
		serviceUrl = factory.createURI(SCHEMA.NAMESPACE, "serviceUrl");
		servingSize = factory.createURI(SCHEMA.NAMESPACE, "servingSize");
		ShareAction = factory.createURI(SCHEMA.NAMESPACE, "ShareAction");
		ShoeStore = factory.createURI(SCHEMA.NAMESPACE, "ShoeStore");
		ShoppingCenter = factory.createURI(SCHEMA.NAMESPACE, "ShoppingCenter");
		sibling = factory.createURI(SCHEMA.NAMESPACE, "sibling");
		siblings = factory.createURI(SCHEMA.NAMESPACE, "siblings");
		signDetected = factory.createURI(SCHEMA.NAMESPACE, "signDetected");
		significance = factory.createURI(SCHEMA.NAMESPACE, "significance");
		significantLink = factory.createURI(SCHEMA.NAMESPACE, "significantLink");
		significantLinks = factory.createURI(SCHEMA.NAMESPACE, "significantLinks");
		signOrSymptom = factory.createURI(SCHEMA.NAMESPACE, "signOrSymptom");
		SingleFamilyResidence = factory.createURI(SCHEMA.NAMESPACE, "SingleFamilyResidence");
		SiteNavigationElement = factory.createURI(SCHEMA.NAMESPACE, "SiteNavigationElement");
		skills = factory.createURI(SCHEMA.NAMESPACE, "skills");
		SkiResort = factory.createURI(SCHEMA.NAMESPACE, "SkiResort");
		sku = factory.createURI(SCHEMA.NAMESPACE, "sku");
		SocialEvent = factory.createURI(SCHEMA.NAMESPACE, "SocialEvent");
		sodiumContent = factory.createURI(SCHEMA.NAMESPACE, "sodiumContent");
		SoftwareApplication = factory.createURI(SCHEMA.NAMESPACE, "SoftwareApplication");
		softwareVersion = factory.createURI(SCHEMA.NAMESPACE, "softwareVersion");
		SomeProducts = factory.createURI(SCHEMA.NAMESPACE, "SomeProducts");
		source = factory.createURI(SCHEMA.NAMESPACE, "source");
		sourcedFrom = factory.createURI(SCHEMA.NAMESPACE, "sourcedFrom");
		sourceOrganization = factory.createURI(SCHEMA.NAMESPACE, "sourceOrganization");
		spatial = factory.createURI(SCHEMA.NAMESPACE, "spatial");
		specialCommitments = factory.createURI(SCHEMA.NAMESPACE, "specialCommitments");
		specialty = factory.createURI(SCHEMA.NAMESPACE, "specialty");
		Specialty = factory.createURI(SCHEMA.NAMESPACE, "Specialty");
		sponsor = factory.createURI(SCHEMA.NAMESPACE, "sponsor");
		SportingGoodsStore = factory.createURI(SCHEMA.NAMESPACE, "SportingGoodsStore");
		sportsActivityLocation = factory.createURI(SCHEMA.NAMESPACE, "sportsActivityLocation");
		SportsActivityLocation = factory.createURI(SCHEMA.NAMESPACE, "SportsActivityLocation");
		SportsClub = factory.createURI(SCHEMA.NAMESPACE, "SportsClub");
		SportsEvent = factory.createURI(SCHEMA.NAMESPACE, "SportsEvent");
		sportsEvent = factory.createURI(SCHEMA.NAMESPACE, "sportsEvent");
		SportsTeam = factory.createURI(SCHEMA.NAMESPACE, "SportsTeam");
		sportsTeam = factory.createURI(SCHEMA.NAMESPACE, "sportsTeam");
		spouse = factory.createURI(SCHEMA.NAMESPACE, "spouse");
		StadiumOrArena = factory.createURI(SCHEMA.NAMESPACE, "StadiumOrArena");
		stage = factory.createURI(SCHEMA.NAMESPACE, "stage");
		stageAsNumber = factory.createURI(SCHEMA.NAMESPACE, "stageAsNumber");
		startDate = factory.createURI(SCHEMA.NAMESPACE, "startDate");
		startTime = factory.createURI(SCHEMA.NAMESPACE, "startTime");
		State = factory.createURI(SCHEMA.NAMESPACE, "State");
		status = factory.createURI(SCHEMA.NAMESPACE, "status");
		storageRequirements = factory.createURI(SCHEMA.NAMESPACE, "storageRequirements");
		Store = factory.createURI(SCHEMA.NAMESPACE, "Store");
		streetAddress = factory.createURI(SCHEMA.NAMESPACE, "streetAddress");
		strengthUnit = factory.createURI(SCHEMA.NAMESPACE, "strengthUnit");
		strengthValue = factory.createURI(SCHEMA.NAMESPACE, "strengthValue");
		structuralClass = factory.createURI(SCHEMA.NAMESPACE, "structuralClass");
		StructuredValue = factory.createURI(SCHEMA.NAMESPACE, "StructuredValue");
		study = factory.createURI(SCHEMA.NAMESPACE, "study");
		studyDesign = factory.createURI(SCHEMA.NAMESPACE, "studyDesign");
		studyLocation = factory.createURI(SCHEMA.NAMESPACE, "studyLocation");
		studySubject = factory.createURI(SCHEMA.NAMESPACE, "studySubject");
		subEvent = factory.createURI(SCHEMA.NAMESPACE, "subEvent");
		subEvents = factory.createURI(SCHEMA.NAMESPACE, "subEvents");
		subOrganization = factory.createURI(SCHEMA.NAMESPACE, "subOrganization");
		SubscribeAction = factory.createURI(SCHEMA.NAMESPACE, "SubscribeAction");
		subStageSuffix = factory.createURI(SCHEMA.NAMESPACE, "subStageSuffix");
		subStructure = factory.createURI(SCHEMA.NAMESPACE, "subStructure");
		subTest = factory.createURI(SCHEMA.NAMESPACE, "subTest");
		subtype = factory.createURI(SCHEMA.NAMESPACE, "subtype");
		SubwayStation = factory.createURI(SCHEMA.NAMESPACE, "SubwayStation");
		successorOf = factory.createURI(SCHEMA.NAMESPACE, "successorOf");
		sugarContent = factory.createURI(SCHEMA.NAMESPACE, "sugarContent");
		suggestedGender = factory.createURI(SCHEMA.NAMESPACE, "suggestedGender");
		suggestedMaxAge = factory.createURI(SCHEMA.NAMESPACE, "suggestedMaxAge");
		suggestedMinAge = factory.createURI(SCHEMA.NAMESPACE, "suggestedMinAge");
		superEvent = factory.createURI(SCHEMA.NAMESPACE, "superEvent");
		SuperficialAnatomy = factory.createURI(SCHEMA.NAMESPACE, "SuperficialAnatomy");
		supplyTo = factory.createURI(SCHEMA.NAMESPACE, "supplyTo");
		Synagogue = factory.createURI(SCHEMA.NAMESPACE, "Synagogue");
		Table = factory.createURI(SCHEMA.NAMESPACE, "Table");
		TakeAction = factory.createURI(SCHEMA.NAMESPACE, "TakeAction");
		targetDescription = factory.createURI(SCHEMA.NAMESPACE, "targetDescription");
		targetName = factory.createURI(SCHEMA.NAMESPACE, "targetName");
		targetPlatform = factory.createURI(SCHEMA.NAMESPACE, "targetPlatform");
		targetPopulation = factory.createURI(SCHEMA.NAMESPACE, "targetPopulation");
		targetProduct = factory.createURI(SCHEMA.NAMESPACE, "targetProduct");
		targetUrl = factory.createURI(SCHEMA.NAMESPACE, "targetUrl");
		TattooParlor = factory.createURI(SCHEMA.NAMESPACE, "TattooParlor");
		taxID = factory.createURI(SCHEMA.NAMESPACE, "taxID");
		TaxiStand = factory.createURI(SCHEMA.NAMESPACE, "TaxiStand");
		TechArticle = factory.createURI(SCHEMA.NAMESPACE, "TechArticle");
		telephone = factory.createURI(SCHEMA.NAMESPACE, "telephone");
		TelevisionStation = factory.createURI(SCHEMA.NAMESPACE, "TelevisionStation");
		temporal = factory.createURI(SCHEMA.NAMESPACE, "temporal");
		TennisComplex = factory.createURI(SCHEMA.NAMESPACE, "TennisComplex");
		text = factory.createURI(SCHEMA.NAMESPACE, "text");
		TheaterEvent = factory.createURI(SCHEMA.NAMESPACE, "TheaterEvent");
		TheaterGroup = factory.createURI(SCHEMA.NAMESPACE, "TheaterGroup");
		TherapeuticProcedure = factory.createURI(SCHEMA.NAMESPACE, "TherapeuticProcedure");
		Thing = factory.createURI(SCHEMA.NAMESPACE, "Thing");
		thumbnail = factory.createURI(SCHEMA.NAMESPACE, "thumbnail");
		thumbnailUrl = factory.createURI(SCHEMA.NAMESPACE, "thumbnailUrl");
		tickerSymbol = factory.createURI(SCHEMA.NAMESPACE, "tickerSymbol");
		TieAction = factory.createURI(SCHEMA.NAMESPACE, "TieAction");
		timeRequired = factory.createURI(SCHEMA.NAMESPACE, "timeRequired");
		TipAction = factory.createURI(SCHEMA.NAMESPACE, "TipAction");
		TireShop = factory.createURI(SCHEMA.NAMESPACE, "TireShop");
		tissueSample = factory.createURI(SCHEMA.NAMESPACE, "tissueSample");
		title = factory.createURI(SCHEMA.NAMESPACE, "title");
		toLocation = factory.createURI(SCHEMA.NAMESPACE, "toLocation");
		totalTime = factory.createURI(SCHEMA.NAMESPACE, "totalTime");
		TouristAttraction = factory.createURI(SCHEMA.NAMESPACE, "TouristAttraction");
		TouristInformationCenter = factory.createURI(SCHEMA.NAMESPACE, "TouristInformationCenter");
		ToyStore = factory.createURI(SCHEMA.NAMESPACE, "ToyStore");
		track = factory.createURI(SCHEMA.NAMESPACE, "track");
		TrackAction = factory.createURI(SCHEMA.NAMESPACE, "TrackAction");
		trackingNumber = factory.createURI(SCHEMA.NAMESPACE, "trackingNumber");
		trackingUrl = factory.createURI(SCHEMA.NAMESPACE, "trackingUrl");
		tracks = factory.createURI(SCHEMA.NAMESPACE, "tracks");
		TradeAction = factory.createURI(SCHEMA.NAMESPACE, "TradeAction");
		trailer = factory.createURI(SCHEMA.NAMESPACE, "trailer");
		TrainStation = factory.createURI(SCHEMA.NAMESPACE, "TrainStation");
		transcript = factory.createURI(SCHEMA.NAMESPACE, "transcript");
		transFatContent = factory.createURI(SCHEMA.NAMESPACE, "transFatContent");
		TransferAction = factory.createURI(SCHEMA.NAMESPACE, "TransferAction");
		transmissionMethod = factory.createURI(SCHEMA.NAMESPACE, "transmissionMethod");
		TravelAction = factory.createURI(SCHEMA.NAMESPACE, "TravelAction");
		TravelAgency = factory.createURI(SCHEMA.NAMESPACE, "TravelAgency");
		TreatmentIndication = factory.createURI(SCHEMA.NAMESPACE, "TreatmentIndication");
		trialDesign = factory.createURI(SCHEMA.NAMESPACE, "trialDesign");
		tributary = factory.createURI(SCHEMA.NAMESPACE, "tributary");
		TVClip = factory.createURI(SCHEMA.NAMESPACE, "TVClip");
		TVEpisode = factory.createURI(SCHEMA.NAMESPACE, "TVEpisode");
		TVSeason = factory.createURI(SCHEMA.NAMESPACE, "TVSeason");
		TVSeries = factory.createURI(SCHEMA.NAMESPACE, "TVSeries");
		TypeAndQuantityNode = factory.createURI(SCHEMA.NAMESPACE, "TypeAndQuantityNode");
		typeOfGood = factory.createURI(SCHEMA.NAMESPACE, "typeOfGood");
		typicalAgeRange = factory.createURI(SCHEMA.NAMESPACE, "typicalAgeRange");
		typicalTest = factory.createURI(SCHEMA.NAMESPACE, "typicalTest");
		unitCode = factory.createURI(SCHEMA.NAMESPACE, "unitCode");
		UnitPriceSpecification = factory.createURI(SCHEMA.NAMESPACE, "UnitPriceSpecification");
		UnRegisterAction = factory.createURI(SCHEMA.NAMESPACE, "UnRegisterAction");
		unsaturatedFatContent = factory.createURI(SCHEMA.NAMESPACE, "unsaturatedFatContent");
		UpdateAction = factory.createURI(SCHEMA.NAMESPACE, "UpdateAction");
		uploadDate = factory.createURI(SCHEMA.NAMESPACE, "uploadDate");
		url = factory.createURI(SCHEMA.NAMESPACE, "url");
		UseAction = factory.createURI(SCHEMA.NAMESPACE, "UseAction");
		usedToDiagnose = factory.createURI(SCHEMA.NAMESPACE, "usedToDiagnose");
		UserBlocks = factory.createURI(SCHEMA.NAMESPACE, "UserBlocks");
		UserCheckins = factory.createURI(SCHEMA.NAMESPACE, "UserCheckins");
		UserComments = factory.createURI(SCHEMA.NAMESPACE, "UserComments");
		UserDownloads = factory.createURI(SCHEMA.NAMESPACE, "UserDownloads");
		UserInteraction = factory.createURI(SCHEMA.NAMESPACE, "UserInteraction");
		UserLikes = factory.createURI(SCHEMA.NAMESPACE, "UserLikes");
		UserPageVisits = factory.createURI(SCHEMA.NAMESPACE, "UserPageVisits");
		UserPlays = factory.createURI(SCHEMA.NAMESPACE, "UserPlays");
		UserPlusOnes = factory.createURI(SCHEMA.NAMESPACE, "UserPlusOnes");
		UserTweets = factory.createURI(SCHEMA.NAMESPACE, "UserTweets");
		usesDevice = factory.createURI(SCHEMA.NAMESPACE, "usesDevice");
		validFor = factory.createURI(SCHEMA.NAMESPACE, "validFor");
		validFrom = factory.createURI(SCHEMA.NAMESPACE, "validFrom");
		validIn = factory.createURI(SCHEMA.NAMESPACE, "validIn");
		validThrough = factory.createURI(SCHEMA.NAMESPACE, "validThrough");
		validUntil = factory.createURI(SCHEMA.NAMESPACE, "validUntil");
		value = factory.createURI(SCHEMA.NAMESPACE, "value");
		valueAddedTaxIncluded = factory.createURI(SCHEMA.NAMESPACE, "valueAddedTaxIncluded");
		valueReference = factory.createURI(SCHEMA.NAMESPACE, "valueReference");
		vatID = factory.createURI(SCHEMA.NAMESPACE, "vatID");
		Vein = factory.createURI(SCHEMA.NAMESPACE, "Vein");
		vendor = factory.createURI(SCHEMA.NAMESPACE, "vendor");
		version = factory.createURI(SCHEMA.NAMESPACE, "version");
		Vessel = factory.createURI(SCHEMA.NAMESPACE, "Vessel");
		VeterinaryCare = factory.createURI(SCHEMA.NAMESPACE, "VeterinaryCare");
		video = factory.createURI(SCHEMA.NAMESPACE, "video");
		videoFrameSize = factory.createURI(SCHEMA.NAMESPACE, "videoFrameSize");
		VideoGallery = factory.createURI(SCHEMA.NAMESPACE, "VideoGallery");
		VideoObject = factory.createURI(SCHEMA.NAMESPACE, "VideoObject");
		videoQuality = factory.createURI(SCHEMA.NAMESPACE, "videoQuality");
		ViewAction = factory.createURI(SCHEMA.NAMESPACE, "ViewAction");
		VisualArtsEvent = factory.createURI(SCHEMA.NAMESPACE, "VisualArtsEvent");
		Volcano = factory.createURI(SCHEMA.NAMESPACE, "Volcano");
		VoteAction = factory.createURI(SCHEMA.NAMESPACE, "VoteAction");
		WantAction = factory.createURI(SCHEMA.NAMESPACE, "WantAction");
		warning = factory.createURI(SCHEMA.NAMESPACE, "warning");
		warranty = factory.createURI(SCHEMA.NAMESPACE, "warranty");
		WarrantyPromise = factory.createURI(SCHEMA.NAMESPACE, "WarrantyPromise");
		warrantyPromise = factory.createURI(SCHEMA.NAMESPACE, "warrantyPromise");
		WarrantyScope = factory.createURI(SCHEMA.NAMESPACE, "WarrantyScope");
		warrantyScope = factory.createURI(SCHEMA.NAMESPACE, "warrantyScope");
		WatchAction = factory.createURI(SCHEMA.NAMESPACE, "WatchAction");
		Waterfall = factory.createURI(SCHEMA.NAMESPACE, "Waterfall");
		WearAction = factory.createURI(SCHEMA.NAMESPACE, "WearAction");
		WebApplication = factory.createURI(SCHEMA.NAMESPACE, "WebApplication");
		WebPage = factory.createURI(SCHEMA.NAMESPACE, "WebPage");
		WebPageElement = factory.createURI(SCHEMA.NAMESPACE, "WebPageElement");
		weight = factory.createURI(SCHEMA.NAMESPACE, "weight");
		WholesaleStore = factory.createURI(SCHEMA.NAMESPACE, "WholesaleStore");
		width = factory.createURI(SCHEMA.NAMESPACE, "width");
		WinAction = factory.createURI(SCHEMA.NAMESPACE, "WinAction");
		Winery = factory.createURI(SCHEMA.NAMESPACE, "Winery");
		winner = factory.createURI(SCHEMA.NAMESPACE, "winner");
		wordCount = factory.createURI(SCHEMA.NAMESPACE, "wordCount");
		workHours = factory.createURI(SCHEMA.NAMESPACE, "workHours");
		workload = factory.createURI(SCHEMA.NAMESPACE, "workload");
		workLocation = factory.createURI(SCHEMA.NAMESPACE, "workLocation");
		worksFor = factory.createURI(SCHEMA.NAMESPACE, "worksFor");
		worstRating = factory.createURI(SCHEMA.NAMESPACE, "worstRating");
		WPAdBlock = factory.createURI(SCHEMA.NAMESPACE, "WPAdBlock");
		WPFooter = factory.createURI(SCHEMA.NAMESPACE, "WPFooter");
		WPHeader = factory.createURI(SCHEMA.NAMESPACE, "WPHeader");
		WPSideBar = factory.createURI(SCHEMA.NAMESPACE, "WPSideBar");
		WriteAction = factory.createURI(SCHEMA.NAMESPACE, "WriteAction");
		yearlyRevenue = factory.createURI(SCHEMA.NAMESPACE, "yearlyRevenue");
		yearsInOperation = factory.createURI(SCHEMA.NAMESPACE, "yearsInOperation");
		Zoo = factory.createURI(SCHEMA.NAMESPACE, "Zoo");
	}

	private SCHEMA() {
		//static access only
	}

}
