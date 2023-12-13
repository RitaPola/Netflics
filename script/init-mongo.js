db.createUser(
    {
        user: "user",
        pwd: "user",
        roles: [
            {
                role: "readWrite",
                db: "netflics"
            }
        ]
    }
);

db.actors.insertMany([
    { name: "Leonardo DiCaprio", nationality: "American", dateOfBirth: "1974-11-11" },
    { name: "Ellen Page", nationality: "Canadian", dateOfBirth: "1987-02-21" },
    { name: "Tom Hardy", nationality: "British", dateOfBirth: "1977-09-15" },
    { name: "Joseph Gordon-Levitt", nationality: "American", dateOfBirth: "1981-02-17" },
    { name: "Cillian Murphy", nationality: "Irish", dateOfBirth: "1976-05-25" },
    { name: "Robert Downey Jr.", nationality: "American", dateOfBirth: "1965-04-04" },
    { name: "Chris Evans", nationality: "American", dateOfBirth: "1981-06-13" },
    { name: "Mark Ruffalo", nationality: "American", dateOfBirth: "1967-11-22" },
    { name: "Chris Hemsworth", nationality: "Australian", dateOfBirth: "1983-08-11" },
    { name: "Scarlett Johansson", nationality: "American", dateOfBirth: "1984-11-22" },
    { name: "Jeremy Renner", nationality: "American", dateOfBirth: "1971-01-07" }
    
]);


const leonardoId = db.actors.findOne({ name: "Leonardo DiCaprio" })._id;
const ellenId = db.actors.findOne({ name: "Ellen Page" })._id;
const tomId = db.actors.findOne({ name: "Tom Hardy" })._id;
const josephId = db.actors.findOne({ name: "Joseph Gordon-Levitt" })._id;
const cillianId = db.actors.findOne({ name: "Cillian Murphy" })._id;
const robertDowneyJrId = db.actors.findOne({ name: "Robert Downey Jr." })._id;
const chrisEvansId = db.actors.findOne({ name: "Chris Evans" })._id;
const markRuffaloId = db.actors.findOne({ name: "Mark Ruffalo" })._id;
const chrisHemsworthId = db.actors.findOne({ name: "Chris Hemsworth" })._id;
const scarlettJohanssonId = db.actors.findOne({ name: "Scarlett Johansson" })._id;
const jeremyRennerId = db.actors.findOne({ name: "Jeremy Renner" })._id;

db.imgs.insertMany([
    { filename: 'InceptionImage', url: 'https://ik.imagekit.io/jg9pnrwhq/inceptionImage.jpg?updatedAt=1697014391057' },
    { filename: 'dunkirkImage', url: 'https://ik.imagekit.io/jg9pnrwhq/dunkirk%20image.jpg?updatedAt=1697014398779' },
    { filename: 'junoImage', url: 'https://ik.imagekit.io/jg9pnrwhq/juno%20image.jpg?updatedAt=1697014405383' },
    { filename: 'theDarkKnightRisesImage', url: 'https://ik.imagekit.io/jg9pnrwhq/il%20cavaliere%20oscuro%20img.jpg?updatedAt=1697014411469' },
    { filename: 'theRevenantImage', url: 'https://ik.imagekit.io/jg9pnrwhq/the%20revenant%20img.jpg?updatedAt=1697014376818' },
    { filename: 'avengersImage', url: 'https://ik.imagekit.io/jg9pnrwhq/avengers.jpg?updatedAt=1697014609514' },
    { filename: 'titanicImage', url: 'https://ik.imagekit.io/jg9pnrwhq/titanic%20image.jpg?updatedAt=1697014590377' },
    { filename: 'shutterIslandImage', url: 'https://ik.imagekit.io/jg9pnrwhq/shutter%20island.jpg?updatedAt=1697014597877' },
    { filename: 'oppenheimerImage', url: 'https://ik.imagekit.io/jg9pnrwhq/oppheneimer%20image.jpg?updatedAt=1697014585958' } 
]);

const inceptionImage = db.imgs.findOne({ filename: 'InceptionImage' })._id;
const dunkirkImage = db.imgs.findOne({ filename: 'dunkirkImage' })._id;
const junoImage = db.imgs.findOne({ filename: 'junoImage' })._id;
const theDarkKnightRisesImage = db.imgs.findOne({ filename: 'theDarkKnightRisesImage' })._id;
const theRevenantImage = db.imgs.findOne({ filename: 'theRevenantImage' })._id;
const avengersImage = db.imgs.findOne({ filename: 'avengersImage' })._id;
const titanicImage = db.imgs.findOne({ filename: 'titanicImage' })._id;
const shutterIslandImage = db.imgs.findOne({ filename: 'shutterIslandImage' })._id;
const oppenheimerImage = db.imgs.findOne({ filename: 'oppenheimerImage' })._id; 


db.trailer.insertMany([
    {
        movie_trailer: "inceptionTrailer", 
        video_url: "https://www.youtube.com/watch?v=BV7z0I90MJk"
    },
	{
        movie_trailer: "dunkirkTrailer", 
        video_url: "https://www.youtube.com/watch?v=gYQ1d3Rgo5w"
    },
	{
        movie_trailer: "junoTrailer", 
        video_url: "https://www.youtube.com/watch?v=ldEt22KEKhU"
    },
	{
        movie_trailer: "theDarkKnightRisesTrailer", 
        video_url: "https://www.youtube.com/watch?v=UwU4WpPRSvA"
    },
    {
        movie_trailer: "theRevenantTrailer", 
        video_url: "https://www.youtube.com/watch?v=xrctuMnFDc4"
    },  
	{
        movie_trailer: "avengersTrailer", 
        video_url: "https://www.youtube.com/watch?v=21-RSDPmLjg"
    },
	{
        movie_trailer: "titanicaTrailer", 
        video_url: "https://www.youtube.com/watch?v=IhTpfdA8EJU"
    },
	{
        movie_trailer: "shutterIslandTrailer", 
        video_url: "https://www.youtube.com/watch?v=mzkVNB3FpSQ"
    },
	{
        movie_trailer: "oppenheimerTrailer", 
        video_url: "https://www.youtube.com/watch?v=AByfwXr_JXs"
    },
]);


const inceptionTrailer = db.trailer.findOne({ movie_trailer: 'inceptionTrailer' })._id;
const dunkirkTrailer = db.trailer.findOne({ movie_trailer: 'dunkirkTrailer' })._id;
const junoTrailer = db.trailer.findOne({ movie_trailer: 'junoTrailer' })._id;
const theDarkKnightRisesTrailer = db.trailer.findOne({ movie_trailer: 'theDarkKnightRisesTrailer' })._id;
const theRevenantTrailer = db.trailer.findOne({ movie_trailer: 'theRevenantTrailer' })._id;
const avengersTrailer = db.trailer.findOne({ movie_trailer: 'avengersTrailer' })._id;
const titanicTrailer = db.trailer.findOne({ movie_trailer: 'titanicaTrailer' })._id; 
const shutterIslandTrailer = db.trailer.findOne({ movie_trailer: 'shutterIslandTrailer' })._id;
const oppenheimerTrailer = db.trailer.findOne({ movie_trailer: 'oppenheimerTrailer' })._id;

db.movies.insertMany([
    {
        title: "Inception",
        img: inceptionImage,
        year: 2010,
        actors: [leonardoId, ellenId, tomId, josephId, cillianId],
		trailer: inceptionTrailer
    },
    {
        title: "Dunkirk",
        img: dunkirkImage,
        year: 2017,
        actors: [tomId, cillianId],
		trailer: dunkirkTrailer
    },
    {
        title: "Juno",
        img: junoImage,
        year: 2007,
        actors: [ellenId],
		trailer: junoTrailer
    },
    {
        title: "The Dark Knight Rises",
        img: theDarkKnightRisesImage,
        year: 2012,
        actors: [leonardoId, tomId],
		trailer: theDarkKnightRisesTrailer
    },
    {
        title: "The Revenant",
        img: theRevenantImage,
        year: 2015,
        actors: [leonardoId, tomId],
		trailer: theRevenantTrailer
    },
    {
        title: "Avengers",
        img: avengersImage,
        year: 2012,
        actors: [robertDowneyJrId, chrisEvansId, markRuffaloId, chrisHemsworthId, scarlettJohanssonId, jeremyRennerId],
		trailer: avengersTrailer
    },
    {
        title: "Titanic",
        img: titanicImage,
        year: 1997,
        actors: [leonardoId],
		trailer: titanicTrailer
    },
    {
        title: "Shutter Island",
        img: shutterIslandImage,
        year: 2010,
        actors: [leonardoId],
        trailer: shutterIslandTrailer		
    },
    {
        title: "Oppenheimer",
        img: oppenheimerImage,
        year: 2023, 
        actors: [cillianId],
        trailer: oppenheimerTrailer		
    }
]);