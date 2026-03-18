import java.util.Scanner;

// public class DartCodeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENU =====");
        System.out.println("1. Calculator");
        System.out.println("2. Even or Odd");
        System.out.println("3. Food Menu");
        System.out.println("4. Multiplication Table");
        System.out.println("5. Student Profile UI");
        System.out.println("6. Login Page UI");
        System.out.println("7. List View");
        System.out.println("8. Button Tap");
        System.out.println("9. Slider");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("""
import 'dart:io'; // Required for taking input from user

void main() {
  // Asking user for first number
  print('Enter first number:');
  int num1 = int.parse(stdin.readLineSync()!); // Convert input to int

  // Asking user for second number
  print('Enter second number:');
  int num2 = int.parse(stdin.readLineSync()!); // Convert input to int

  // Calculating sum
  int sum = num1 + num2;

  // Displaying result
  print('The sum of $num1 and $num2 is $sum');
}
""");
                break;

            case 2:
                System.out.println("""
import 'dart:io'; // for user input
void main() {
  // Taking number from user
  print('Enter a number:');
  int num = int.parse(stdin.readLineSync()!);
  // Checking condition using if-else
  if (num % 2 == 0) {
    print('$num is Even.');
  } else {
    print('$num is Odd.');
  }
}
""");
                break;

            case 3:
                System.out.println("""
import 'dart:io'; // for user input
void main() {
  print('Enter a number between 1 and 3:');
  int choice = int.parse(stdin.readLineSync()!);
  switch (choice) {
    case 1:
      print('You selected One');
      break;
    case 2:
      print('You selected Two');
      break;
    case 3:
      print('You selected Three');
      break;
    default:
      print('Invalid choice! Please enter 1, 2, or 3.');
  }
}
""");
                break;

            case 4:
                System.out.println("""
import 'dart:io';  // to take input from user
void main() {
  // ask user to enter a number
  print('Enter a number:');
  int num = int.parse(stdin.readLineSync()!);
  print('Multiplication Table of $num');
  // for loop to print table from 1 to 10
  for (int i = 1; i <= 10; i++) {
    print('$num × $i = ${num * i}');
  }
}
""");
                break;

            case 5:
                System.out.println("""
import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      title: "My Simple App",
      theme: ThemeData(
        primarySwatch: Colors.green,
      ),
      home: const HomePage(),
    ),
  );
}

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Hello SYIT"),
      ),
      body: const Center(
        child: Column(
          mainAxisSize: MainAxisSize.min,  
      children: [
            Text(
          
              "Hello SYIT!!",
              style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),

            SizedBox(height: 10),

            Text(
              "My Name is Gauri",
              style: TextStyle(fontSize: 20),
            ),

            Text(
              "Roll Number:- 150",
              style: TextStyle(fontSize: 20),
            ),
          ],
        ),
      ),
    );
  }
}
""");
                break;

            case 6:
                System.out.println("""
import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    home: Scaffold(
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const TextField(
              decoration: InputDecoration(
                hintText: 'Username',
                border: OutlineInputBorder(),
              ),
            ),
            const SizedBox(height: 12),
            const TextField(
              obscureText: true,
              decoration: InputDecoration(
                hintText: 'Password',
                border: OutlineInputBorder(),
              ),
            ),
            const SizedBox(height: 16),
            ElevatedButton(
              onPressed: () {},
              child: const Text('Login'),
            ),
          ],
        ),
      ),
    ),
  ));
}
""");
                break;

            case 7:
                System.out.println("""
import 'package:flutter/material.dart';

void main() {
  runApp(const MaterialApp(
    home: ItemList(),
  ));
}

class ItemList extends StatelessWidget {
  const ItemList({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('ListView Example')),
      body: ListView(
        children: const [
          ListTile(title: Text('Apple')),
          Divider(),
          ListTile(title: Text('Banana')),
          Divider(),
          ListTile(title: Text('Mango')),
          Divider(),
          ListTile(title: Text('Orange')),
        ],
      ),
    );
  }
}
""");
                break;

            case 8:
                System.out.println("""
import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(home: TapExample()));
}

class TapExample extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: GestureDetector(
          onTap: () {
            print('Container tapped!');
          },
          child: Container(
            width: 150,
            height: 150,
            color: Colors.blue,
            child: const Center(
              child: Text(
                'Tap me',
                style: TextStyle(color: Colors.white, fontSize: 18),
              ),
            ),
          ),
        ),
      ),
    );
  }
}
""");
                break;

            case 9:
                System.out.println("""
import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(home: SliderApp()));
}

class SliderApp extends StatefulWidget {
  @override
  State<SliderApp> createState() => _SliderAppState();
}

class _SliderAppState extends State<SliderApp> {
  double value = 50;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Slider(
              value: value,
              min: 0,
              max: 100,
              onChanged: (v) => setState(() => value = v),
            ),
            Text('Value: ${value.round()}'),
          ],
        ),
      ),
    );
  }
}
""");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    // }
}
