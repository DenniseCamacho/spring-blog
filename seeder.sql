USE spring_blog_db;

# Seed posts table
INSERT INTO posts (title, body, tags, id)
VALUES ('Dogs > Cats', 'I used to be a cat person, but then I raised a puppy.', '#CatsAreOkToo', 1);

#Seed post_images table
INSERT INTO post_images (id, image_title, url)
VALUES (1, 'title1','https://images.pexels.com/photos/39317/chihuahua-dog-puppy-cute-39317.jpeg'),
       (1, 'title2','https://images.pexels.com/photos/2023384/pexels-photo-2023384.jpeg'),
       (1, 'title3','https://images.pexels.com/photos/1805164/pexels-photo-1805164.jpeg');
