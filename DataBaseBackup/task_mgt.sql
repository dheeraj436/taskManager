-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 09, 2019 at 09:23 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `task_mgt`
--

-- --------------------------------------------------------

--
-- Table structure for table `label`
--

CREATE TABLE IF NOT EXISTS `label` (
`id` bigint(20) NOT NULL,
  `del_flag` tinyint(1) NOT NULL,
  `label_description` varchar(255) DEFAULT NULL,
  `label_name` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `label`
--

INSERT INTO `label` (`id`, `del_flag`, `label_description`, `label_name`) VALUES
(1, 0, 'FOr Testing', 'Label 1'),
(2, 0, 'For Testing 2', 'Label 2');

-- --------------------------------------------------------

--
-- Table structure for table `task`
--

CREATE TABLE IF NOT EXISTS `task` (
`id` bigint(20) NOT NULL,
  `del_flag` tinyint(1) NOT NULL,
  `priority` int(11) NOT NULL,
  `task_assign_date` date NOT NULL,
  `task_description` varchar(255) NOT NULL,
  `task_name` varchar(255) NOT NULL,
  `label_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `task`
--

INSERT INTO `task` (`id`, `del_flag`, `priority`, `task_assign_date`, `task_description`, `task_name`, `label_id`) VALUES
(1, 0, 1, '2019-04-09', 'You Should Run 2 KM Daily', 'Running 2 km', 1),
(2, 0, 1, '2019-04-09', 'You Should Run 2 KM Daily', 'Running 2 km', 2),
(5, 0, 1, '2019-04-10', 'You Should Run 3 KM Daily', 'Running 3 km', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `label`
--
ALTER TABLE `label`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `task`
--
ALTER TABLE `task`
 ADD PRIMARY KEY (`id`), ADD KEY `FKcvxhsvaa4b0eqvoknwdjoqb8e` (`label_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `label`
--
ALTER TABLE `label`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `task`
--
ALTER TABLE `task`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `task`
--
ALTER TABLE `task`
ADD CONSTRAINT `FKcvxhsvaa4b0eqvoknwdjoqb8e` FOREIGN KEY (`label_id`) REFERENCES `label` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
