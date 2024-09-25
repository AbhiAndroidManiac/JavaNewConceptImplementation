package org.example.Concurrency;

/**
 *          **Wiki Definition of the Concurrency**
 *In computer science, concurrency is the ability of different parts or units of a program,
 * algorithm, or problem to be executed out-of-order or in partial order,
 * without affecting the outcome.
 * This allows for parallel execution of the concurrent units,
 * which can significantly improve overall speed of the execution in multi-processor
 * and multi-core systems. In more technical terms,
 * concurrency refers to the decomposability of a program, algorithm, or
 * problem into order-independent or partially-ordered components or units of computation.
 *
 * Further explored through the link https://en.wikipedia.org/wiki/Concurrency_(computer_science)
 *
 *
 * //Something about the thread of Java which enables concurrency
 * Threads are sometimes called lightweight processes.
 * Both processes and threads provide an execution environment,
 * but creating a new thread requires fewer resources than creating a new process.
 *
 * Threads exist within a process — every process has at least one.
 * Threads share the process's resources, including memory and open files.
 * This makes for efficient, but potentially problematic, communication.
 *
 * Multithreaded execution is an essential feature of the Java platform.
 * Every application has at least one thread — or several,
 * if you count "system" threads that do things like memory management and signal handling.
 * But from the application programmer's point of view, you start with just one thread,
 * called the main thread.
 *
 *
 **/